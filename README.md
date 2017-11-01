# Super-simple Robot

For teaching purposes.

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
 * Use git tags to show the evolution of the robot code into subclasses, modules, etc.
 
 	
