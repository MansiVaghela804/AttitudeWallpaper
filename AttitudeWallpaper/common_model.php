<?php

$response = array();
extract($_POST);
include_once 'lib_include.php';
// get all users
if(isset($getUsers)) {

	$q = $d->select("image_list","","");
	if (mysqli_num_rows($q)>0) {
		$response["image_list"] = array();

		while ($data=mysqli_fetch_array($q)) 
		{
		    $image_list["category_id"]=$data['category_id'];
			$image_list["image"]="image/".$data['image'];
						
			array_push($response["image_list"], $image_list);
			
		}
		$response["success"] = "200";
		$response["massage"] = "Photos found";
		echo json_encode($response);
	}else
	{
		$response["success"] = "201";
		$response["massage"] = "No Photos Available";
		echo json_encode($response);

	}
}
?>