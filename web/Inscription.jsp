<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<br>
<br>
<br>
<form action="InscriptionServlet" method="get">
<center><h3> Inscription </h3></center>
<br>
<br>
<br>

<table align="center" >
<tr><td> Nom d'utilisateur </td><td><input type="text" name="login"></td></tr>
<tr><td> Nom et prénom </td><td><input type="text" name="nompre"></td></tr>
<tr><td> Mot de passe </td><td><input type="password" name="password1"></td></tr>
<tr><td> Retapez votre mot de passe  </td><td><input type="password" name="password2"></td></tr>
<tr><td> Email </td><td><input type="text" name="mail"></td></tr>
<tr><td> Adresse </td><td><input type="text" name="adresse"></td></tr>
<tr><td> Code postal </td><td><input type="text" name="cp"></td></tr>
<tr><td> Lieu </td><td><input type="text" name="lieu"></td></tr>
<tr><td> Mobile </td><td><input type="text" name="mobile"></td></tr>
<tr><td> CIN </td><td><input type="text" name="cin"></td></tr>
<tr><td> Date de naissance yy//mm//aa </td><td><input type="text" name="Login"></td></tr>
<tr><td><center><input type="submit" name="submit" value="Inscrire"></center></td><td></td></tr>


 <center>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="Login.jsp"> Revenir à la page de l'authentification</a></center>


</table>
</form>


</body>
</html>