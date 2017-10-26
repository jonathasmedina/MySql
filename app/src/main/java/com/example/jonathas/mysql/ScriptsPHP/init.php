<?php
$db_name = "webappdb";
$mysql_user = "root";
$mysql_pass = "";
$server_name = "localhost";

$con = mysqli_connect($server_name, $mysql_user,$mysql_pass,$db_name);

if(!$con){
	//echo "Erro de conexão".mysqli_connect_error();
}else{
//	echo "<h3> Conexão no banco - sucesso</h3>";
}
	


?>