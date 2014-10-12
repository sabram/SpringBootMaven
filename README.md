SpringBootMaven
===============
Initial draft of a Spring Boot app, using Maven to build.

Most code taken from https://github.com/joshlong/boot-examples/tree/master/rest-and-mvc

Run Application class, and point browser to http://localhost:8080/bookings. No pretty UI, just REST.

Notes:
* Requires Java8
* Note the format for specifying the profile on the command line:
** java -jar target/springboot-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
** Took me a while to figure this out. For example, neither of the following formats seems to work
**  -Dspring.profiles.active="prod"
**  -Drun.jvmArguments="-Dspring.profiles.active=prod"
