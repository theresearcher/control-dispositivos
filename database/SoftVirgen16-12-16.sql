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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingreso_dispositivo`
--

LOCK TABLES `ingreso_dispositivo` WRITE;
/*!40000 ALTER TABLE `ingreso_dispositivo` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vigilante`
--

LOCK TABLES `vigilante` WRITE;
/*!40000 ALTER TABLE `vigilante` DISABLE KEYS */;
INSERT INTO `vigilante` VALUES (1122,'Admin','Administrador',1,'0','admin','Administrador');
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

-- Dump completed on 2016-12-16 11:26:32
