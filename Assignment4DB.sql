CREATE DATABASE ASSIGNMENT4;

CREATE TABLE `Trainers`
(
 `id`      integer NOT NULL AUTO_INCREMENT,
 `fName`   varchar(30) NOT NULL ,
 `lName`   varchar(30) NOT NULL ,
 `subject` varchar(45) ,
PRIMARY KEY (`id`)
);

INSERT INTO trainers(fName, lName, subject) VALUES('Albus', 'Dumbledore', 'Defense against the dark arts');
INSERT INTO trainers(fName, lName, subject) VALUES('Severus', 'Snape', 'Potions'), ('Minerva', 'McGonagall', 'Transfiguration');

SELECT * FROM trainers;