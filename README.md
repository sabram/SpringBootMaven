SpringBootMaven
===============
Initial draft of a Spring Boot app, using JPA for persistence and Maven to build.

Most code taken from https://github.com/joshlong/boot-examples/tree/master/rest-and-mvc

###Running demo

Run the Application class, and point browser to http://localhost:8080/bookings

For example:
`mvn package && java -jar target/springboot-0.0.1-SNAPSHOT.jar`

No pretty UI, just REST. Requires Java8.

###Running for real

By default, the app runs using an in-memory database (h2). To use for real i.e. with a database that will actual persist 
your data between server runs, use the demo profile, which uses a mysql database instead:

`java -jar target/springboot-0.0.1-SNAPSHOT.jar --spring.profiles.active=demo`

However, you must first have mysql installed, create an empty demo schema, and run this command from the command line:

`mysql --user=root demo < src/main/resources/setup.sql`

###Background Notes
Note the format for specifying the profile on the command line:

java -jar target/springboot-0.0.1-SNAPSHOT.jar **--spring.profiles.active=demo**

Took me a while to figure this out. For example, neither `-Dspring.profiles.active="demo"` nor  
`-Drun.jvmArguments="-Dspring.profiles.active=demo"` seemed to work.
  
  
  
  
