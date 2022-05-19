CREATE DATABASE IF NOT EXISTS `northlakecampground` /*!40100 DEFAULT CHARACTER SET latin1 */;

DROP TABLE IF EXISTS `northlakecampground`.`guests`;

CREATE TABLE IF NOT EXISTS `northlakecampground`.`guests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `guestID_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `northlakecampground`.`reservations`;

CREATE TABLE IF NOT EXISTS `northlakecampground`.`reservations` (
  `id` varchar(10) NOT NULL,
  `site` int(11) DEFAULT NULL,
  `start_date` varchar(45) DEFAULT NULL,
  `end_date` varchar(45) DEFAULT NULL,
  `guest_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `reservationId_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
