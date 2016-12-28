CREATE DATABASE  IF NOT EXISTS `soft` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `soft`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: soft
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bandera`
--

DROP TABLE IF EXISTS `bandera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bandera` (
  `Serial_dispositivo` varchar(50) NOT NULL,
  `est_band` bit(1) NOT NULL,
  KEY `Serial_dispositivo` (`Serial_dispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bandera`
--

LOCK TABLES `bandera` WRITE;
/*!40000 ALTER TABLE `bandera` DISABLE KEYS */;
INSERT INTO `bandera` VALUES ('',''),('dgus9t',''),('dgus9t','\0'),('kmu8m6',''),('kmu8m6','\0'),('d1bzpd',''),('4tmqou',''),('4tmqou','\0'),('d1bzpd','\0'),('yrttvt',''),('i817ig',''),('yrttvt','\0'),('qwcrgu',''),('qwcrgu','\0'),('68i7rr',''),('68i7rr','\0'),('0nmywq',''),('0nmywq','\0'),('enl6or',''),('j1c2kv',''),('j1c2kv','\0'),('qa2u9w',''),('qa2u9w','\0'),('fhnplc',''),('fhnplc','\0'),('qf92sd',''),('qf92sd','\0'),('iy1zow',''),('iy1zow','\0'),('kxjk8h',''),('80enlk',''),('ehp1ph',''),('65ud3v',''),('7q5g4k',''),('dgus9t',''),('0tqvx5',''),('qf92sd',''),('iy1zow',''),('kxjk8h','\0'),('0tqvx5','\0'),('yqa2k5',''),('yqa2k5','\0'),('vu86at',''),('dgus9t','\0'),('x22oyr',''),('lfzp21',''),('o4pp3s',''),('yocmxi',''),('dgus9t',''),('arpzq2',''),('reiymz',''),('ehp1ph','\0'),('ehp1ph',''),('80enlk','\0'),('80enlk',''),('7q5g4k','\0'),('7q5g4k',''),('68i7rr',''),('5g52f2',''),('0nmywq',''),('qf92sd','\0'),('qf92sd',''),('77d5a6',''),('famncc',''),('ehp1ph','\0');
/*!40000 ALTER TABLE `bandera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dispositivo`
--

DROP TABLE IF EXISTS `dispositivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dispositivo` (
  `Serial_dispositivo` varchar(50) NOT NULL,
  `Marca_dispositivo` varchar(70) NOT NULL,
  `Modelo_dispositivo` varchar(50) NOT NULL,
  `Id_tipo_dispositivo` int(50) NOT NULL,
  `Id_persona_reg` bigint(50) NOT NULL,
  `Id_vigilante` bigint(50) NOT NULL,
  `Fecha_registro` datetime(4) NOT NULL,
  PRIMARY KEY (`Serial_dispositivo`),
  KEY `Id_tipo_dispositivo` (`Id_tipo_dispositivo`),
  KEY `Id_vigilante` (`Id_vigilante`),
  KEY `Id_persona` (`Id_persona_reg`),
  CONSTRAINT `dispositivo_ibfk_1` FOREIGN KEY (`Id_tipo_dispositivo`) REFERENCES `tipo_dispositivo` (`Id_tipo_dispositivo`),
  CONSTRAINT `dispositivo_ibfk_2` FOREIGN KEY (`Id_vigilante`) REFERENCES `vigilante` (`Id_vigilante`),
  CONSTRAINT `dispositivo_ibfk_3` FOREIGN KEY (`Id_persona_reg`) REFERENCES `persona` (`Id_persona_reg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispositivo`
--

LOCK TABLES `dispositivo` WRITE;
/*!40000 ALTER TABLE `dispositivo` DISABLE KEYS */;
INSERT INTO `dispositivo` VALUES ('0epdze','Acer','aspire e14',1,28061355,12345,'2016-12-20 12:09:35.0000'),('0nmywq','HP','f4h4',1,1096214610,12345,'2016-12-19 11:59:00.0000'),('0toead','HP','RTL8',1,99102306011,12345,'2016-12-19 06:59:26.0000'),('0tqvx5','Compaq','r8k3f',1,1096214809,12345,'2016-12-20 06:13:20.0000'),('2qsb7r','Sony','vaio',1,1073513708,12345,'2016-12-20 12:02:18.0000'),('4ov6zw','HP','Pavilion',1,1096240208,12345,'2016-12-19 07:30:12.0000'),('4pyq02','Lenovo','ideapad',1,1096241902,12345,'2016-12-19 06:57:14.0000'),('4tmqou','Lenovo','Ideapad 100',1,52906933,12345,'2016-12-19 11:46:38.0000'),('5g52f2','Samsung','np400',1,1096239932,12345,'2016-12-21 06:16:44.0000'),('65ud3v','HP','14ac',1,1096246681,12345,'2016-12-20 06:14:58.0000'),('68i7rr','Acer','Aspire One',1,1096202461,12345,'2016-12-19 11:56:44.0000'),('77d5a6','Lenovo','G400',1,1096223351,12345,'2016-12-16 15:43:26.0000'),('7q5g4k','Lenovo','ideapad',1,99010112539,12345,'2016-12-19 07:03:23.0000'),('80enlk','Lenovo','g40',1,99061816611,12345,'2016-12-19 07:05:44.0000'),('8zh01u','HP','w00',1,99063010991,12345,'2016-12-19 07:10:26.0000'),('arpzq2','HP','pavilion',1,1096202600,12345,'2016-12-21 06:07:29.0000'),('bdv9kw','Sony','SVE141',1,1096247322,12345,'2016-12-19 07:08:03.0000'),('bvyoi6','Lenovo','g475',1,1096240769,12345,'2016-12-19 07:11:24.0000'),('d1bzpd','Acer','n15c2',1,1096248697,12345,'2016-12-19 11:47:45.0000'),('deapp2','Compaq','CQ45',1,99020216430,12345,'2016-12-16 16:11:01.0000'),('devbls','LG','lg15u',1,98112053476,12345,'2016-12-19 07:16:47.0000'),('dgus9t','Asus','X453M',1,1096246922,12345,'2016-12-16 16:25:53.0000'),('edr78r','HP','Pavilion',1,1098666595,12345,'2016-12-19 07:26:55.0000'),('ehp1ph','HP','hp14',1,99091311506,12345,'2016-12-19 07:01:16.0000'),('enl6or','HP','RTL87',1,37579310,12345,'2016-12-16 16:08:20.0000'),('ervu1x','Sony','Vaio',1,28218728,12345,'2016-12-16 15:34:56.0000'),('famncc','Asus','x455l',1,1096227665,12345,'2016-12-19 08:44:03.0000'),('fhnplc','HP','Pavilion',1,1096240208,12345,'2016-12-19 12:06:22.0000'),('i817ig','Acer','Aspire',1,60438528,12345,'2016-12-16 15:31:09.0000'),('iy1zow','Asus','K46CB',1,1096241325,12345,'2016-12-16 16:30:02.0000'),('j1c2kv','Samsung','np35',1,1096242428,12345,'2016-12-19 07:31:11.0000'),('kdmuzn','Lenovo','g40',1,1097612249,12345,'2016-12-19 07:29:17.0000'),('kjdlrw','HP','Pavilion',1,1098625645,12345,'2016-12-16 16:12:39.0000'),('kmu8m6','HP','f4h4',1,63472623,12345,'2016-12-19 11:11:39.0000'),('kxjk8h','Sony','Vaio',1,1096211020,12345,'2016-12-20 06:08:01.0000'),('lfzp21','Compaq','g32',1,1096192321,12345,'2016-12-21 05:59:52.0000'),('lpdey4','HP','314d',1,1005180449,12345,'2016-12-19 07:06:51.0000'),('m8wflg','Lenovo','80MH',1,1096201203,12345,'2016-12-16 15:54:55.0000'),('mg40yf','Lenovo','g40',1,99010719603,12345,'2016-12-19 07:09:08.0000'),('mo0r6w','HP','Pavilion',1,99022804878,12345,'2016-12-19 07:04:37.0000'),('nzwl05','Compaq','CQ45',1,37575881,12345,'2016-12-16 16:19:42.0000'),('o4pp3s','Acer','Aspire v3',1,1005179770,12345,'2016-12-19 08:40:11.0000'),('q8agy6','Lenovo','3464',1,1096237647,12345,'2016-12-19 07:59:42.0000'),('qa2u9w','HP','Pavilion dm1',1,1098666595,12345,'2016-12-19 12:08:18.0000'),('qf92sd','Sony','sve111',1,1096211655,12345,'2016-12-19 08:37:19.0000'),('qrzt91','Lenovo','100s',1,1002448859,12345,'2016-12-20 12:12:06.0000'),('qwcrgu','HP','rcpbr',1,1096249557,12345,'2016-12-19 11:54:04.0000'),('reiymz','HP','tx2rt',1,1096249330,12345,'2016-12-19 07:28:16.0000'),('vu86at','HP','mini100e',1,1005179427,12345,'2016-12-20 11:59:05.0000'),('x22oyr','Lenovo','ideapad 100s',1,1002448859,12345,'2016-12-20 12:18:14.0000'),('xazeht','HP','Pavilion',1,1096225699,12345,'2016-12-16 15:52:06.0000'),('xixt8r','HP','1000',1,1005654871,12345,'2016-12-20 12:16:37.0000'),('ykxy6b','HP','hp14',1,99082512213,12345,'2016-12-19 07:02:14.0000'),('yocmxi','Asus','eeepc 1015',1,91449155,12345,'2016-12-21 06:04:14.0000'),('yqa2k5','Samsung','ghbjilñ',1,1096214809,12345,'2016-12-20 10:42:29.0000'),('yrttvt','Lenovo','Ideapad s10',1,1095812092,12345,'2016-12-19 11:50:30.0000');
/*!40000 ALTER TABLE `dispositivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingreso_dispositivo`
--

DROP TABLE IF EXISTS `ingreso_dispositivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ingreso_dispositivo` (
  `cons_ing_dispositivo` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `Id_persona_ing` bigint(50) NOT NULL,
  `Serial_dispositivo` varchar(50) NOT NULL,
  `Fecha_ingreso` datetime(4) NOT NULL,
  `Fecha_salida` datetime DEFAULT NULL,
  PRIMARY KEY (`cons_ing_dispositivo`),
  KEY `Serial_dispositivo` (`Serial_dispositivo`),
  KEY `Id_persona_ing` (`Id_persona_ing`),
  CONSTRAINT `ingreso_dispositivo_ibfk_2` FOREIGN KEY (`Id_persona_ing`) REFERENCES `persona` (`Id_persona_reg`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingreso_dispositivo`
--

LOCK TABLES `ingreso_dispositivo` WRITE;
/*!40000 ALTER TABLE `ingreso_dispositivo` DISABLE KEYS */;
INSERT INTO `ingreso_dispositivo` VALUES (1,1096246922,'dgus9t','2016-12-19 10:40:43.0000','2016-12-19 10:41:53'),(2,63472623,'kmu8m6','2016-12-19 11:12:06.0000','2016-12-19 11:12:33'),(3,1096248697,'d1bzpd','2016-12-19 11:47:57.0000','2016-12-19 11:49:17'),(4,52906933,'4tmqou','2016-12-19 11:48:17.0000','2016-12-19 11:48:36'),(5,1095812092,'yrttvt','2016-12-19 11:50:39.0000','2016-12-19 11:52:11'),(6,60438528,'i817ig','2016-12-19 11:51:46.0000',NULL),(7,1096249557,'qwcrgu','2016-12-19 11:54:25.0000','2016-12-19 11:55:24'),(8,1096202461,'68i7rr','2016-12-19 11:56:57.0000','2016-12-19 11:57:10'),(9,1096214610,'0nmywq','2016-12-19 11:59:08.0000','2016-12-19 11:59:21'),(10,37579310,'enl6or','2016-12-19 12:03:28.0000',NULL),(11,1096242428,'j1c2kv','2016-12-19 12:06:54.0000','2016-12-19 12:07:15'),(12,1098666595,'qa2u9w','2016-12-19 12:08:36.0000','2016-12-19 12:08:46'),(13,1096240208,'fhnplc','2016-12-19 12:09:11.0000','2016-12-19 12:09:20'),(14,1096211655,'qf92sd','2016-12-19 12:14:11.0000','2016-12-19 12:14:28'),(15,1096241325,'iy1zow','2016-12-19 12:15:27.0000','2016-12-19 12:15:57'),(16,1096211020,'kxjk8h','2016-12-20 06:08:12.0000','2016-12-20 11:50:29'),(17,99061816611,'80enlk','2016-12-20 06:10:34.0000','2016-12-21 06:11:13'),(18,99091311506,'ehp1ph','2016-12-20 06:11:20.0000','2016-12-21 06:10:32'),(19,1096246681,'65ud3v','2016-12-20 06:15:10.0000',NULL),(20,99010112539,'7q5g4k','2016-12-20 06:15:36.0000','2016-12-21 06:13:46'),(21,1096246922,'dgus9t','2016-12-20 06:17:46.0000','2016-12-20 12:16:59'),(22,1096214809,'0tqvx5','2016-12-20 06:18:03.0000','2016-12-20 11:51:20'),(23,1096211655,'qf92sd','2016-12-20 06:18:25.0000','2016-12-21 06:19:59'),(24,1096241325,'iy1zow','2016-12-20 06:18:47.0000',NULL),(25,1096214809,'yqa2k5','2016-12-20 11:53:23.0000','2016-12-20 11:53:37'),(26,1005179427,'vu86at','2016-12-20 12:00:09.0000',NULL),(27,1002448859,'x22oyr','2016-12-20 12:19:15.0000',NULL),(28,1096192321,'lfzp21','2016-12-21 06:00:10.0000',NULL),(29,1005179770,'o4pp3s','2016-12-21 06:02:55.0000',NULL),(30,91449155,'yocmxi','2016-12-21 06:04:22.0000',NULL),(31,1096246922,'dgus9t','2016-12-21 06:04:45.0000',NULL),(32,1096202600,'arpzq2','2016-12-21 06:07:43.0000',NULL),(33,1096249330,'reiymz','2016-12-21 06:09:33.0000',NULL),(34,99091311506,'ehp1ph','2016-12-21 06:10:43.0000','2016-12-21 11:59:30'),(35,99061816611,'80enlk','2016-12-21 06:11:27.0000',NULL),(36,99010112539,'7q5g4k','2016-12-21 06:14:09.0000',NULL),(37,1096202461,'68i7rr','2016-12-21 06:15:18.0000',NULL),(38,1096239932,'5g52f2','2016-12-21 06:16:57.0000',NULL),(39,1096214610,'0nmywq','2016-12-21 06:18:58.0000',NULL),(40,1096211655,'qf92sd','2016-12-21 06:20:11.0000',NULL),(41,1096223351,'77d5a6','2016-12-21 06:22:54.0000',NULL),(42,1096227665,'famncc','2016-12-21 06:27:04.0000',NULL);
/*!40000 ALTER TABLE `ingreso_dispositivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `Id_persona_reg` bigint(50) NOT NULL,
  `Nombre_persona` varchar(70) NOT NULL,
  `Apellido_persona` varchar(50) NOT NULL,
  `Ficha_persona` varchar(50) DEFAULT NULL,
  `Id_tipo_persona` int(50) NOT NULL,
  PRIMARY KEY (`Id_persona_reg`),
  KEY `Id_tipo_persona` (`Id_tipo_persona`),
  CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`Id_tipo_persona`) REFERENCES `tipo_persona` (`Id_tipo_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (28061355,'rosiris','martinez','1095828',1),(28218728,'Carmen','Montenegro','1095828',1),(37575881,'Yesenia','Barreto','1131077',1),(37579310,'Juliana','González','1194920',1),(52906933,'Alba','Hernandez','1131101',1),(60438528,'Alexandra','Hurtado','1095828',1),(63472623,'Yadira','Hostia','1262805',1),(91449155,'Elger','Marin','1194829',1),(1002448859,'jineth','cajar','1131077',1),(1005179427,'marina','sanchez','1194920',1),(1005179770,'Luisa','Parada','956622',1),(1005180449,'Johanna','Navarro','1125882',1),(1005654871,'yeison ','ramos','1194920',1),(1073513708,'angie','ariza','1264124',1),(1095812092,'Luis','Corena','1194842',1),(1096192321,'Katherine','Cardenas','1194829',1),(1096201203,'Laura','Dávila','1194842',1),(1096202461,'Erika','Suarez','1194925',1),(1096202600,'Jean','Mojica','1194829',1),(1096211020,'Tania','Lopez','1194925',1),(1096211655,'Jair','Mora','956622',1),(1096214610,'Silvia','Ortiz','1194925',1),(1096214809,'Liseth','Esquivel','956622',1),(1096223351,'Jaider','Mercado','956622',1),(1096225699,'Nestor','Pupo','1194842',1),(1096227362,'Diyeferman','Gil','1194920',1),(1096227665,'Yuri','Ibañez','956622',1),(1096237647,'Sara','Guzmán','1194912',1),(1096239932,'Luis','Morales','956622',1),(1096240208,'Miguel','Velasquez','1130806',1),(1096240769,'Dario','Duran','1125882',1),(1096241325,'Johan','Ortíz','956622',1),(1096241902,'David','Bayona','1125882',1),(1096242428,'Laura','Muñoz','1130806',1),(1096246681,'Ezequiel ','Cabrera','1196498',1),(1096246922,'Andrés','Amaya','956622',1),(1096247322,'Adriana','Suarez','1125882',1),(1096248697,'Yesenia','Barrera','1131101',1),(1096249330,'Mariana','Gonzalez','1125882',1),(1096249557,'Daniel','Paez','1196393',1),(1097612249,'Nelsy','Romero','1125882',1),(1098625645,'Martha','Rincon','1194920',1),(1098666595,'Erika','Munar','1130806',1),(98112053476,'Fernanda','Blanco','1125882',1),(99010112539,'Kiara','Valbueno','1125882',1),(99010719603,'Miguel','Escorcia','1125882',1),(99020216430,'Luz','Sanchez','1194920',1),(99022804878,'Daniela','Estrada','1125882',1),(99061816611,'Sandy','Lopez','1125882',1),(99063010991,'Daniela','Simanca','1125882',1),(99082512213,'Liseth','Merchan','1125882',1),(99091311506,'Harvin','Zapata','1125882',1),(99102306011,'Elen','Cardenas','1125882',1);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_dispositivo`
--

DROP TABLE IF EXISTS `tipo_dispositivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_dispositivo` (
  `Id_tipo_dispositivo` int(50) NOT NULL,
  `Tipo_dispositivo` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_tipo_dispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_dispositivo`
--

LOCK TABLES `tipo_dispositivo` WRITE;
/*!40000 ALTER TABLE `tipo_dispositivo` DISABLE KEYS */;
INSERT INTO `tipo_dispositivo` VALUES (1,'Portátil'),(2,'Tablet');
/*!40000 ALTER TABLE `tipo_dispositivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_persona`
--

DROP TABLE IF EXISTS `tipo_persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_persona` (
  `Id_tipo_persona` int(50) NOT NULL,
  `Rol_tipo_persona` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_tipo_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_persona`
--

LOCK TABLES `tipo_persona` WRITE;
/*!40000 ALTER TABLE `tipo_persona` DISABLE KEYS */;
INSERT INTO `tipo_persona` VALUES (1,'Aprendiz'),(2,'Instructor'),(3,'Visitante'),(4,'Funcionario');
/*!40000 ALTER TABLE `tipo_persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turno`
--

DROP TABLE IF EXISTS `turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `turno` (
  `Id_turno` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Turno` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_turno`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno`
--

LOCK TABLES `turno` WRITE;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` VALUES (1,'Mañana-Tarde'),(2,'Tarde-Mañana');
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turno_fecha`
--

DROP TABLE IF EXISTS `turno_fecha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `turno_fecha` (
  `Id_turno` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Inicio_turno` datetime(4) NOT NULL,
  `Fin_turno` datetime(4) NOT NULL,
  KEY `turno_fecha_ibfk_1_idx` (`Id_turno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno_fecha`
--

LOCK TABLES `turno_fecha` WRITE;
/*!40000 ALTER TABLE `turno_fecha` DISABLE KEYS */;
/*!40000 ALTER TABLE `turno_fecha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vigilante`
--

DROP TABLE IF EXISTS `vigilante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vigilante` (
  `Id_vigilante` bigint(50) NOT NULL,
  `Nombre_vigilante` varchar(50) NOT NULL,
  `Apellido_vigilante` varchar(50) NOT NULL,
  `Id_turno` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Contraseña` tinyblob NOT NULL,
  `Usuario` varchar(50) NOT NULL,
  `Tipo_usuario` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_vigilante`),
  KEY `vigilante_ibfk_1_idx` (`Id_turno`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vigilante`
--

LOCK TABLES `vigilante` WRITE;
/*!40000 ALTER TABLE `vigilante` DISABLE KEYS */;
INSERT INTO `vigilante` VALUES (1122,'Admin','Administrador',1,'0','admin','Administrador'),(12345,'Guillermo','Niebles',1,'4512','ganiebles','Vigilante');
/*!40000 ALTER TABLE `vigilante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'soft'
--

--
-- Dumping routines for database 'soft'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-27 17:41:06
