<?php
class dbconnect
{
    function connect()
    {
        $connection=mysqli_connect("localhost","root","","attitudewallpaper");
				return $connection;
    }
}
?>