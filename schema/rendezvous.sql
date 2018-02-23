/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.5.50 : Database - rendezvous
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rendezvous` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `rendezvous`;

/*Table structure for table `rendezvous` */

DROP TABLE IF EXISTS `rendezvous`;

CREATE TABLE `rendezvous` (
  `idRendezvous` int(4) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `heure` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `soins` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idRendezvous`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `rendezvous` */

insert  into `rendezvous`(`idRendezvous`,`nom`,`date`,`heure`,`telephone`,`soins`) values (1,'zz','zz','zz','zz','zz'),(2,'gg','gg','gg','gg','gg');

/*Table structure for table `rendezvous1` */

DROP TABLE IF EXISTS `rendezvous1`;

CREATE TABLE `rendezvous1` (
  `IdRendezvous` int(4) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `heure` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `soins` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdRendezvous`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `rendezvous1` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
