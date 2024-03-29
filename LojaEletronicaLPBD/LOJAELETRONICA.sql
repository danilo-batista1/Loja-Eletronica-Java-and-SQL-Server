/*
	Executar primeiro a tabela Clientes, Vendas e depois 
	pular para a Distribuidores, Produtos e por fim 
	Itens_Vendas para o funcinamento correto da query!
*/

CREATE DATABASE LOJAELETRONICA

USE LOJAELETRONICA

/* <><><><><><><><><><><><> TABELA CLIENTES <><><><><><><><><><><><> */

CREATE TABLE CLIENTES (
	COD_CLI INT IDENTITY(1,1),
	NOME VARCHAR(100) NOT NULL,
	DATA_NASC DATE NOT NULL,
	ENDERECO VARCHAR(100) NOT NULL,
	TELEFONE VARCHAR(11) NOT NULL,
	EMAIL VARCHAR(100)
)

SELECT * FROM CLIENTES WHERE EMAIL IS NULL

ALTER TABLE CLIENTES ADD CONSTRAINT PK_COD_CLI PRIMARY KEY(COD_CLI)

SELECT * FROM CLIENTES


/* <><><><><><><><><><><><> TABELA VENDAS <><><><><><><><><><><><> */


CREATE TABLE VENDAS(
	COD_VENDAS INT IDENTITY(1,1),
	DATA DATE NOT NULL,
	HORA DATETIME NOT NULL,
	TOTAL DECIMAL(10,2) NOT NULL,
	FK_COD_CLI INT
) 

ALTER TABLE VENDAS ADD CONSTRAINT PK_COD_VENDAS PRIMARY KEY(COD_VENDAS)
ALTER TABLE VENDAS ADD CONSTRAINT FK_VENDAS_CLIENTES FOREIGN KEY (FK_COD_CLI) REFERENCES CLIENTES (COD_CLI)

SELECT SUM (TOTAL) FROM VENDAS

SELECT * FROM VENDAS

/* <><><><><><><><><><><><> TABELA DISTRIBUIDORES <><><><><><><><><><><><> */


CREATE TABLE DISTRIBUIDORES (
	COD_DIST INT IDENTITY(1,1),
	NOME_FANTASIA VARCHAR(100) NOT NULL,
	RAZAO_SOCIAL VARCHAR(100) NOT NULL,
	TELEFONE VARCHAR(11) NOT NULL,
	EMAIL VARCHAR(100)
)

ALTER TABLE DISTRIBUIDORES ADD CONSTRAINT PK_COD_DIST PRIMARY KEY(COD_DIST)

SELECT * FROM DISTRIBUIDORES


/* <><><><><><><><><><><><> TABELA PRODUTOS <><><><><><><><><><><><> */


CREATE TABLE PRODUTOS (
	COD_PROD INT IDENTITY(1,1),
	PRECO_VENDA DECIMAL(10,2) NOT NULL,
	DESCRICAO VARCHAR(100) NOT NULL,
	DATA_VALIDADE DATE NOT NULL,
	PRECO_CUSTO DECIMAL(10,2) NOT NULL,
	ESTOQUE INT NOT NULL,
	FK_COD_DIS INT
)

ALTER TABLE PRODUTOS ADD CONSTRAINT PK_COD_PROD PRIMARY KEY(COD_PROD)
ALTER TABLE PRODUTOS ADD CONSTRAINT FK_COD_PROD FOREIGN KEY (FK_COD_DIS) REFERENCES DISTRIBUIDORES (COD_DIST)

SELECT * FROM PRODUTOS WHERE DATA_VALIDADE < (SELECT GETDATE())

SELECT * FROM PRODUTOS


/* <><><><><><><><><><><><> TABELA ITENS_VENDAS <><><><><><><><><><><><> */


CREATE TABLE ITENS_VENDAS (
	QUANTIDADE INT NOT NULL,
	SUB_TOTAL DECIMAL(10,2) NOT NULL,
	FK_COD_VENDAS INT
)

ALTER TABLE ITENS_VENDAS ADD CONSTRAINT FK_COD_VENDAS FOREIGN KEY (FK_COD_VENDAS) REFERENCES VENDAS (COD_VENDAS)

SELECT * FROM ITENS_VENDAS


/* <><><><><><><><><><><><> FIM DA QUERY *-* <><><><><><><><><><><><> */