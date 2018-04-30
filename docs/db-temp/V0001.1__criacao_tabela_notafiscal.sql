CREATE TABLE modelo_documento (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    modelo VARCHAR(3) NOT NULL,
    nome VARCHAR(45) NOT NULL,       
    CONSTRAINT uc_modelo_codumento UNIQUE (nome, modelo)
);

CREATE TABLE modelo_documento_series (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    modelo_documento_id INT NOT NULL,
    serie INT NOT NULL,
    expirado_em DATE,
    CONSTRAINT fk_modelo_documento_series FOREIGN KEY (modelo_documento_id) REFERENCES modelo_documento (id),
    CONSTRAINT uc_modelo_codumento_series UNIQUE (modelo_documento_id, serie, expirado_em)
);

CREATE TABLE natureza_operacao (
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(60)
);



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




CREATE TABLE pessoa (
  id int(11) NOT NULL AUTO_INCREMENT,
  cnpj varchar(45) DEFAULT NULL,
  nome varchar(45) DEFAULT NULL,
  logradouro varchar(45) DEFAULT NULL,
  numero varchar(45) DEFAULT NULL,
  bairro varchar(45) DEFAULT NULL,
  cidade int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_pessoa_1_idx (cidade),
  CONSTRAINT fk_pessoa_1 FOREIGN KEY (cidade) REFERENCES cidade (id) ON DELETE NO ACTION ON UPDATE NO ACTION
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


CREATE TABLE `empresa` (
  `id` int(11) DEFAULT NULL,
  `codigo_pessoa` int(11) DEFAULT NULL,
  `codigo_perfil_tributario` int(11) DEFAULT NULL,
  KEY `fk_empresa_2_idx` (`codigo_perfil_tributario`),
  KEY `fk_empresa_1_idx` (`codigo_pessoa`),
  CONSTRAINT `fk_empresa_1` FOREIGN KEY (`codigo_pessoa`) REFERENCES `pessoa` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_empresa_2` FOREIGN KEY (`codigo_perfil_tributario`) REFERENCES `perfil_tributario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


CREATE TABLE cliente (
    id INT(11) NOT NULL PRIMARY key auto_increment,
    empresa_id INT(11) NOT NULL
   -- CONSTRAINT fk_empresa_cliente FOREIGN KEY (empresa_id) REFERENCES empresa (id) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;


CREATE TABLE notafiscal (
    id BIGINT PRIMARY  KEY AUTO_INCREMENT,
    empresa_id INT NOT NULL,
    modelo VARCHAR(3) NOT NULL,
    serie BIGINT NOT NULL,
    numero BIGINT NOT NULL,
    data_emissao DATE NOT NULL,
    natureza_operacao_id INT NOT NULL,
    cliente_id BIGINT NOT NULL,
    valor_base_icms DECIMAL(18,6)  DEFAULT 0,       
    valor_icms  DECIMAL(18,6) DEFAULT 0,
    valor_base_icms_st DECIMAL(18,6) DEFAULT 0,
    valor_icms_st DECIMAL(18,6) DEFAULT 0,
    valor_produtos DECIMAL(18,6) DEFAULT 0,
    valor_frete DECIMAL(18,6) DEFAULT 0,
    valor_seguro DECIMAL(18,6) DEFAULT 0,
    valor_desconto DECIMAL(18,6) DEFAULT 0,
    valor_ipi DECIMAL(18,6) DEFAULT 0,
    valor_pis DECIMAL(18,6) DEFAULT 0,
    valor_cofins DECIMAL(18,6) DEFAULT 0,
    valor_outros DECIMAL(18,6) DEFAULT 0,
    valor_nota_fiscal DECIMAL(18,6) DEFAULT 0,
    valor_aprox_tributos DECIMAL(18,6) DEFAULT 0,    

    CONSTRAINT uc_notafiscal UNIQUE (empresa_id, modelo, serie, numero),
    CONSTRAINT fk_natureza_operacao_notafiscal FOREIGN KEY (natureza_operacao_id) REFERENCES natureza_operacao (id)
);


CREATE TABLE notafiscal_detalhe (
    id BIGINT NOT NULL PRIMARY KEY,
    notafiscal_id BIGINT NOT NULL,
    notafiscal_empresa_id  BIGINT NOT NULL,
    notafiscal_modelo  VARCHAR(3) NOT NULL,
    notafiscal_serie  INT NOT NULL,
    produto_id BIGINT NOT NULL,
    produto_item varchar(45) NOT NULL,
    produto_ean varchar(45) DEFAULT NULL,
    produto_cest varchar(45) DEFAULT NULL,
    produto_ncm varchar(45) DEFAULT NULL,
    produto_cfop varchar(45) DEFAULT NULL,
    produto_unidade varchar(45) DEFAULT NULL,
    produto_quantidade varchar(45) DEFAULT NULL,
    produto_valor_unitario varchar(45) DEFAULT NULL,
    produto_valor_total varchar(45) DEFAULT NULL,
    imposto_valor_aprox_tributos varchar(45) DEFAULT NULL,
    imposto_icms_cst varchar(45) DEFAULT NULL,
    imposto_icms_base_calculo varchar(45) DEFAULT NULL,
    imposto_icms_aliquota varchar(45) DEFAULT NULL,
    imposto_icms_valor varchar(45) DEFAULT NULL,
    imposto_ipi_cst varchar(45) DEFAULT NULL,
    imposto_ipi_aliquota varchar(45) DEFAULT NULL,
    imposto_ipi_valor varchar(45) DEFAULT NULL,
    imposto_pis_cst varchar(45) DEFAULT NULL,
    imposto_pis_base_calculo varchar(45) DEFAULT NULL,
    imposto_pis_aliquota varchar(45) DEFAULT NULL,
    imposto_pis_valor varchar(45) DEFAULT NULL,
    imposto_cofins_cst varchar(45) DEFAULT NULL,
    imposto_cofins_base_calculo varchar(45) DEFAULT NULL,
    imposto_cofins_aliquota varchar(45) DEFAULT NULL,
    imposto_cofins_valor varchar(45) DEFAULT NULL
);

CREATE TABLE ean (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(8) NOT NULL,
    nome VARCHAR(300) NOT NULL,
    data_validade DATE
);

CREATE TABLE cfop (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(4) NOT NULL,
    nome VARCHAR(300),
    data_validade DATE
);

CREATE TABLE cest (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(8) NOT NULL,
    ean VARCHAR(8) NOT NULL,
    nome VARCHAR(300),
    data_validade DATE   
);

CREATE TABLE origem_mercadoria (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    codigo INT NOT NULL,
    nome VARCHAR(100)
);

CREATE TABLE situacao_tributaria (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    imposto VARCHAR(10), 
    codigo VARCHAR(3), 
    nome VARCHAR(100)
);

CREATE TABLE situacao_operacao_simples (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(3), 
    nome VARCHAR(100)
);


-- CREATE TABLE perfil_tributario_produto (
-- /**
-- *   definir um NCM e para esse ncm definir as configuraçoes de impostos para operacoes de entrada e saida
-- *
-- *   1 escolho ncm, 2 aba entrada, escolher cfop de entrada,  pis e confin de entrada, ipi entrada, icms {ali(12/7/18),cst, valor }
-- *
-- **/
-- )
