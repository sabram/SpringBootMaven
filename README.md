SpringBootMaven
===============
Initial draft of a Spring Boot app, using Maven to build.
Most code taken from https://github.com/joshlong/boot-examples/tree/master/rest-and-mvc

Running demo:
Run Application class, and point browser to http://localhost:8080/bookings. No pretty UI, just REST. Requires Java8.

Taking it further:
By default, the app runs using an in-memory database (h2). To use for real i.e. with a database that will actual persist 
your data between server runs, use the demo profile, which uses a mysql database instead:

'java  -jar target/springboot-0.0.1-SNAPSHOT.jar --spring.profiles.active=demo'

However, you must first run this command from the command line:
'mysql --user=root src/main/resources/setup.sql'

Notes:
* Note the format for specifying the profile on the command line:
  * java -jar target/springboot-0.0.1-SNAPSHOT.jar **--spring.profiles.active=demo**
  * Took me a while to figure this out. For example, neither of the following formats seems to work
  *  -Dspring.profiles.active="demo"
  *  -Drun.jvmArguments="-Dspring.profiles.active=demo"
  
  
  
  
