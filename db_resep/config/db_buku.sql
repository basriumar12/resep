-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2017 at 07:52 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_buku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(5) NOT NULL,
  `judul` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `isi_buku` text COLLATE latin1_general_ci NOT NULL,
  `gambar` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `harga` int(11) NOT NULL,
  `status` varchar(11) COLLATE latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `isi_buku`, `gambar`, `harga`, `status`) VALUES
(1, 'Beginning C', 'buku ini mengajarkan  bahasa pemrograman yang dapat dikatakan berada di antara bahasa beraras rendah dan beraras tinggi. Bahasa beraras rendah artinya bahasa yang berorientasi pada mesin dan beraras tinggi berorientasi pada manusia ', 'a1.jpeg', 100000, 'tersedia'),
(2, 'membangun aplikasi profesional berbasis web menggunakan  yii framework -edisi pertama-', 'Yii adalah framework (kerangka kerja) PHP berbasis-komponen, berkinerja tinggi untuk pengembangan aplikasi Web berskala-besar. Yii menyediakan reusability maksimum dalam pemrograman Web dan mampu meningkatkan kecepatan pengembangan secara signifikan. Nama Yii (dieja sebagai /i:/ ) singkatan dari "Yes It Is!".', 'a.png', 150000, 'kosong'),
(3, 'WEB programming', 'buku ini akan membahas pembuatan aplikasi dengan menggunakan bahasa pemograman web.pemrograman yang dalam bahasa English adalah programming dan diartikan proses, cara, perbuatan program. Definisi Web : jaringan komputer yang terdiri dari kumpulan situs internet yang menawarkan teks dan grafik dan suara dan sumber daya animasi melalui protokol transfer hypertext.', 'a2.jpg', 80000, 'tersedia'),
(4, 'superlab mikrotik', 'Superlab Mikrotik adalah kumpulan dan kombinasi dari materi-materi lab yang ada pada router mikrotik, Superlab MIkrotik ditujukan kepada anda yang sudah pernah mengkonfigurasi device mikrotik sebelumnya. Untuk Simulatornya kita menggunakan GNS3, dan Virtual Box.', 'a3.jpg', 170000, 'tersedia'),
(5, 'tausiyah cinta', 'Tausiyah cinta adalah buku yang paling menarik bagi kalangan remaja yang menginginkan cinta yang halal', 'a32.jpg', 100000, 'tersedia'),
(6, 'ios basic programming', 'buku ini akan membahas pembuatan aplikasi ios dengan menggunakan bahasa swift,buku ini akan membahas pembuatan aplikasi ios dengan menggunakan bahasa swiftbuku ini akan membahas pembuatan aplikasi ios dengan menggunakan bahasa swift', 'a5.png', 90000, 'tersedia'),
(7, 'android lanjutan', 'Android lanjutan adalah buku yang membahas tentang android secara pemula adnroid merupakan sistem operasi berbasis Linux yang dirancang untuk perangkat bergerak layar sentuh seperti telepon pintar dan komputer tablet. Android awalnya dikembangkan oleh Android, Inc., dengan dukungan finansial dari Google, yang kemudian membelinya pada tahun 2005', 'a6.png', 95000, 'tersedia'),
(8, 'openstack', 'OpenStack adalah sistem operasi cloud yang mengontrol kolam besar sumber daya komputasi, penyimpanan, dan jaringan di seluruh pusat data, dimana semuanya dikelola melalui dashboard yang memberikan administrator untuk mengontrol dan sekaligus memberdayakan penggunanya dalam pemanfaatan sumber daya melalui antarmuka web.', 'a7.jpg', 85000, 'kosong'),
(9, 'android dasar', 'Android dasar adalah buku yang membahas tentang android secara pemula adnroid merupakan sistem operasi berbasis Linux yang dirancang untuk perangkat bergerak layar sentuh seperti telepon pintar dan komputer tablet. Android awalnya dikembangkan oleh Android, Inc., dengan dukungan finansial dari Google, yang kemudian membelinya pada tahun 2005', 'a8.png', 70000, 'tersedia'),
(10, 'python', 'buku ini membahas tentang python,Python adalah bahasa pemrograman interpretatif multiguna. Tidak seperti bahasa lain yang susah untuk dibaca dan dipahami, python lebih menekankan pada keterbacaan kode agar lebih mudah untuk memahami sintaks.24 Mei 2016', 'a9.png', 100000, 'kosong');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_buku` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=149;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
