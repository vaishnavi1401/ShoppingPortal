<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>

<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
div {border: 3px solid #f1f1f1;width: 300px;
  height: 400px;padding: 12px 20px;
  position: absolute;
    top:30%;
    left: 40%;
    margin-top: -50px;
    margin-left: -50px;
   }

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #aa00ff
;
  box-sizing: border-box;
}

button {
  background-color: #aa00ff


;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}
</style>
</head>

<form action="cart">
    <div class="container">
  <h1>ADD USER</h1>
     <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter username" name="username" required>

    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passward" required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passward1" required>
 <button type="register" class="registerbtn">Register</button>
</div>
 </form>
 