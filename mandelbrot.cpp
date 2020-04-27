#include <complex>
#include "mandelbrot.h"

int computeEscapeIteration(double real, double imag, int maxIterations) {
    std::complex<double> z(0.0, 0.0);
    std::complex<double> c(real, imag);

    for (int i = 0; i < maxIterations; i++) {
        z = z * z + c;
        if (z.real() * z.real() + z.imag() * z.imag() > 4) {
            return i;
        }
    }

    return maxIterations - 1;
}
