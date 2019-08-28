<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
  <head><style>
    body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #1656a0;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ff008c
;
  box-sizing: border-box;
}

button {
  background-color: #ff008c


;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}
      </style></head>


<form action="user1">
  <div class="container">
  <h1>user login</h1>
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter username" name="username" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passward" required>
 <button type="register" class="registerbtn">Register</button>
  </div>
  <div class="container signin">
     </div>
</form>
