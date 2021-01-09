-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 09, 2021 lúc 10:40 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `searchtabledb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblsword`
--

CREATE TABLE `tblsword` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `damage` int(11) NOT NULL,
  `range` int(11) NOT NULL,
  `image` varchar(64) NOT NULL,
  `sharpness` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tblsword`
--

INSERT INTO `tblsword` (`id`, `name`, `damage`, `range`, `image`, `sharpness`) VALUES
(2, 'Sword of Ditto', 15, 2, 'sword.png', 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblwand`
--

CREATE TABLE `tblwand` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `damage` int(11) NOT NULL,
  `range` int(11) NOT NULL,
  `image` varchar(64) NOT NULL,
  `energy` int(11) NOT NULL,
  `element` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tblwand`
--

INSERT INTO `tblwand` (`id`, `name`, `damage`, `range`, `image`, `energy`, `element`) VALUES
(1, 'Wand of destroy', 20, 5, 'wand.png', 50, 'Fire'),
(3, 'wand heal', 15, 1, 'wand.png', 10, 'Water');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tblsword`
--
ALTER TABLE `tblsword`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tblwand`
--
ALTER TABLE `tblwand`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
