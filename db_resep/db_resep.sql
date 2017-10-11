-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2017 at 03:47 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_resep`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_resep`
--

CREATE TABLE `tb_resep` (
  `id_resep` int(11) NOT NULL,
  `nama_resep` varchar(100) NOT NULL,
  `detail` text NOT NULL,
  `gambar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_resep`
--

INSERT INTO `tb_resep` (`id_resep`, `nama_resep`, `detail`, `gambar`) VALUES
(0, 'Gudeg Jogja', 'Bahan-bahan gudeg kering\r\n\r\n? 1 kilogram Nangka muda di potong potong\r\n? 200 gram gula merah di sisir\r\n? Santan kelapa kental\r\n? 10 butir telur di rebus\r\n? Daun salam 2 atau 3 lembar\r\n? 1 liter air kelapa\r\n? Lengkuas potong memanjang\r\n\r\nBumbu bumbu yang di haluskan\r\n\r\n? Bawang merah 15 siung\r\n? Bawang putih 10 siung\r\n? Kemiri 10 buah disangrai\r\n? Ketumbar 2 sendok teh\r\n? Satu setengah sendok teh merica\r\nGaram\r\n\r\nCara Membuat gudeg jogja Kering\r\n\r\n? Cuci buah nangka dengan bersih\r\n? Sediakan Kuali (kendil) untuk memasak, masukan daun salam kemudian lengkuas dan masukan pula nangka, telur rebus serta gula aren\r\n? Masukan air kelapa setengahnya saja kemudian masukan bumbu yang sudah dihaluskan aduk hingga tercampur rata\r\n? Masukan setengah lagi air kelapa ke dalam panci hingga buah nangka terendam. Kemudian masak\r\n? Masak bahan bahan dengan panci tertutup selama sekitar dua jam. Jika airnya sudah berkurang bahkan habis pisahkan telur rebusnya\r\n? Santan dituangkan sambil nangkanya diaduk aduk.\r\n? Telur rebus dimasukkan kembali hingga terendam bersama dengan nangka\r\n? Masak bahan bahan dengan api kecil kurang lebih empat jam. Biarkan hingga berubah kecoklatan dan kuahnya habis.\r\nSampai di sini kita sudah selesai memasak Gudeg Jogja Kering, untuk selanjutany mari kita bikin pelengkapya..', 'gudeg.jpg'),
(1, 'bakso', 'Bahan Bakso : 1/2 kilogram daging sapi 50 gram tepung kanji 1/2 sdt lada bubuk 1 sdt garam 1 sdm bawang putih goreng 2 sdm bawang merah goreng 40 gram es batu, hancurkan 2000 ml air Bahan Kuah : 200 gr tulang sapi 3000 ml air Bumbu kuah : 5 buah bawang merah dibersihkan, goreng, haluskan 7 siung bawang putih, bersihkan, goreng, haluskan 1/2 sdm bawang goreng jadi, haluskan 2 sdt kaldu sapi instan 2 sdt gula pasir 1 sdm garam dapur 1/2 sdt merica 4 btg daun bawang, diambil bagian putihnya. Iris halus.\r\nCara Membuat baksonya : Masukkan tepung kanji, bawang putih, bawang merah, lada, garam, dan daging sapinya kedalam wadah. Uleni dengan tangan biasa atau menggunakan alat pencampur, seperti food processor maupun blender. Giling daging dan bahan ini sampai halus dan tercampur rata. Tambahkan es batu jika adonan daging lembek dan sulit untuk dibentuk. Rebus air dalam panci besar sampai panas hampir mendidih. Ambil kemudian genggam adonan daging bakso, lalu tekan supaya adonan bisa keluar diantara ibu jari dan jari telunjuk. Ambil adonan yang sudah muncul dengan menggunakan sendok, lalu masukan kedalam air panas. Begitu seterusnya sampai adonan habis. Lanjutkan dengan memasak pentol atau bola bola bakso tadi dengan menggunakan api besar, sampai semuanya terlihat mengapung. Angkat. Cara Membuat kuahnya : Didihkan air, kemudian masukkan seluruh bahan dan bumbu untuk kuah secara bersama-sama. Tunggulah sampai air mendidih kembali dan tulangnya menjadi matang, kemudian tambahkan sisa air/kuah bakso. Supaya kuah tetap panas, biarkan diatas kompor dengan api kecil. Demikian cara membuat bakso sapi yang kenyal dengan takaran bumbu yang pas, sehingga mempertahankan citarasa bakso yang sedap\r\n\r\nRead more at resepcaramemasak.org: Membuat Bakso daging Sapi yang kenyal enak\r\n\r\n', 'bakso.jpg'),
(2, 'coba', 'tteesss', 'nasikuning.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_resep`
--
ALTER TABLE `tb_resep`
  ADD PRIMARY KEY (`id_resep`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
