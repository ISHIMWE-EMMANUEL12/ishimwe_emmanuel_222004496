-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2024 at 03:03 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ishimwe_emmanuel_222004496`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(46) NOT NULL,
  `password` varchar(34) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `name` varchar(20) NOT NULL,
  `age` int(30) NOT NULL,
  `model` varchar(40) NOT NULL,
  `manufacturer` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`name`, `age`, `model`, `manufacturer`) VALUES
('corolla', 10, 'vn2784', 'british'),
('hamajam', 2, 'hm264744hh', 'american');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `phone` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `name`, `email`, `phone`) VALUES
(1, 'flavia', 'flavia@', '0794567876'),
(2, 'sera', 'sera@', '0790108115'),
(3, 'sera', 'sera@', '0790108115'),
(4, 'martin', 'sera@', '0790108115');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` int(46) NOT NULL,
  `password` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
(229, 229),
(229, 229);

-- --------------------------------------------------------

--
-- Table structure for table `parkinglot`
--

CREATE TABLE `parkinglot` (
  `parkinglot_id` int(10) NOT NULL,
  `name` varchar(40) NOT NULL,
  `address` varchar(80) NOT NULL,
  `capacity` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkinglot`
--

INSERT INTO `parkinglot` (`parkinglot_id`, `name`, `address`, `capacity`) VALUES
(1, 'plaza car allocation', 'kk234', 1000),
(6, 'city park', 'kn12345', 12345);

-- --------------------------------------------------------

--
-- Table structure for table `parkingslot`
--

CREATE TABLE `parkingslot` (
  `parkingslot_id` int(10) NOT NULL,
  `slot_number` int(30) NOT NULL,
  `size` int(20) NOT NULL,
  `status` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkingslot`
--

INSERT INTO `parkingslot` (`parkingslot_id`, `slot_number`, `size`, `status`) VALUES
(3, 234543, 3456787, 'available'),
(7, 12345, 1234, 'fully occupied'),
(8, 12345, 1234, 'space available'),
(11, 23456, 300, 'occupiied'),
(12, 12345, 1234, 'occupied');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `id` int(20) NOT NULL,
  `name` varchar(45) NOT NULL,
  `phone` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(24) NOT NULL,
  `hired date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `name`, `phone`, `address`, `email`, `username`, `password`, `hired date`) VALUES
(12, 'emmy', '0785237426', 'ngarama', 'ishimwe@', '1shimwe123@', '123456', '12122012'),
(12, 'emmy', '0785237426', 'ngarama', 'ishimwe@', '1shimwe123@', '123456', '12122012'),
(212, 'emmy12', '07823455446', 'gatsibo', 'iemmy@', '1shimwe123@', '123456', '12122012'),
(2344, 'emmy12@', '0794555446', 'gatsibo', 'sera@', 'iree123@', '123456', '12122012');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `reservation_id` int(10) NOT NULL,
  `start_time` varchar(20) NOT NULL,
  `end_time` varchar(20) NOT NULL,
  `cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`reservation_id`, `start_time`, `end_time`, `cost`) VALUES
(1, '20:30', '12:30', 500),
(4, 'ishimwe', 'emmy@', 785237000),
(5, '12345', '2345', 4566),
(10, 'emmy', 'ishwe@', 785237000),
(12, '1223', '9878', 300);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `parkinglot`
--
ALTER TABLE `parkinglot`
  ADD PRIMARY KEY (`parkinglot_id`);

--
-- Indexes for table `parkingslot`
--
ALTER TABLE `parkingslot`
  ADD PRIMARY KEY (`parkingslot_id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`reservation_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `parkinglot`
--
ALTER TABLE `parkinglot`
  MODIFY `parkinglot_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `parkingslot`
--
ALTER TABLE `parkingslot`
  MODIFY `parkingslot_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `reservation_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
