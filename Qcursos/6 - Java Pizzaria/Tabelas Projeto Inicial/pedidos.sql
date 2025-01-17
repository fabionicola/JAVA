-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 06-Out-2016 às 16:45
-- Versão do servidor: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `ped_cod` int(11) NOT NULL,
  `ped_data` date NOT NULL,
  `ped_total` decimal(10,2) NOT NULL,
  `ped_cli_cod` int(10) NOT NULL,
  `ped_fun_cod` int(10) NOT NULL,
  `ped_ent_cod` int(10) NOT NULL,
  `ped_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pedidos`
--

INSERT INTO `pedidos` (`ped_cod`, `ped_data`, `ped_total`, `ped_cli_cod`, `ped_fun_cod`, `ped_ent_cod`, `ped_status`) VALUES
(5, '2016-10-03', '500.00', 1, 1, 1, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`ped_cod`),
  ADD KEY `ped-cli-cod` (`ped_cli_cod`),
  ADD KEY `ped-fun-cod` (`ped_fun_cod`),
  ADD KEY `ped-ent-cod` (`ped_ent_cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `ped_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `ClientePedido` FOREIGN KEY (`ped_cli_cod`) REFERENCES `clientes` (`cli_cod`),
  ADD CONSTRAINT `EntregadorPedido` FOREIGN KEY (`ped_ent_cod`) REFERENCES `entregador` (`ent_cod`),
  ADD CONSTRAINT `FuncionarioPedido` FOREIGN KEY (`ped_fun_cod`) REFERENCES `funcionarios` (`fun_cod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
