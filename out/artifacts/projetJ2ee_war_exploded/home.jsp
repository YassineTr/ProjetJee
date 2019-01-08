<%--
  Created by IntelliJ IDEA.
  User: Shad0wYas
  Date: 09/01/2019
  Time: 00:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<center><h3> BIENVENU SUR NOTRE SITE ${user.getnompre()} </h3></center>
<br>
<br>
<br>

<nav>
    <ul>
        <li><a href="Annonce.jsp"> Nos annonces</a></li>
        <li><a href="Offres.jsp"> Nos offres</a></li>
        <li><a href="Login.jsp"> Connectez-vous</a></li>

    </ul>

</nav>


<tr><td> Rechercher : </td><td><input type="text"></td></tr>
<tr><td><input type="submit" name="submit" value="search"></td></tr>




</body>
</html>