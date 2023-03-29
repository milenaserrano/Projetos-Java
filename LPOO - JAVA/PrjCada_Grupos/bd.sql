-- --------------------------------------------------------
-- Servidor:                     localhost
-- Versão do servidor:           10.1.37-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para loja
DROP DATABASE IF EXISTS `loja`;
CREATE DATABASE IF NOT EXISTS `loja` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `loja`;

-- Copiando estrutura para tabela loja.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  `telefone_contato` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela loja.clientes: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
REPLACE INTO `clientes` (`codigo`, `nome`, `endereco`, `bairro`, `cep`, `cidade`, `estado`, `telefone_contato`) VALUES
	(1, 'João Santana', 'Rua X nº 100', 'Centro', '14500-000', 'Sales Oliveira', 'SP', '16-3852-1112'),
	(2, 'Maria Beatriz Souza', 'Av. das Acácias, 300', 'Alto da Boa Vista', '14750-000', 'Nuporanga', 'SP', '16-3847-8881'),
	(3, 'Antônia Quirino Bento', 'Rua das Amélias, 77', 'Centro', '16600-000', 'Franca', 'SP', '16-3721-9938'),
	(4, 'João Carlos Neto', 'Av. 02, 133', 'Centro', '14620-000', 'Orlândia', 'SP', '16-3726-5555'),
	(5, 'Júlia Souza Silva', 'Av. 12, 787', 'Jd. Nova Orlândia', '14620-000', 'Orlândia', 'SP', '16-3826-1115'),
	(6, 'Pedro Henrique Sobral', 'Av. São Paulo', 'Centro', '14660-000', 'São Joaquim da Barra', 'SP', '16-3728-5555');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Copiando estrutura para tabela loja.fornecedores
DROP TABLE IF EXISTS `fornecedores`;
CREATE TABLE IF NOT EXISTS `fornecedores` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome_fantasia` varchar(30) DEFAULT NULL,
  `razao_social` varchar(50) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `insc_estadual` varchar(15) DEFAULT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela loja.fornecedores: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedores` DISABLE KEYS */;
REPLACE INTO `fornecedores` (`codigo`, `nome_fantasia`, `razao_social`, `cnpj`, `insc_estadual`, `endereco`, `bairro`, `cep`, `cidade`, `estado`, `telefone`) VALUES
	(1, 'SBS', 'SBS Ltda', '11.111.111/0001-11', '111.111.111.111', 'Rua Antônio de Sá', 'Centro', '14870-000', 'Ribeirão Preto', 'SP', '16'),
	(2, 'Moto Honda', 'Honda Ltda', '22.222.222/0002-22', '222.222.222.222', 'Rua Chafic,121', 'Sto Amaro', '32500-999', 'São Paulo', 'SP', '11');
/*!40000 ALTER TABLE `fornecedores` ENABLE KEYS */;

-- Copiando estrutura para tabela loja.grupos
DROP TABLE IF EXISTS `grupos`;
CREATE TABLE IF NOT EXISTS `grupos` (
  `codigo` int(11) NOT NULL,
  `grupo` varchar(15) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela loja.grupos: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `grupos` DISABLE KEYS */;
REPLACE INTO `grupos` (`codigo`, `grupo`) VALUES
	(1, 'Original'),
	(2, 'Paralela'),
	(3, 'Similar');
/*!40000 ALTER TABLE `grupos` ENABLE KEYS */;

-- Copiando estrutura para tabela loja.pecas
DROP TABLE IF EXISTS `pecas`;
CREATE TABLE IF NOT EXISTS `pecas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `custo_unitario` float DEFAULT NULL,
  `valor_venda` float DEFAULT NULL,
  `estoque_atual` float DEFAULT NULL,
  `codigo_grupo` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_pecas_grupos` (`codigo_grupo`),
  CONSTRAINT `FK_pecas_grupos` FOREIGN KEY (`codigo_grupo`) REFERENCES `grupos` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela loja.pecas: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `pecas` DISABLE KEYS */;
REPLACE INTO `pecas` (`codigo`, `nome`, `custo_unitario`, `valor_venda`, `estoque_atual`, `codigo_grupo`) VALUES
	(1, 'Pneu 90x90x18', 100.5, 178.35, 9, 1),
	(2, 'Câmara de Ar 18', 27.7, 63, 13, 1),
	(3, 'Óleo de Motor 20w50', 17.7, 27.5, 48, 1),
	(4, 'Vela de Ignição 125', 9.65, 18, 30, 1),
	(5, 'Cabo de Freio Biz', 10, 20, 3, 1),
	(6, 'Cabo de Embreagem FAN', 25, 37, 1, 1),
	(7, 'Aro da Roda 18', 79, 190, 0, 1);
/*!40000 ALTER TABLE `pecas` ENABLE KEYS */;

-- Copiando estrutura para tabela loja.usuarios
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `login` varchar(15) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `situacao` char(1) DEFAULT 'L',
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela loja.usuarios: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
REPLACE INTO `usuarios` (`login`, `nome`, `senha`, `situacao`) VALUES
	('Julia', 'Julia Santos', '787878', 'L'),
	('Matheus', 'Matheus Carneiro Souza', 'RYU8787', 'B'),
	('Sofia', 'Sofia Costa Silva', 'ABC123', 'L');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
