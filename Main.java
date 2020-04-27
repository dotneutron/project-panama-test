import dev.mandelbrot.mandelbrot_lib;

import static dev.mandelbrot.mandelbrot_lib.*;

public class Main {
    public static final int MAX_ITERATIONS = 2048;
    public static final int NUM_OF_POINTS = 1000;

    public static double[] linspace(double start, double end, int n) {
        double[] values = new double[n];
        
        for (int i = 0; i < n; i++) {
            values[i] = i * (end - start) / (n - 1) + start;
        }

        return values;
    }

    public static void main(String... args) {
        var realValues = linspace(-2.0d, 1.0d, NUM_OF_POINTS);
        var imagValues = linspace(-1.0d, 1.0d, NUM_OF_POINTS);
        var result = new int[NUM_OF_POINTS * NUM_OF_POINTS];
        
        try (var scope = mandelbrot_lib.scope().fork()) {
            var start = System.currentTimeMillis();
            for (int i = 0; i < NUM_OF_POINTS; i++) {
                for (int j = 0; j < NUM_OF_POINTS; j++) {
                    result[NUM_OF_POINTS * i + j] = computeEscapeIteration(realValues[j], imagValues[i], MAX_ITERATIONS);
                }
            }
            var end = System.currentTimeMillis();
            System.out.println(String.format("Time elapsed: %d", end - start));
        }
    }
}
