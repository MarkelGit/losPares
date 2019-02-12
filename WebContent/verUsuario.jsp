<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.bean.Usuario" %>
    <%
    Usuario usuario = (Usuario)request.getAttribute("usuario");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">

    <title>Usuario</title>
</head>
<body>
<div class="form-row">
                <div class="form-group col-md-12">
                    <label for="inputUsername">Username</label>
                    <input type="text" class="form-control" id="inputUsername" placeholder="<%out.println(usuario.getNombreUsuario()); %>" readonly name="inputUsername" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputPassword4">Password</label>
                    <input type="password" class="form-control" id="inputPassword4" placeholder="<%out.println(usuario.getContrasena()); %>" readonly name="inputPassword4" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputEmail4">Email</label>
                    <input type="email" class="form-control" id="inputEmail" placeholder="<%out.println(usuario.getEmail()); %>" readonly name="inputEmail" >
                </div>
            </div>



</body>
</html>