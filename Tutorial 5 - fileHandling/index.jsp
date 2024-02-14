<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    form {
        text-align: center;
        margin-top: 50px;
        background-color: #ffffff;
        padding: 20px;
        width : fit-content;
        border-radius: 10px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
    input[type="text"] {
        padding: 10px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        margin-right: 10px;
    }
    input[type="submit"] {
        padding: 10px 20px;
        border-radius: 5px;
        background-color: #008CBA;
        color: #ffffff;
        border: none;
        cursor: pointer;
        font-size: 16px;
    }
</style>
<meta charset="ISO-8859-1">
<title>Add Image</title>
</head>
<body>
	<form action="displayImage" method="get">
		<input type="text" name="image"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>