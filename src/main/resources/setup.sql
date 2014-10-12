-- Should be run from top level project directory i.e. where the main pom.xml is
-- Should be run by user with appropriate CREATE permissions e.g. root

CREATE SCHEMA IF NOT EXISTS demo;
USE demo;

-- Creates user 'demo' if it does not exist
grant all on `demo`.* to 'demo'@'localhost' identified by 'demo';

-- drop table if exists Booking;
CREATE TABLE IF NOT EXISTS Booking(
   id INT NOT NULL AUTO_INCREMENT,  
   booking_name VARCHAR(50) NOT NULL,
   PRIMARY KEY (ID)  
);
SOURCE src/main/resources/data.sql;