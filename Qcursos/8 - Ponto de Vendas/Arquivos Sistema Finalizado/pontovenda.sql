-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30-Maio-2018 às 18:41
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pontovenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `codigo_pro` varchar(100) NOT NULL,
  `tipo_pro` varchar(100) NOT NULL,
  `nome_pro` varchar(100) NOT NULL,
  `valor_pro` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`codigo_pro`, `tipo_pro`, `nome_pro`, `valor_pro`) VALUES
('PRO0001', 'BEBIDAS', 'COCA COLA', '4.00'),
('PRO0002', 'CARNES', 'FRANGO CONGELADO', '10.00'),
('PRO0003', 'LACTINEOS', 'IOGURTE', '6.00'),
('PRO0004', 'VERDURAS', 'ALFACE', '2.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `codigo_us` varchar(50) NOT NULL,
  `nome_us` varchar(100) NOT NULL,
  `sexo_us` varchar(20) NOT NULL,
  `tipo_us` varchar(30) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`codigo_us`, `nome_us`, `sexo_us`, `tipo_us`, `senha`) VALUES
('USU0001', 'HUGO', 'MASCULINO', 'ADM', '123'),
('USU0002', 'PAULA', 'FEMININO', 'NORMAL', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `numero_ven` varchar(30) NOT NULL,
  `total_ven` decimal(10,2) NOT NULL,
  `data_ven` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`numero_ven`, `total_ven`, `data_ven`) VALUES
('00000001', '30.00', '30/05/2018'),
('00000002', '6.00', '30/05/2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`codigo_pro`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`codigo_us`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`numero_ven`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
