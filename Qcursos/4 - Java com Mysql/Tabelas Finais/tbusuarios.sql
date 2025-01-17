-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2016 at 06:06 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbinfoq`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbusuarios`
--

CREATE TABLE `tbusuarios` (
  `iduser` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `login` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbusuarios`
--

INSERT INTO `tbusuarios` (`iduser`, `usuario`, `telefone`, `login`, `senha`, `perfil`) VALUES
(1, 'Hugo Vasconcelos', '9999-9999', 'hugo', '123', 'admin'),
(2, 'Administrador', '9999-9998', 'admin', '123', 'admin'),
(3, 'Pedro', '9999-9988', 'pedrinho', '123', 'user'),
(4, 'Gabriel Martins', '4444', 'gabriel', '123', 'user'),
(5, 'Paula Campos', '66666', 'paula', '123', 'admin'),
(6, 'Marcos Silva', '666666', 'marcos', '123', 'admin'),
(7, 'Maria Fátima', '666666', 'mary', '123', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbusuarios`
--
ALTER TABLE `tbusuarios`
  ADD PRIMARY KEY (`iduser`),
  ADD UNIQUE KEY `login` (`login`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
