-- Should be run from top level project directory i.e. where the main pom.xml is
use test;
drop table if exists Booking;
CREATE TABLE Booking(  
   id INT NOT NULL AUTO_INCREMENT,  
   booking_name VARCHAR(50) NOT NULL,
   PRIMARY KEY (ID)  
);
source src/main/resources/data.sql;