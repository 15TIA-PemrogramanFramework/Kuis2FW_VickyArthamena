-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 15.50
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1084`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `indentitas`
--

CREATE TABLE `indentitas` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `indentitas`
--

INSERT INTO `indentitas` (`id`, `alamat`, `jurusan`, `nama`) VALUES
(1, 'Jl Saja', 'Teknik Informatika', 'Vicky'),
(2, 'Jl Saja', 'Teknik Informatika', 'Jovan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk`
--

CREATE TABLE `ipk` (
  `id` bigint(20) NOT NULL,
  `nilai` varchar(100) NOT NULL,
  `tahun` varchar(100) NOT NULL,
  `indentitas_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk`
--

INSERT INTO `ipk` (`id`, `nilai`, `tahun`, `indentitas_id`) VALUES
(1, 'A', '2018', 1),
(2, 'A', '2018', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `indentitas`
--
ALTER TABLE `indentitas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ipk`
--
ALTER TABLE `ipk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKaonl3uom62mhghvvemvtv2loh` (`indentitas_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `indentitas`
--
ALTER TABLE `indentitas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ipk`
--
ALTER TABLE `ipk`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk`
--
ALTER TABLE `ipk`
  ADD CONSTRAINT `FKaonl3uom62mhghvvemvtv2loh` FOREIGN KEY (`indentitas_id`) REFERENCES `indentitas` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
