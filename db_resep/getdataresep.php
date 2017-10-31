<?php
//koneksi
// definisikan koneksi ke database
 include './config/koneksi.php';
  //mysqli_select_db($database) or die("Database tidak bisa dibuka");
   //coment 2
//
//coment
    if(isset($_GET["id_resep"])){
        $id=$_GET["id_resep"];
    }
    //query untuk menampilkan semua data ditable
    $sql=mysqli_query($con,"SELECT * FROM tb_resep ORDER BY id_resep desc");
    //untuk menampung isi data
    $response=array();
    $cek=mysqli_num_rows($sql);
    if($cek >0){
        $response["resep"]=array();
        //perulangan
        while ($row=mysqli_fetch_array($sql)){
            $data=array();
            $data["id_resep1"]=$row["id_resep"];
            $data["nama_resep1"]=$row["nama_resep"];
            $data["detail1"]=$row["detail"];
           $data["gambar1"]=$row["gambar"];
            
         $response["pesan"]="berhasil Mengambil Data";
         $response["sukses"]="true";    
            array_push($response["resep"],$data);
        }
        echo json_encode($response);
    }else{
        $response["pesan"]="Gagal Mengambil Data";
        $response["sukses"]="false";
        echo json_encode($response);
    } 

?>
