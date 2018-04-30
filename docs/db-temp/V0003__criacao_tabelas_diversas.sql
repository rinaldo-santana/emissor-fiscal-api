CREATE TABLE `pais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_ibge` varchar(45) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=UTF8;


CREATE TABLE `estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `sigla` varchar(45) DEFAULT NULL,
  `codigo_ibge` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_estado_1` FOREIGN KEY (`id`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


CREATE TABLE `cidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `codigo_ibge` varchar(45) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cidade_1_idx` (`estado`),
  CONSTRAINT `fk_cidade_1` FOREIGN KEY (`estado`) REFERENCES `estado` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


CREATE TABLE `regime_tributario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;



CREATE TABLE `perfil_tributario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Inscricao_estadual` varchar(45) DEFAULT NULL,
  `inscricao_substituicao_tributaria` varchar(45) DEFAULT NULL,
  `regime_tributario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_perfil_tributario_1_idx` (`regime_tributario`),
  CONSTRAINT `fk_perfil_tributario_1` FOREIGN KEY (`regime_tributario`) REFERENCES `regime_tributario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;




CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_pessoa` int(11) DEFAULT NULL,
  `codigo_perfil_tributario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cliente_1_idx` (`codigo_pessoa`),
  KEY `fk_cliente_1_idx1` (`codigo_perfil_tributario`),
  CONSTRAINT `fk_cliente_1` FOREIGN KEY (`codigo_perfil_tributario`) REFERENCES `perfil_tributario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_2` FOREIGN KEY (`codigo_pessoa`) REFERENCES `pessoa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE `empresa` (
  `id` int(11) DEFAULT NULL,
  `codigo_pessoa` int(11) DEFAULT NULL,
  `codigo_perfil_tributario` int(11) DEFAULT NULL,
  KEY `fk_empresa_2_idx` (`codigo_perfil_tributario`),
  KEY `fk_empresa_1_idx` (`codigo_pessoa`),
  CONSTRAINT `fk_empresa_1` FOREIGN KEY (`codigo_pessoa`) REFERENCES `pessoa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_empresa_2` FOREIGN KEY (`codigo_perfil_tributario`) REFERENCES `perfil_tributario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

