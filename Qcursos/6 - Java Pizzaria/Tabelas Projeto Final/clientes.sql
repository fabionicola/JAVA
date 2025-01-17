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
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `cli_cod` int(11) NOT NULL,
  `cli_nome` varchar(80) NOT NULL,
  `cli_rua` varchar(80) NOT NULL,
  `cli_bairro` varchar(80) NOT NULL,
  `cli_telefone` varchar(80) NOT NULL,
  `cli_data_cad` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`cli_cod`, `cli_nome`, `cli_rua`, `cli_bairro`, `cli_telefone`, `cli_data_cad`) VALUES
(1, 'Hugo', 'Rua A', 'Bairro Z', '(99) 39400-70  ', '2016-10-03'),
(5, 'Hugo Freitas', 'Rua B', 'Bairro A', '(44) 44444-4444', '2016-10-04'),
(6, 'Paula Freitas', 'Rua X', 'Bairro Y', '(55) 55555-5555', '2016-10-04'),
(7, 'Pedro Campos', 'Rua A', 'Bairro A', '(66) 66666-6666', '2016-10-04'),
(8, 'Fábio Vasconcelos', 'Rua A', 'Rua B', '(66) 66666-6666', '2016-10-05'),
(9, 'Marcos Pedro', 'Rua X', 'Bairro a', '(55) 55555-5555', '2016-10-05'),
(10, 'Marcelo', 'Rua A', 'ZZZZZZZZZ', '(55) 55555-5555', '2016-10-05'),
(11, 'Paulinho', 'Rua V', 'Bairro C', '(55) 55555-5555', '2016-10-06'),
(12, 'Pedro H', 'Rua a', 'Bairro', '(55) 55555-5555', '2016-10-10'),
(13, 'Teste', 'teste', 'teste', '(44) 44444-4444', '2016-10-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cli_cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cli_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
