# Groovy App

A small Groovy command-line application built with Gradle. When you run it, the app prints some basic environment details, echoes any command-line arguments you pass in, and demonstrates a simple helper method with a Spock test.

## What it does

- Prints the current Java version
- Prints the current Groovy version
- Prints the working directory
- Shows any arguments passed to the app
- Demonstrates a simple `MathHelper.add()` method

## Requirements

- Java installed and available on your `PATH`
- A Unix-like shell or Windows terminal

The Gradle Wrapper is included, so you do not need Gradle installed globally.

## Run the app

```bash
./gradlew run
```

To pass arguments:

```bash
./gradlew run --args='hello world'
```

## Run the tests
It runs with Spock

```bash
./gradlew test
```

## Project structure

```text
src/
  main/groovy/com/example/Main.groovy
  test/groovy/com/example/MathHelperTest.groovy
```

## Main files

- [build.gradle](build.gradle) configures the Groovy plugin, the application entry point, and Spock test support.
- [src/main/groovy/com/example/Main.groovy](src/main/groovy/com/example/Main.groovy) contains the app entry point and the `MathHelper` class.
- [src/test/groovy/com/example/MathHelperTest.groovy](src/test/groovy/com/example/MathHelperTest.groovy) contains the Spock tests.

## Example output

```text
=== Welcome to my Groovy Application ===
Java Version: 21
Groovy Version: 4.0.x
Working Directory: /path/to/project

No arguments passed. Try: gradle run --args='hello world'

5 + 3 = 8
```