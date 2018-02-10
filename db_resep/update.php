	<?php 
 require_once './config/koneksi.php';

 if($_SERVER['REQUEST_METHOD'] == 'POST')
 {
 	
 //parameter post
 	$id_resep = $_POST['id_resep'];
 	$nama_resep = $_POST['nama_resep'];
 	$detail = $_POST['detail'];
 	$gambar = $_POST['gambar'];

//update
 	/*echo "UPDATE  tb_resep 
 	SET nama_resep = '$nama_resep',
 	detail = '$detail', 
 	gambar = '$gambar'
 	 WHERE id_resep='$id_resep'";*/
 	 
 	$query = "UPDATE  tb_resep 
 	SET nama_resep = '$nama_resep',
 	detail = '$detail', 
 	gambar = '$gambar'
 	 WHERE id_resep='$id_resep'";

 	$exeQuery = mysqli_query($con, $query); 

 	echo ($exeQuery) ? json_encode(array('kode' =>1, 'pesan' => 'data berhasil update')) :  json_encode(array('kode' =>2, 'pesan' => 'data gagal diupdate'));
 }
 else
 {
 	 echo json_encode(array('kode' =>101, 'pesan' => 'request tidak valid'));
 }

 ?>
