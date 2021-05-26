-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 20-Nov-2018 às 17:03
-- Versão do servidor: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `colinf`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `chamado`
--

DROP TABLE IF EXISTS `chamado`;
CREATE TABLE IF NOT EXISTS `chamado` (
  `registro` varchar(11) DEFAULT NULL,
  `nome_prof` varchar(50) DEFAULT NULL,
  `id_lab` int(11) DEFAULT NULL,
  `status` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `chamado`
--

INSERT INTO `chamado` (`registro`, `nome_prof`, `id_lab`, `status`) VALUES
('1234', 'Marcus Aurelio Funceica', 1, 'true'),
('1234', 'Marcus Aurelio Funceica', 1, 'true');

-- --------------------------------------------------------

--
-- Estrutura da tabela `chat`
--

DROP TABLE IF EXISTS `chat`;
CREATE TABLE IF NOT EXISTS `chat` (
  `nome_remt` varchar(50) DEFAULT NULL,
  `nome_dest` varchar(50) DEFAULT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `corpo` varchar(250) DEFAULT NULL,
  `data` date NOT NULL,
  `hora` varchar(5) NOT NULL,
  `abert_fechad` varchar(7) NOT NULL,
  `prioridade` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `chat`
--

INSERT INTO `chat` (`nome_remt`, `nome_dest`, `titulo`, `corpo`, `data`, `hora`, `abert_fechad`, `prioridade`) VALUES
('Marcus Aurelio Funceica', 'Rodrigo Correia Braga', 'Problema tecnico', 'Qualquer COisa', '2018-11-20', '13:25', 'Fechado', 0),
('Marcus Aurelio Funceica', 'Rodrigo Correia Braga', 'deu certo ?', 'deuuuuuuu', '2018-11-20', '14:00', 'Fechado', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `laboratorios`
--

DROP TABLE IF EXISTS `laboratorios`;
CREATE TABLE IF NOT EXISTS `laboratorios` (
  `id_lab` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `laboratorios`
--

INSERT INTO `laboratorios` (`id_lab`) VALUES
(8);

-- --------------------------------------------------------

--
-- Estrutura da tabela `online_prof`
--

DROP TABLE IF EXISTS `online_prof`;
CREATE TABLE IF NOT EXISTS `online_prof` (
  `identificacao` varchar(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `online_prof`
--

INSERT INTO `online_prof` (`identificacao`) VALUES
('1234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `online_trainee`
--

DROP TABLE IF EXISTS `online_trainee`;
CREATE TABLE IF NOT EXISTS `online_trainee` (
  `matricula` varchar(12) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `online_trainee`
--

INSERT INTO `online_trainee` (`matricula`) VALUES
('20183636');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

DROP TABLE IF EXISTS `professor`;
CREATE TABLE IF NOT EXISTS `professor` (
  `nome` varchar(50) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `usuario` varchar(15) DEFAULT NULL,
  `senha` varchar(14) DEFAULT NULL,
  `registro` varchar(11) NOT NULL,
  PRIMARY KEY (`registro`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`nome`, `email`, `cpf`, `telefone`, `data`, `usuario`, `senha`, `registro`) VALUES
('Marcus Aurelio Funceica', 'marcus.fonc@ifs.com.br', '43577177527', '988765765', '1990-06-12', 'marcusfon', '12345m', '1234'),
('Anna Carvalho Ribeiro', 'anacarri@ifs.com.br', '19802105511', '987547683', '1988-03-17', 'anacarri', 'ana123', '5453'),
('Enzo Oliveira Cardoso', 'enzooliveira@ifs.com.br', '27551181563', '964637564', '1992-05-22', 'enzoolica', '12#enzo', '4534');

-- --------------------------------------------------------

--
-- Estrutura da tabela `trainee`
--

DROP TABLE IF EXISTS `trainee`;
CREATE TABLE IF NOT EXISTS `trainee` (
  `nome` varchar(50) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `usuario` varchar(15) DEFAULT NULL,
  `senha` varchar(14) DEFAULT NULL,
  `matricula` varchar(12) NOT NULL,
  `dia_servico` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `trainee`
--

INSERT INTO `trainee` (`nome`, `email`, `cpf`, `telefone`, `data`, `usuario`, `senha`, `matricula`, `dia_servico`) VALUES
('Rodrigo Correia Braga', 'rodrigo.correia@ifs.com.br', '07885670554', '988798100', '2000-12-12', 'olwolf', '123', '20183636', 'Terça-feira'),
('Rodrigo Correia Braga', 'rodrigo.20001999@gmail.com', '07885670554', '523523', '2000-12-12', 'usa', 'usa', '25325', 'Quinta-feira');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
