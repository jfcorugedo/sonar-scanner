# sonar-scanner

Sample project that shows how to mesure test coverage even when you are using PowerMock, that instruments the JVM and changes bytecode.

To see the total coverage just run `mvn clean install` followed by `mvn sonar:sonar` with a local sonar started.

Or you can also analyze jacoco.exec file with IntelliJ or with Jacoco Eclipse plugin.
