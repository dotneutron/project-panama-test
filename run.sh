#!/bin/sh

javac -cp mandelbrot.jar Main.java
java -cp mandelbrot.jar:. Main
