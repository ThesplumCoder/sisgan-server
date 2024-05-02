CREATE TABLE `USERS` (
  `id_user` int(11) NOT NULL,
  `id_card` varchar(20) DEFAULT NULL,
  `id_driving_livense` int(11) DEFAULT NULL,
  `id_ica_official` int(11) DEFAULT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `mark` varchar(100) DEFAULT NULL,
  `farm_name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- sisgan_server.CATTLES definition

CREATE TABLE `CATTLES` (
  `id_cattles` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `weigth` int(11) DEFAULT NULL,
  `heigth` int(11) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `breed` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_cattles`),
  KEY `id_user` (`id_user`),
  CONSTRAINT `cattles_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `USERS` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- sisgan_server.LOTS definition

CREATE TABLE `LOTS` (
  `id_lots` int(11) NOT NULL,
  `id_cattle` int(11) DEFAULT NULL,
  `name` varchar(80) NOT NULL,
  PRIMARY KEY (`id_lots`),
  KEY `id_cattle` (`id_cattle`),
  CONSTRAINT `lots_ibfk_1` FOREIGN KEY (`id_cattle`) REFERENCES `CATTLES` (`id_cattles`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- sisgan_server.ROLES definition

CREATE TABLE `ROLES` (
  `id_roles` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `rol` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_roles`),
  KEY `id_user` (`id_user`),
  CONSTRAINT `roles_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `USERS` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- sisgan_server.INTERNAL_MOVEMENT_GUIDES definition

CREATE TABLE `INTERNAL_MOVEMENT_GUIDES` (
  `id_internal_movement_guides` int(11) NOT NULL,
  `id_lot` int(11) DEFAULT NULL,
  `vehicle_plate` varchar(10) DEFAULT NULL,
  `origin` varchar(100) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `signature_petitioner` varchar(100) DEFAULT NULL,
  `id_driving_license` int(11) DEFAULT NULL,
  `application_date` date DEFAULT NULL,
  `movement_date` date DEFAULT NULL,
  `signature_ica_official` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_internal_movement_guides`),
  KEY `id_lot` (`id_lot`),
  KEY `id_transporter` (`id_driving_license`),
  CONSTRAINT `internal_movement_guides_ibfk_1` FOREIGN KEY (`id_lot`) REFERENCES `LOTS` (`id_lots`),
  CONSTRAINT `internal_movement_guides_ibfk_2` FOREIGN KEY (`id_driving_license`) REFERENCES `USERS` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
