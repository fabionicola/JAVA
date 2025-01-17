-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10-Out-2016 às 22:31
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
  `ped_hora` time NOT NULL,
  `ped_total` decimal(10,2) NOT NULL,
  `ped_cli_cod` int(10) NOT NULL,
  `ped_fun_cod` int(10) NOT NULL,
  `ped_ent_cod` int(10) NOT NULL,
  `ped_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pedidos`
--

INSERT INTO `pedidos` (`ped_cod`, `ped_data`, `ped_hora`, `ped_total`, `ped_cli_cod`, `ped_fun_cod`, `ped_ent_cod`, `ped_status`) VALUES
(5, '2016-10-03', '00:00:00', '500.00', 1, 1, 1, ''),
(7, '2016-10-10', '12:10:02', '20.00', 5, 1, 1, 'Pedido Aberto'),
(8, '2016-10-10', '12:08:51', '7.00', 11, 1, 1, 'Pedido Aberto'),
(9, '2016-10-10', '12:10:46', '60.00', 5, 1, 1, 'Pedido Aberto'),
(10, '2016-10-10', '12:25:33', '20.00', 5, 1, 1, 'Pedido Aberto'),
(11, '2016-10-10', '13:36:47', '20.00', 5, 1, 1, 'Pedido Aberto'),
(12, '2016-10-10', '13:40:03', '81.00', 5, 1, 1, 'Pedido Aberto'),
(13, '2016-10-10', '13:43:01', '27.00', 5, 1, 1, 'Pedido Aberto'),
(14, '2016-10-10', '13:49:26', '20.00', 5, 1, 1, 'Pedido Aberto'),
(15, '2016-10-10', '13:50:27', '20.00', 7, 1, 1, 'Pedido Aberto');

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
  MODIFY `ped_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
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
