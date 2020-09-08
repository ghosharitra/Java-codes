-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: hostel
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pref`
--

DROP TABLE IF EXISTS `pref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pref` (
  `Room` varchar(20) NOT NULL,
  `Bed` varchar(20) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Room_no` int(10) NOT NULL,
  `Username` varchar(20) DEFAULT NULL,
  `Price` int(10) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`Room_no`),
  KEY `Username` (`Username`),
  CONSTRAINT `pref_ibfk_1` FOREIGN KEY (`Username`) REFERENCES `signup` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pref`
--

LOCK TABLES `pref` WRITE;
/*!40000 ALTER TABLE `pref` DISABLE KEYS */;
INSERT INTO `pref` VALUES ('Delux','Tier 1','Non-AC',101,NULL,500,'not taken'),('Delux','Tier 1','Non-AC',102,NULL,500,'not taken'),('Delux','Tier 2','Non-AC',103,NULL,700,'not taken'),('Super-Delux','Tier 2','AC',104,NULL,1500,'not taken'),('Delux','Tier 1','Non-AC',201,NULL,500,'not taken'),('Delux','Tier 1','Non-AC',202,NULL,500,'not taken'),('Delux','Tier 2','Non-AC',203,NULL,700,'not taken'),('Super-Delux','Tier 2','AC',204,NULL,1500,'not taken'),('Delux','Tier 1','Non-AC',301,NULL,500,'not taken'),('Delux','Tier 1','Non-AC',302,NULL,500,'not taken'),('Delux','Tier 2','Non-AC',303,NULL,700,'not taken'),('Super-Delux','Tier 2','AC',304,NULL,1500,'not taken'),('Delux','Tier 1','Non-AC',401,NULL,500,'not taken'),('Delux','Tier 1','Non-AC',402,NULL,500,'not taken'),('Delux','Tier 2','Non-AC',403,NULL,700,'not taken'),('Super-Delux','Tier 2','AC',404,NULL,1500,'not taken'),('Delux','Tier 1','Non-AC',501,NULL,500,'not taken'),('Delux','Tier 1','Non-AC',502,NULL,500,'not taken'),('Delux','Tier 2','Non-AC',503,NULL,700,'not taken'),('Super-Delux','Tier 2','AC',504,NULL,1500,'not taken');
/*!40000 ALTER TABLE `pref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Phone_number` varchar(10) DEFAULT NULL,
  `Gender` varchar(20) NOT NULL,
  `Date_of_Birth` date NOT NULL,
  `Aadhar_No` varchar(20) NOT NULL,
  `Year` int(20) NOT NULL,
  `Stream` varchar(20) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('asd','asd','asd asd','asd','8527419635','Male','1999-05-07','1234 1234 1234',2017,'CSE');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-26 23:47:47
