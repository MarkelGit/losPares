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
<body class="bg-dark">
	<div class="border border-danger bg-secondary rounded container" style="margin-top: 20px; padding: 12px; max-width: 40%">
		<h1>SOMETHING WENT WRONG</h1>
			<div class="form-row">
                <div class="form-group col-md-12">
                    <label for="inputUsername">Username</label>
                    <input type="text" class="form-control border" id="inputUsername" placeholder="<%out.println(usuario.getNombreUsuario()); %>" name="inputUsername" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputPassword">Password</label>
                    <input type="password" class="form-control border" id="inputPassword" placeholder="<%out.println(usuario.getContrasena()); %>" name="inputPassword" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control border" id="inputEmail" placeholder="<%out.println(usuario.getEmail()); %>" name="inputEmail" >
                </div>
                <div class="alert alert-danger" role="alert" style="margin: 15px 5px;">
  					Something on the form is not okay. please check it out.
				</div>
				<div class="form-group col-md-12">
					<button id="submit" type="submit" class="btn btn-outline-dark text-light bg-dark">Try again</button>
				</div>				
			</div>
    </div>
</body>
</html>