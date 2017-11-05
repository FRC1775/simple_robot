# Super-simple Robot

For teaching purposes.

## Overview

We're using git tags to show a progression, from a single source file, to using imports, to packages and beyond. Checkout the tagged versions in turn, or examine diffs of sequential tags:

    git checkout v0.1
    git diff v0.2

tag | what's covered
--- | ---
v0.1 | A **single source file** that logs the Gyro angle
v0.2 | Single file with **anonymous inner class** for Command
v0.3 | **Separate source file** for GyroLogger command class
v0.4 | Moving the command class to a `commands` **sub-package**

## Hardware

This code can be deployed to a RoboRio, but currently only the `ADXRS450_Gyro` is utilized. This provides an absolute minimum of code and hardware that can still demostrate the full software-hardware build path.

## Building

We're using [GradleRIO](https://github.com/Open-RIO/GradleRIO) to build and deploy. On mac (or linux):

    ./gradlew build
    ./gradlew deploy

On Windows (in Powershell),

	.\gradlew.bat build
	.\gradlew.bat deploy

There's some issue with `gradlew` not finding the RobioRio initially. As a work-around, add `--info` (my guess is that the added delay of logging to stdout is giving Gradle enough time to find the new connection).

 ## Roadmap

 * Integrate log4j. Currently seems that GradleRIO isn't copying the Log4j JARs to the Rio
 * add more hardware (USB camera, say)
