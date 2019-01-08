<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  charset=ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
<title>Login By Shad0wYas</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>
<br>
<br>
<br>
<form action="loginServlett" method="get">
<center><h3> LOGIN  </h3></center>
<br>
<br>
<br>


<table align="center" >
<tr><td> Nom de l'utilisateur : </td><td><input type="text" name="login"></td></tr>
<tr><td> Mot de passe  : </td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" name="submit" value="login"></td><td><a href="Inscription.jsp">Inscription</a></td></tr>

</table>
</form>
</body>
</html>