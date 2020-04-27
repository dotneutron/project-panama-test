# Closing the gap between JVM and native APIs

This is a test for the early-access version of [Project Panama](https://openjdk.java.net/projects/panama/).

* Platform: Ubuntu 20.04

* Dependencies: build-essential (should suffice)

The naming convention for shared libraries is OS dependent afaik, so you'll have to tweak some things if you're running on Windows / macOS.

## Download Early-Acess Build
```sh
$ chmod +x download.sh && ./download.sh
```
Place the resulting directory somewhere on your path.

(You can get binaries for Windows / macOS from [here](https://jdk.java.net/panama/))

## Build
```sh
$ chmod +x build.sh && ./build.sh
```

## Run
```sh
$ chmod +x run.sh && ./run.sh
```

Check out more examples & details [here](https://hg.openjdk.java.net/panama/dev/raw-file/841483f2887f/doc/panama_foreign.html).
