CREATE DATABASE IF NOT EXISTS `appdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE USER IF NOT EXISTS 'app'@'localhost' IDENTIFIED BY 'app';
use appdb;
GRANT ALL ON appdb TO 'app'@'localhost';
CREATE TABLE `testentity` (
  `testEntityId` int(11) NOT NULL,
  `name` varchar(45) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`testEntityId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
INSERT INTO `testentity` VALUES(1, 'Joe');
