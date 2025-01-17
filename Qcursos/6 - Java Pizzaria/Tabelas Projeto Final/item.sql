-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10-Out-2016 às 22:25
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
-- Estrutura da tabela `item`
--

CREATE TABLE `item` (
  `item_cod` int(11) NOT NULL,
  `item_ent_cod` int(11) NOT NULL,
  `item_fun_cod` int(11) NOT NULL,
  `item_cli_cod` int(11) NOT NULL,
  `item_ped_cod` int(11) NOT NULL,
  `item_car_cod` int(11) NOT NULL,
  `item_quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `item`
--

INSERT INTO `item` (`item_cod`, `item_ent_cod`, `item_fun_cod`, `item_cli_cod`, `item_ped_cod`, `item_car_cod`, `item_quantidade`) VALUES
(1, 1, 1, 5, 11, 1, 1),
(2, 1, 1, 5, 12, 1, 3),
(3, 1, 1, 5, 12, 6, 3),
(4, 1, 1, 5, 13, 1, 1),
(5, 1, 1, 5, 13, 6, 1),
(6, 1, 1, 5, 14, 1, 1),
(7, 1, 1, 7, 15, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_cod`,`item_ent_cod`,`item_cli_cod`,`item_ped_cod`,`item_car_cod`,`item_quantidade`),
  ADD KEY `ItemPedido` (`item_ped_cod`,`item_cli_cod`,`item_fun_cod`,`item_ent_cod`),
  ADD KEY `ItemCardapio` (`item_car_cod`),
  ADD KEY `ItemEntregador` (`item_ent_cod`),
  ADD KEY `ItemFuncionario` (`item_fun_cod`),
  ADD KEY `ItemCliente` (`item_cli_cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `ItemCardapio` FOREIGN KEY (`item_car_cod`) REFERENCES `cardapio` (`car_cod`),
  ADD CONSTRAINT `ItemCliente` FOREIGN KEY (`item_cli_cod`) REFERENCES `clientes` (`cli_cod`),
  ADD CONSTRAINT `ItemEntregador` FOREIGN KEY (`item_ent_cod`) REFERENCES `entregador` (`ent_cod`),
  ADD CONSTRAINT `ItemFuncionario` FOREIGN KEY (`item_fun_cod`) REFERENCES `funcionarios` (`fun_cod`),
  ADD CONSTRAINT `ItemPedido` FOREIGN KEY (`item_ped_cod`) REFERENCES `pedidos` (`ped_cod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
