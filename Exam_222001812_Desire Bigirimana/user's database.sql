-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 09:54 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` varchar(20) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `USER_ NAME` varchar(20) NOT NULL,
  `EMAIL` varchar(20) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `NAME`, `USER_ NAME`, `EMAIL`, `PHONE`, `PASSWORD`) VALUES
('01', 'DESIRE', 'TADJOU', 'TADJOU250@GMAIL.COM', '07888646754', 'TADJ123'),
('12', 'DESIRE', 'DESIRE12', 'DESIRE@GMAIL.COM', '9798899', '123123'),
('', '', '', '', '', ''),
('12', 'bigirimana', 'bigiri', 'bigirimana@gmail', '07853798973', '123123'),
('35', 'Desire', 'Desi35', 'tadjou250@gmail.com', '0781350270', '124'),
('12', 'Bigirimana', 'Desire', 'tadjou250@gmail.com', '0781350270', '222001812');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
