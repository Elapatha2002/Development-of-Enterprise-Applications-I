<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
            body{
                font-family: Arial,Helvetica,sans-serif;
            }
            form{
                padding: 16px;
                border :3px solid #f1f1f1;
                width : 30%;
                margin-left: auto;
                margin-right: auto;
                margin-top: 60px;
            }
            label{
                font-weight: bold
            }
            input{
                width:100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            button{
                background-color: #04AA6D;
                color: white;
                padding:14px 20px;
                margin : 8px 0;
                border:none;
                cursor: pointer;
                width: 100%;
            }
            button:hover{
                opacity: 0.8;
            }
            hr{
                opacity: 0.7;
                width:90%;
            }
        </style>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
<form action="SignupServlet" method="POST">
            <h2>Signup Here</h2>
            <hr>
            <label>Username</label>
            <input type="text" name="uname" placeholder="Enter Username">
            
            <label>E-mail</label>
            <input type="email" name="email" placeholder="Enter Email">
            
             <label>Password</label>
            <input type="password" name="pw1" placeholder="Enter Password">
            
            <label>Confirm Password</label>
            <input type="password" name="pw2" placeholder="Enter Password Again">
            
            <button type="submit">Signup</button>
        </form>
</body>
</html>