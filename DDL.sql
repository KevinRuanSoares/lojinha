/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kevin
 * Created: 16/12/2020
 */

CREATE TABLE IF NOT EXISTS usuarios (
  id INT NOT NULL AUTO_INCREMENT,
  login VARCHAR(100) NOT NULL,
  senha CHAR(32) NOT NULL,
  admin BOOLEAN NOT NULL DEFAULT 0,
  funcionario BOOLEAN NOT NULL DEFAULT 0,
  data_cad DATETIME DEFAULT NOW(),
  data_update DATETIME DEFAULT NOW() ON UPDATE NOW(),
  PRIMARY KEY (id))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS clientes (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  data_cad DATETIME DEFAULT NOW(),
  data_update DATETIME DEFAULT NOW() ON UPDATE NOW(),
  PRIMARY KEY (id))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS produtos (
  id INT NOT NULL AUTO_INCREMENT,
  decricao VARCHAR(100) NOT NULL,
  valor DECIMAL(10,2) NOT NULL,
  quantidade INT(11) NOT NULL,
  data_cad DATETIME DEFAULT NOW(),
  data_update DATETIME DEFAULT NOW() ON UPDATE NOW(),
  PRIMARY KEY (id))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS venda (
  id INT NOT NULL AUTO_INCREMENT,
  valor DECIMAL(10,2) NOT NULL,
  metodo_pagamento VARCHAR(20) NOT NULL,
  quantidade INT NOT NULL,
  data_cad DATETIME DEFAULT NOW(),
  data_update DATETIME DEFAULT NOW() ON UPDATE NOW(),
  clientes_id INT NOT NULL,
  usuarios_id INT NOT NULL,
  PRIMARY KEY (id, clientes_id, usuarios_id),
  INDEX fk_venda_clientes1_idx (clientes_id ASC) VISIBLE,
  INDEX fk_venda_usuarios1_idx (usuarios_id ASC) VISIBLE,
  CONSTRAINT fk_venda_clientes1
    FOREIGN KEY (clientes_id)
    REFERENCES clientes (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_venda_usuarios1
    FOREIGN KEY (usuarios_id)
    REFERENCES usuarios (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB



CREATE TABLE IF NOT EXISTS venda_itens (
  id INT NOT NULL AUTO_INCREMENT,
  valor VARCHAR(45) NOT NULL,
  quantidade INT NOT NULL,
  data_cad DATETIME DEFAULT NOW(),
  data_update DATETIME DEFAULT NOW() ON UPDATE NOW(),
  produtos_id INT NOT NULL,
  venda_id INT NOT NULL,
  PRIMARY KEY (id, produtos_id, venda_id),
  INDEX fk_venda_itens_produtos_idx (produtos_id ASC) VISIBLE,
  INDEX fk_venda_itens_venda1_idx (venda_id ASC) VISIBLE,
  CONSTRAINT fk_venda_itens_produtos
    FOREIGN KEY (produtos_id)
    REFERENCES produtos (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_venda_itens_venda1
    FOREIGN KEY (venda_id)
    REFERENCES venda (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB