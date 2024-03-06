
/*
Given a table FIREFIGHTERS, 
query the average of all the 
people saved by the Firefighters 
whose CountryCode is PM.
*/



Create schema Firefighters;
USE Firefighters;
CREATE TABLE IF NOT EXISTS `addresses` (
`id` int(10) NOT NULL AUTO_INCREMENT,
`Country` VARCHAR(255) NOT NULL,
`CountryCode` VARCHAR(255) NOT NULL, 
`PeopleSaved` INT,
PRIMARY KEY (`id`)
);
ALter table`addresses`;
 INSERT INTO `addresses`(`id`,`Country`,`CountryCode`,`PeopleSaved`)
 VALUES
( 1,'Bulgaria','BG',2),
( 2,'Bulgaria','PM',4),
( 3,'Bulgaria','PM',56),
( 4,'Bulgaria','PM',2),
( 6,'Bulgaria','GE',2),
( 7,'Bulgaria','GE',2),
( 8,'Bulgaria','GE',2),
( 9,'Bulgaria','GE',2),
( 10,'Bulgaria','GE',2),
( 11,'Bulgaria','GE',2);


select avg(`PeopleSaved`) From `addresses`
group by `CountryCode`
HAVING `CountryCode` = 'PM'; 