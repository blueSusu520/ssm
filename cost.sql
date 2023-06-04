/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.29-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `cost` (
	`id` int (11),
	`costDay` date ,
	`morning` double ,
	`afternoon` double ,
	`evening` double ,
	`totalcost` double 
); 
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('1','2023-05-04','4','4','2','10');
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('5','2023-05-03',NULL,NULL,NULL,NULL);
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('6','2023-05-03',NULL,NULL,NULL,NULL);
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('9','2023-05-03',NULL,NULL,NULL,NULL);
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('10','2023-05-03',NULL,NULL,NULL,NULL);
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('11','2022-02-02','1','1','1','3');
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('14','2022-02-02','1','1','1','3');
insert into `cost` (`id`, `costDay`, `morning`, `afternoon`, `evening`, `totalcost`) values('16',NULL,NULL,NULL,NULL,NULL);
