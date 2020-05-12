<?php 
 include './config/koneksi.php';

 if($_SERVER['REQUEST_METHOD'] == 'POST')
 {
   $nama_resep = $_POST['nama_resep'];
   $detail = $_POST['detail'];
   $gambar = $_POST['gambar'];
  
   //query ke database
    $query = "INSERT INTO tb_resep (nama_resep,detail, gambar) VALUES ('$nama_resep','$detail','$gambar')";

 	$exeQuery = mysqli_query($con, $query); 

	 echo ($exeQuery) ? json_encode(array('kode' =>1, 'pesan' => 'berhasil menambahkan data')) 
	 :  json_encode(array('kode' =>2, 'pesan' => 'data gagal ditambahkan'));
 }
 else
 {
 	 echo json_encode(array('kode' =>101, 'pesan' => 'request tidak valid'));
 }

 ?>
