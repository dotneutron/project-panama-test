#!/bin/sh

g++ -fpic -shared -o libmandelbrot.so mandelbrot.cpp
jextract -t dev.mandelbrot -L . -lmandelbrot --record-library-path mandelbrot.h -o mandelbrot.jar
