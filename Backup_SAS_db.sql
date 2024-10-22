CREATE DATABASE  IF NOT EXISTS `SAS_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `SAS_db`;
-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: SAS_db
-- ------------------------------------------------------
-- Server version	8.0.39-0ubuntu0.22.04.1

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
-- Table structure for table `Agente`
--

DROP TABLE IF EXISTS `Agente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Agente` (
  `id_agente` int NOT NULL,
  `dni` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `id_area_agente` int DEFAULT NULL,
  PRIMARY KEY (`id_agente`),
  KEY `fk_Agente_1_idx` (`id_area_agente`),
  CONSTRAINT `fk_Agente_1` FOREIGN KEY (`id_area_agente`) REFERENCES `Area` (`id_area`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Agente`
--

LOCK TABLES `Agente` WRITE;
/*!40000 ALTER TABLE `Agente` DISABLE KEYS */;
INSERT INTO `Agente` VALUES (1,'55667788','Carlos Ruiz','carlos@example.com',1),(2,'33445566','Ana Torres','ana@example.com',2),(3,'44556677','Luis Martínez','luis@example.com',3),(4,'77889900','Elena García','elena@example.com',4);
/*!40000 ALTER TABLE `Agente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Area`
--

DROP TABLE IF EXISTS `Area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Area` (
  `id_area` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_area`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Area`
--

LOCK TABLES `Area` WRITE;
/*!40000 ALTER TABLE `Area` DISABLE KEYS */;
INSERT INTO `Area` VALUES (1,'Servicio al cliente','Área encargada de la atención general a clientes'),(2,'Soporte técnico','Área encargada de resolver problemas técnicos'),(3,'Reclamos','Área encargada de gestionar reclamos'),(4,'Back Office','Área encargada de soporte administrativo y de gestión');
/*!40000 ALTER TABLE `Area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ClaseInteraccion`
--

DROP TABLE IF EXISTS `ClaseInteraccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ClaseInteraccion` (
  `id_clase` int NOT NULL,
  `descripcion_clase` varchar(45) DEFAULT NULL,
  `id_tipo_clase` int DEFAULT NULL,
  PRIMARY KEY (`id_clase`),
  KEY `fk_ClaseInteraccion_1_idx` (`id_tipo_clase`),
  CONSTRAINT `fk_ClaseInteraccion_1` FOREIGN KEY (`id_tipo_clase`) REFERENCES `TipoInteraccion` (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ClaseInteraccion`
--

LOCK TABLES `ClaseInteraccion` WRITE;
/*!40000 ALTER TABLE `ClaseInteraccion` DISABLE KEYS */;
INSERT INTO `ClaseInteraccion` VALUES (1,'INFORMACIÓN GENERAL',1),(2,'SERVICIOS CONTRATADOS',1),(3,'SEGUIMIENTO DE SOLICITUDES',1),(4,'TRANSFERENCIAS',1),(5,'ALTA/BAJA DE SERVICIOS',2),(6,'CAMBIO DE SERVICIOS',2),(7,'CANCELACIÓN DE SERVICIOS',2),(8,'MANTENIMIENTO',2),(9,'SUSPENSIÓN/RECONECCIÓN DE SERVICIOS',2),(10,'OTRAS SOLICITUDES',2),(11,'FACTURACIÓN',3),(12,'CALIDAD DEL SERVICIO',3),(13,'ATENCIÓN AL CLIENTE',3),(14,'RESOLUCIÓN DE PROBLEMAS',3),(15,'INSTALACIÓN Y MANTENIMIENTO',3);
/*!40000 ALTER TABLE `ClaseInteraccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cliente` (
  `id_cliente` int NOT NULL,
  `dni_cliente` varchar(20) DEFAULT NULL,
  `nombre_cliente` varchar(45) DEFAULT NULL,
  `telefono_cliente` varchar(45) DEFAULT NULL,
  `email_cliente` varchar(45) DEFAULT NULL,
  `avenida_cliente` varchar(45) DEFAULT NULL,
  `num_casa_cliente` varchar(45) DEFAULT NULL,
  `interior_cliente` varchar(45) DEFAULT NULL,
  `urbanizacion_cliente` varchar(45) DEFAULT NULL,
  `distrito_cliente` varchar(45) DEFAULT NULL,
  `provincia_cliente` varchar(45) DEFAULT NULL,
  `departamento_cliente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES (1,'12345678','Juan Perez','987654321','juan@example.com','Av. Siempre Viva','742','','Springfield','Lima','Lima','Lima'),(2,'87654321','Maria Gomez','912345678','maria@example.com','Av. Los Pinos','123','Apt 3','San Isidro','Lima','Lima','Lima');
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Interaccion`
--

DROP TABLE IF EXISTS `Interaccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Interaccion` (
  `id_interaccion` int NOT NULL,
  `inicio_interaccion` datetime DEFAULT NULL,
  `id_tipo_interaccion` int DEFAULT NULL,
  `id_clase_interaccion` int DEFAULT NULL,
  `id_subclase_interaccion` int DEFAULT NULL,
  `estado_interaccion` varchar(45) DEFAULT NULL,
  `id_agente_interaccion` int DEFAULT NULL,
  `id_servicio_interaccion` int DEFAULT NULL,
  `id_cliente_potencial_interaccion` int DEFAULT NULL,
  `id_area_interaccion` int DEFAULT NULL,
  `fin_interaccion` datetime DEFAULT NULL,
  `detalles_interaccion` text,
  PRIMARY KEY (`id_interaccion`),
  KEY `fk_Interaccion_Clase_idx` (`id_clase_interaccion`),
  KEY `fk_Interaccion_Subclase_idx` (`id_subclase_interaccion`),
  KEY `fk_Interaccion_Agente_idx` (`id_agente_interaccion`),
  KEY `fk_Interaccion_Servicio_idx` (`id_servicio_interaccion`),
  KEY `fk_Interaccion_Cliente_idx` (`id_cliente_potencial_interaccion`),
  KEY `fk_Interaccion_Area_idx` (`id_area_interaccion`),
  KEY `fk_Interaccion_Tipo_idx` (`id_tipo_interaccion`),
  CONSTRAINT `fk_Interaccion_Agente` FOREIGN KEY (`id_agente_interaccion`) REFERENCES `Agente` (`id_agente`),
  CONSTRAINT `fk_Interaccion_Area` FOREIGN KEY (`id_area_interaccion`) REFERENCES `Area` (`id_area`),
  CONSTRAINT `fk_Interaccion_Clase` FOREIGN KEY (`id_clase_interaccion`) REFERENCES `ClaseInteraccion` (`id_clase`),
  CONSTRAINT `fk_Interaccion_Cliente` FOREIGN KEY (`id_cliente_potencial_interaccion`) REFERENCES `Cliente` (`id_cliente`),
  CONSTRAINT `fk_Interaccion_Servicio` FOREIGN KEY (`id_servicio_interaccion`) REFERENCES `Servicio` (`id_servicio`),
  CONSTRAINT `fk_Interaccion_Subclase` FOREIGN KEY (`id_subclase_interaccion`) REFERENCES `SubclaseInteraccion` (`id_subclase`),
  CONSTRAINT `fk_Interaccion_Tipo` FOREIGN KEY (`id_tipo_interaccion`) REFERENCES `TipoInteraccion` (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Interaccion`
--

LOCK TABLES `Interaccion` WRITE;
/*!40000 ALTER TABLE `Interaccion` DISABLE KEYS */;
INSERT INTO `Interaccion` VALUES (1,'2024-10-01 10:00:00',1,1,1,'CERRADO',1,1,NULL,1,'2024-10-01 10:05:00','Consulta sobre planes y tarifas'),(2,'2024-10-02 11:00:00',2,6,22,'PENDIENTE',2,2,NULL,4,NULL,'Cambio de plan solicitado'),(3,'2024-10-03 12:00:00',3,11,33,'EN PROCESO',1,1,NULL,3,NULL,'Reclamo por error en facturación'),(4,'2024-10-04 13:00:00',2,8,28,'ABIERTO',2,2,NULL,2,NULL,'Solicitud de visita técnica para avería masiva'),(5,'2024-10-05 14:00:00',3,12,35,'CANCELADO',1,1,NULL,3,NULL,'Reclamo cancelado por el cliente');
/*!40000 ALTER TABLE `Interaccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Servicio`
--

DROP TABLE IF EXISTS `Servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Servicio` (
  `id_servicio` int NOT NULL,
  `id_cliente_servicio` int DEFAULT NULL,
  `tipo_servicio` varchar(45) DEFAULT NULL,
  `avenida_servicio` varchar(45) DEFAULT NULL,
  `num_casa_servicio` varchar(45) DEFAULT NULL,
  `interior_servicio` varchar(45) DEFAULT NULL,
  `urbanizacion_servicio` varchar(45) DEFAULT NULL,
  `distrito_servicio` varchar(45) DEFAULT NULL,
  `provincia_servicio` varchar(45) DEFAULT NULL,
  `departamento_servicio` varchar(45) DEFAULT NULL,
  `fecha_inicio_servicio` varchar(45) DEFAULT NULL,
  `fecha_fin_servicio` varchar(45) DEFAULT NULL,
  `estado_servicio` varchar(45) DEFAULT NULL,
  `velocidad_servicio` varchar(45) DEFAULT NULL,
  `detalles_servicio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_servicio`),
  UNIQUE KEY `id_servicio_UNIQUE` (`id_servicio`),
  KEY `fk_servicio_cliente_idx` (`id_cliente_servicio`),
  CONSTRAINT `fk_servicio_cliente` FOREIGN KEY (`id_cliente_servicio`) REFERENCES `Cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Servicio`
--

LOCK TABLES `Servicio` WRITE;
/*!40000 ALTER TABLE `Servicio` DISABLE KEYS */;
INSERT INTO `Servicio` VALUES (1,1,'Internet HFC','Av. Siempre Viva','742','','Springfield','Lima','Lima','Lima','2023-01-01',NULL,'Activo','100Mbps','Ninguno'),(2,2,'Internet FTTH','Av. Los Pinos','123','Apt 3','San Isidro','Lima','Lima','Lima','2023-02-01',NULL,'Activo','500Mbps','Ninguno');
/*!40000 ALTER TABLE `Servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SubclaseInteraccion`
--

DROP TABLE IF EXISTS `SubclaseInteraccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SubclaseInteraccion` (
  `id_subclase` int NOT NULL,
  `descripcion_subclase` varchar(45) DEFAULT NULL,
  `id_clase_subclase` int DEFAULT NULL,
  PRIMARY KEY (`id_subclase`),
  KEY `fk_SubclaseInteraccion_1_idx` (`id_clase_subclase`),
  CONSTRAINT `fk_SubclaseInteraccion_1` FOREIGN KEY (`id_clase_subclase`) REFERENCES `ClaseInteraccion` (`id_clase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubclaseInteraccion`
--

LOCK TABLES `SubclaseInteraccion` WRITE;
/*!40000 ALTER TABLE `SubclaseInteraccion` DISABLE KEYS */;
INSERT INTO `SubclaseInteraccion` VALUES (1,'Postventa',1),(2,'Venta',1),(3,'Otras Consultas',1),(4,'Cobranza y Recaudación',2),(5,'Facturación',2),(6,'Planes Tarifas Promociones',2),(7,'Estado de Act/Des de Paquetes Adicionales',3),(8,'Estado de Cambio de Plan o Traslados',3),(9,'Estado de Cancelación de Servicio',3),(10,'Estado de Reclamos y Libro de Reclamaciones',3),(11,'Estado de Avería',3),(12,'Estado de Suspensión o Reconexión',3),(13,'Instalaciones (Altas Nuevas)',3),(14,'Estado de Otras Solicitudes',3),(15,'Soporte Técnico',4),(16,'Servicio al Cliente',4),(17,'Ventas',4),(18,'Reclamos',4),(19,'Activación de Paquetes Adicionales',5),(20,'Desactivación de Paquetes Adicionales',5),(21,'Instalaciones (Altas Nuevas)',5),(22,'Cambio de Plan',6),(23,'Traslado Interno/Externo de Servicio',6),(24,'Cancelación de Servicio',7),(25,'Desistimiento de Cancelación',7),(26,'Averías Internas',8),(27,'Visita Técnica',8),(28,'Averías Masivas',8),(29,'Solución en Línea',8),(30,'Suspensión de Servicio',9),(31,'Reconexión de Servicio',9),(32,'Otras Solicitudes',10),(33,'Errores en Facturación',11),(34,'Cobros Indebidos',11),(35,'Conexión Intermitente',12),(36,'Baja Velocidad',12),(37,'Interrupciones del Servicio',12),(38,'Tiempo de Espera',13),(39,'Calidad de la Atención',13),(40,'Ineficiencia en la Solución',14),(41,'Problemas Recurrentes',14),(42,'Retrasos en Instalación',15),(43,'Problemas después del Mantenimiento',15);
/*!40000 ALTER TABLE `SubclaseInteraccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoInteraccion`
--

DROP TABLE IF EXISTS `TipoInteraccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `TipoInteraccion` (
  `id_tipo` int NOT NULL,
  `descripcion_tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoInteraccion`
--

LOCK TABLES `TipoInteraccion` WRITE;
/*!40000 ALTER TABLE `TipoInteraccion` DISABLE KEYS */;
INSERT INTO `TipoInteraccion` VALUES (1,'CONSULTA'),(2,'SOLICITUD'),(3,'RECLAMO');
/*!40000 ALTER TABLE `TipoInteraccion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-21 13:32:05
