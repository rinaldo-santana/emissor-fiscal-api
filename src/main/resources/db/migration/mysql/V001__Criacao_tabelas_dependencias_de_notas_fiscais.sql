USE emissor_fiscal;

ALTER SCHEMA emissor_fiscal  DEFAULT COLLATE utf8_general_ci ;


CREATE TABLE cidades (
    cidade_codigo BIGINT NOT NULL PRIMARY KEY COMMENT 'Codigo do muncipios do IBGE',
    cidade_nome VARCHAR(30) NOT NULL,
    cidade_uf VARCHAR(2) NOT NULL,
    cidade_pais VARCHAR(10)  NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE naturezas_operacoes (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE empresas (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    endereco_logradouro VARCHAR(80),
    endereco_numero VARCHAR(8),
    endereco_cep VARCHAR(8),
    endereco_complemento VARCHAR(80),
    endereco_bairro VARCHAR(50),
    endereco_codigo_cidade BIGINT NOT NULL ,
    endereco_ponto_referencia VARCHAR(60),

    cnpj VARCHAR(14) NOT NULL,
    inscricao_estadual VARCHAR(14) NOT NULL,

    CONSTRAINT fk_empresas_cidade_ibge_codigo FOREIGN KEY (endereco_codigo_cidade) 
         REFERENCES cidades (cidade_codigo)

)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE pessoas_telefones (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    pessoa_id BIGINT NOT NULL,
    telefone VARCHAR(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

CREATE TABLE pessoas_emails (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    pessoa_id BIGINT NOT NULL,
    email VARCHAR(30)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;


CREATE TABLE clientes (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    endereco_logradouro VARCHAR(80),
    endereco_numero VARCHAR(8),
    endereco_cep VARCHAR(8),
    endereco_complemento VARCHAR(80),
    endereco_bairro VARCHAR(50),
    endereco_codigo_cidade BIGINT NOT NULL ,
    endereco_ponto_referencia VARCHAR(60),

    cadastro_nacional VARCHAR(14) COMMENT 'CNPJ ou o CPF do cliente',
    registro_estadual VARCHAR(10) COMMENT 'Inscricao Estadual ou RG do cliente',

    CONSTRAINT fk_cliente_pj_ibge_codigo FOREIGN KEY (endereco_codigo_cidade) 
         REFERENCES cidades (cidade_codigo)    

)ENGINE=InnoDB DEFAULT CHARSET=utf8;;
