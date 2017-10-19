/*
CREATE TABLE `notafiscal` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT ,
  `numero` BIGINT NOT NULL,
  `serie` VARCHAR(3) NOT NULL,
  `modelo` VARCHAR(2) NOT NULL,
  `carga` INTEGER NOT NULL,
  `valor_produtos` FLOAT,
  `valor_contabil` FLOAT
  PRIMARY KEY (`numero`, `serie`, `modelo`));
*/
--create table notafiscal (
--id bigint not null, 
--carga integer, 
--modelo varchar(255), 
--numero bigint, 
--serie varchar(255), 
--valor_contabil decimal(19,2), 
--valor_produtos decimal(19,2), 
--primary key (id))