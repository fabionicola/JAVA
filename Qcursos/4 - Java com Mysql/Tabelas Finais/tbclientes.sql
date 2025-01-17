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
-- Table structure for table `tbclientes`
--

CREATE TABLE `tbclientes` (
  `idcli` int(11) NOT NULL,
  `nomecli` varchar(50) NOT NULL,
  `endcli` varchar(100) DEFAULT NULL,
  `fonecli` varchar(15) NOT NULL,
  `emailcli` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbclientes`
--

INSERT INTO `tbclientes` (`idcli`, `nomecli`, `endcli`, `fonecli`, `emailcli`) VALUES
(1, 'Fábio Vasconcelos', 'Rua Teste', '8888-7777', 'fabio@hotmail.com'),
(2, 'Grazi Vasconcelos', 'Rua Teste 2', '6666-7777', 'grazi@hotmail.com'),
(3, 'Paula Campos', '', '3333333', 'paulinha@hotmail.com'),
(5, 'Hugo Vasconcelos', 'Rua Teste 5', '6666-7777777', 'hugovasconcelosf@hotmail.com'),
(20, 'Pedro Henrique C', '33333', '33333', 'pedro@@@'),
(21, 'Pablo Freitas', '22222', '2222', 'pablo@hotmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbclientes`
--
ALTER TABLE `tbclientes`
  ADD PRIMARY KEY (`idcli`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbclientes`
--
ALTER TABLE `tbclientes`
  MODIFY `idcli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
