-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mymusic
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_author`
--

DROP TABLE IF EXISTS `tbl_author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_author` (
  `IDauthor` int(11) NOT NULL AUTO_INCREMENT,
  `name_of_author` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Date_of_Birth` varchar(30) DEFAULT NULL,
  `company` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`IDauthor`),
  UNIQUE KEY `IDauthor` (`IDauthor`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_author`
--

LOCK TABLES `tbl_author` WRITE;
/*!40000 ALTER TABLE `tbl_author` DISABLE KEYS */;
INSERT INTO `tbl_author` VALUES (1,'Jack','Việt Nam','1997','ICM'),(2,'K-ICM','Việt Nam','1999-07-12','ICM'),(3,'Rin9','Việt Nam',NULL,NULL),(4,'Vương Anh Tú','Việt Nam','1990-09-16',''),(5,'Khắc Việt','Việt Nam','1987-08-30',''),(6,'Kha','Việt Nam','2002-07-31',''),(7,'Mr.Siro','Việt Nam','1982-11-18',''),(8,'Lã','Việt Nam','',''),(9,'Ân Nhi','Việt Nam','1980',''),(10,'Axel Johansson','Mỹ','',''),(11,'Camila Cabello','Mỹ','1997-03-03',''),(12,'Pharell Williams','','',''),(13,'Allie X','Canada','1985-07-31',''),(14,'ZAYN','Anh','1993-01-12',''),(15,'Marshmello','Mỹ','',''),(16,'Kane Brown','Mỹ','',''),(17,'Chester Bennington','Mỹ','1976-03-20','Linkin Park'),(18,'Patrick Stump','Mỹ','1984-04-27','Fall Out Boy'),(19,'Brendon Urie','Mỹ','1987-04-12','Panic! at the Disco'),(20,'Barns Courtney','Anh','1990-11-17','Capitol Records'),(21,'Joji','Nhật','1992-09-18','88Rising'),(22,'Ryan Higa','Mỹ','1990-06-06',' '),(23,'Shane Filan','Ai-len','1979-06-06',' ');
/*!40000 ALTER TABLE `tbl_author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_category`
--

DROP TABLE IF EXISTS `tbl_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_category` (
  `IDcategory` int(11) NOT NULL AUTO_INCREMENT,
  `name_of_category` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDcategory`),
  UNIQUE KEY `IDcategory` (`IDcategory`),
  UNIQUE KEY `name_of_categogy` (`name_of_category`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category`
--

LOCK TABLES `tbl_category` WRITE;
/*!40000 ALTER TABLE `tbl_category` DISABLE KEYS */;
INSERT INTO `tbl_category` VALUES (5,'Âu Mỹ'),(4,'EDM'),(2,'Nhạc trẻ'),(3,'Pop'),(6,'Pop Rock'),(7,'R&B'),(8,'Rock'),(1,'Việt Nam');
/*!40000 ALTER TABLE `tbl_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_create_this_song`
--

DROP TABLE IF EXISTS `tbl_create_this_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_create_this_song` (
  `IDauthor` int(11) NOT NULL,
  `IDsong` int(11) NOT NULL,
  KEY `IDauthor_author` (`IDauthor`),
  KEY `write_song` (`IDsong`),
  CONSTRAINT `IDauthor_author` FOREIGN KEY (`IDauthor`) REFERENCES `tbl_author` (`IDauthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `write_song` FOREIGN KEY (`IDsong`) REFERENCES `tbl_song` (`IDsong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_create_this_song`
--

LOCK TABLES `tbl_create_this_song` WRITE;
/*!40000 ALTER TABLE `tbl_create_this_song` DISABLE KEYS */;
INSERT INTO `tbl_create_this_song` VALUES (1,1),(2,1),(3,2),(3,3),(4,4),(5,5),(6,6),(1,7),(2,7),(7,8),(8,9),(9,10),(10,11),(11,12),(12,12),(11,13),(13,14),(14,15),(15,16),(16,16),(17,18),(17,32),(17,33),(17,34),(18,21),(18,22),(18,25),(18,26),(18,27),(19,28),(19,29),(19,30),(19,31),(20,23),(20,24),(21,35),(21,36),(23,17),(22,19);
/*!40000 ALTER TABLE `tbl_create_this_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_kind_this_song`
--

DROP TABLE IF EXISTS `tbl_kind_this_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_kind_this_song` (
  `IDsong` int(11) NOT NULL,
  `IDcategory` int(11) NOT NULL,
  KEY `IDkindsong_song` (`IDsong`),
  KEY `IDcategory_category` (`IDcategory`),
  CONSTRAINT `IDcategory_category` FOREIGN KEY (`IDcategory`) REFERENCES `tbl_category` (`IDcategory`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDkindsong_song` FOREIGN KEY (`IDsong`) REFERENCES `tbl_song` (`IDsong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_kind_this_song`
--

LOCK TABLES `tbl_kind_this_song` WRITE;
/*!40000 ALTER TABLE `tbl_kind_this_song` DISABLE KEYS */;
INSERT INTO `tbl_kind_this_song` VALUES (1,1),(1,2),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3),(4,1),(4,2),(4,3),(5,1),(5,2),(5,3),(6,1),(6,2),(6,3),(7,1),(7,2),(7,3),(8,1),(8,2),(8,3),(9,1),(9,2),(9,3),(10,1),(10,2),(10,3),(11,5),(11,4),(12,5),(12,3),(13,3),(13,5),(14,5),(14,3),(14,4),(15,3),(15,5),(16,5),(16,4),(17,3),(17,5),(18,5),(18,8),(19,3),(20,8),(20,5),(21,6),(22,6),(23,3),(24,3),(25,5),(25,6),(26,6),(27,6),(28,6),(29,6),(30,6),(31,3),(32,8),(33,8),(34,8),(35,7),(36,7);
/*!40000 ALTER TABLE `tbl_kind_this_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mylist`
--

DROP TABLE IF EXISTS `tbl_mylist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mylist` (
  `IDlist` int(11) NOT NULL AUTO_INCREMENT,
  `usr` varchar(30) NOT NULL,
  `name_of_list` varchar(30) NOT NULL,
  PRIMARY KEY (`IDlist`),
  UNIQUE KEY `IDlist` (`IDlist`),
  KEY `usr_user` (`usr`),
  CONSTRAINT `usr_user` FOREIGN KEY (`usr`) REFERENCES `tbl_user` (`usr`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mylist`
--

LOCK TABLES `tbl_mylist` WRITE;
/*!40000 ALTER TABLE `tbl_mylist` DISABLE KEYS */;
INSERT INTO `tbl_mylist` VALUES (1,'cuong','list1'),(3,'dat','listcuadat1'),(4,'dat','listcuadat2');
/*!40000 ALTER TABLE `tbl_mylist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mylist_this_song`
--

DROP TABLE IF EXISTS `tbl_mylist_this_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mylist_this_song` (
  `IDlist` int(11) NOT NULL,
  `IDsong` int(11) NOT NULL,
  KEY `IDlist_mylist` (`IDlist`),
  KEY `IDsong_song` (`IDsong`),
  CONSTRAINT `IDlist_mylist` FOREIGN KEY (`IDlist`) REFERENCES `tbl_mylist` (`IDlist`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDsong_song` FOREIGN KEY (`IDsong`) REFERENCES `tbl_song` (`IDsong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mylist_this_song`
--

LOCK TABLES `tbl_mylist_this_song` WRITE;
/*!40000 ALTER TABLE `tbl_mylist_this_song` DISABLE KEYS */;
INSERT INTO `tbl_mylist_this_song` VALUES (1,4),(1,16),(1,24),(3,30),(3,19),(4,7),(4,15),(4,3),(1,5);
/*!40000 ALTER TABLE `tbl_mylist_this_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_sing_this_song`
--

DROP TABLE IF EXISTS `tbl_sing_this_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_sing_this_song` (
  `IDsinger` int(11) NOT NULL,
  `IDsong` int(11) NOT NULL,
  KEY `IDsinger_singer` (`IDsinger`),
  KEY `singer_song` (`IDsong`),
  CONSTRAINT `IDsinger_singer` FOREIGN KEY (`IDsinger`) REFERENCES `tbl_singer` (`IDsinger`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `singer_song` FOREIGN KEY (`IDsong`) REFERENCES `tbl_song` (`IDsong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_sing_this_song`
--

LOCK TABLES `tbl_sing_this_song` WRITE;
/*!40000 ALTER TABLE `tbl_sing_this_song` DISABLE KEYS */;
INSERT INTO `tbl_sing_this_song` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(1,7),(7,8),(8,9),(9,10),(10,10),(11,11),(12,12),(13,12),(12,13),(14,14),(15,15),(16,15),(17,16),(18,16),(17,18),(17,32),(17,33),(17,34),(18,21),(18,22),(18,25),(18,26),(18,27),(19,28),(19,29),(19,30),(19,31),(20,23),(20,24),(21,35),(21,36),(22,19);
/*!40000 ALTER TABLE `tbl_sing_this_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_singer`
--

DROP TABLE IF EXISTS `tbl_singer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_singer` (
  `IDsinger` int(11) NOT NULL AUTO_INCREMENT,
  `name_of_singer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `country` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Date_of_Birth` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`IDsinger`),
  UNIQUE KEY `IDsinger` (`IDsinger`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_singer`
--

LOCK TABLES `tbl_singer` WRITE;
/*!40000 ALTER TABLE `tbl_singer` DISABLE KEYS */;
INSERT INTO `tbl_singer` VALUES (1,'Jack','ICM','Việt Nam','1997'),(2,'Hương Giang','HUONG GIANG  ENTERTAINMENT','Việt Nam','1991-12-29'),(3,'Quân A.P','GREAT ENTERTAINMENT','Việt Nam','1997-01-24'),(4,'Đức Phúc','','Việt Nam','1996-10-15'),(5,'Lê Bảo Bình','TheAnh28 Entertainment','Việt Nam','1990'),(6,'Kha','','Việt Nam','2002-07-31'),(7,'Mr.Siro','','Việt Nam','1982-11-18'),(8,'Lã x Long x TiB','','Việt Nam',''),(9,'Han SaRa','6TH SENSE ENTERTAINMENT JSC','Hàn Quốc','2000-11-17'),(10,'Kay Trần','','Việt Nam','1994-05-06'),(11,'Axel Johansson','','Mỹ',''),(12,'Camila Cabello','','Mỹ','1997-03-03'),(13,'Young Thug','','Mỹ','1992'),(14,'Allie X','','Canada','1985-07-31'),(15,'ZAYN','','Anh','1993-01-12'),(16,'Sia','','Australia','1975'),(17,'Marshmello','','Mỹ',''),(18,'Kane Brown','','Mỹ',''),(19,'Chester Bennington','Linkin Park','Mỹ','1976-03-20'),(20,'Patrick Stump','Fall Out Boy','Mỹ','1984-04-27'),(21,'Brendon Urie','Panic! at the Disco','Mỹ','1987-04-12'),(22,'Barns Courtney','Capitol Records','Anh','1990-11-17'),(23,'Joji','88Rising','Nhật','1992-09-18'),(24,'Ryan Higa',' ','Mỹ','1990-06-06'),(25,'Shane Filan','Westlife','Ai-len','1979-06-06');
/*!40000 ALTER TABLE `tbl_singer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_song`
--

DROP TABLE IF EXISTS `tbl_song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_song` (
  `IDsong` int(11) NOT NULL AUTO_INCREMENT,
  `name_of_song` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date_release` varchar(30) DEFAULT NULL,
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`IDsong`),
  UNIQUE KEY `IDsong` (`IDsong`),
  UNIQUE KEY `url_UNIQUE` (`url`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_song`
--

LOCK TABLES `tbl_song` WRITE;
/*!40000 ALTER TABLE `tbl_song` DISABLE KEYS */;
INSERT INTO `tbl_song` VALUES (1,'Em gì ơi','2019-10-05',NULL),(2,'Anh ta bỏ em rồi','2019-10-31','Mp3/Anh ta bỏ em rồi.mp3'),(3,'Còn gì đau hơn chữ đã từng','2019-10-13',NULL),(4,'Hết thương cạn nhớ','2019-09-29',NULL),(5,'Bước qua đời nhau','2019-08-28',NULL),(6,'Lời yêu ngây dại','2019-08-11',NULL),(7,'Bạc Phận','2019-04-16',NULL),(8,'Một bước yêu vạn dặm đau','2019-03-14',NULL),(9,'Anh thương em nhất mà','2019-03-04',NULL),(10,'Đếm cừu','2019-08-11',NULL),(11,'The river','2018-01-22',NULL),(12,'Havana','2017-08-03',NULL),(13,'Liar','2019-09-12',NULL),(14,'Downtown','2017-09-19',NULL),(15,'Dusk Till Dawn','2017-09-07',NULL),(16,'One Thing Right','2019-07-18',NULL),(17,'My Love','2000-10-31',NULL),(18,'Numb','2000-09-08',NULL),(19,'Nice Guys','2011-05-31',NULL),(20,'New Divide','2009-5-18',NULL),(21,'Pavlove','2008-05-28',NULL),(22,'Rat a Tat','2013-04-08',NULL),(23,'Sinner','2018-09-02',NULL),(24,'Rather Die','2017-09-29',NULL),(25,'The Last of the Real Ones','2017-09-14',NULL),(26,'The Phoenix','2013-03-24',NULL),(27,'The Phoenix','2013-03-24',NULL),(28,'Nicotine','2013-08-08',NULL),(29,'Roaring 20s','2018-06-22',NULL),(30,'Say Amen(Saturday Night)','2018-03-21',NULL),(31,'This is Gospel','2018-08-12',NULL),(32,'Papercut','2001-06-18',NULL),(33,'Points Of Authority','2001-06-18',NULL),(34,'New Divide','2009-05-18',NULL),(35,'TEST DRIVE','2018-10-16',NULL),(36,'SLOW DANCING IN THE DARK','2018-09-12',NULL);
/*!40000 ALTER TABLE `tbl_song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_user` (
  `usr` varchar(30) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `isVip` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`usr`),
  UNIQUE KEY `usr` (`usr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('cuong','cuong123','Nguyễn Mạnh Cường',1),('dat','dat123','Nguyễn Văn Đạt',0);
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-26 12:18:03
