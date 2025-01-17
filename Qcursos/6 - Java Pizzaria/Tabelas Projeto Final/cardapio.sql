-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10-Out-2016 às 22:24
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
-- Estrutura da tabela `cardapio`
--

CREATE TABLE `cardapio` (
  `car_cod` int(11) NOT NULL,
  `car_descricao` varchar(80) NOT NULL,
  `car_tipo` varchar(80) NOT NULL,
  `car_valor` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cardapio`
--

INSERT INTO `cardapio` (`car_cod`, `car_descricao`, `car_tipo`, `car_valor`) VALUES
(1, 'Pizza Calabreza', 'Pizza', '20.00'),
(2, 'Pizza Calabresa', 'Pizza', '50.00'),
(3, 'DelRey 2L', 'Refrigerante', '4.00'),
(4, 'Pizza X', 'Pizza', '0.00'),
(5, 'Pizza V', 'Pizza', '0.00'),
(6, 'Coca Cola', 'Refrigerante', '7.00'),
(7, 'Dolly', 'Refrigerante', '5.00'),
(8, 'Pizza a Moda', 'Pizza', '50.00'),
(9, 'Pizza Teste', 'Pizza', '30.00'),
(10, 'Pizza Teste', 'Pizza', '30.00'),
(11, 'Pizza Teste', 'Pizza', '30.00'),
(12, 'Mate Couro', 'Refrigerante', '44.00'),
(13, 'Fanta', 'Refrigerante', '4.99'),
(14, 'DelRey 2L', 'Refrigerante', '50.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cardapio`
--
ALTER TABLE `cardapio`
  ADD PRIMARY KEY (`car_cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cardapio`
--
ALTER TABLE `cardapio`
  MODIFY `car_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
