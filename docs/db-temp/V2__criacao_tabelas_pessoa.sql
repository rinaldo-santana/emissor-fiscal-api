
CREATE TABLE cidade (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  codigo_ibge VARCHAR(45),
  uf VARCHAR(2)
);

CREATE TABLE endereco_pessoa (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  logradouro VARCHAR(40),
  numero VARCHAR(8),
  cep VARCHAR(8),
  complemento VARCHAR(30),
  bairro VARCHAR(30),
  cidade_id BIGINT NOT NULL,  
  ponto_referencia VARCHAR(45)
  
  CONSTRAINT fk_pessoa_cidade FOREIGN KEY (cidade_id) REFERENCES cidade (id)
);


CREATE TABLE pessoa (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(60) NOT NULL,
  data_nascimento DATE,
  endereco_pessoa_id BIGINT NOT NULL,

  CONSTRAINT fk_endereco_pessoa FOREIGN KEY (endereco_pessoa_id) REFERENCES endereco_pessoa (id)
);

