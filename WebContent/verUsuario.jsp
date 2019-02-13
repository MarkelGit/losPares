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
	<div class="border bg-secondary rounded container" style="margin-top: 20px; padding: 12px; max-width: 40%">
		<h1>REGISTERED</h1>
			<div class="form-row">
                <div class="form-group col-md-12">
                    <label for="inputUsername">Username</label>
                    <input type="text" class="form-control border border-success" id="inputUsername" placeholder="<%out.println(usuario.getNombreUsuario()); %>" readonly name="inputUsername" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputPassword">Password</label>
                    <input type="password" class="form-control border border-success" id="inputPassword" placeholder="<%out.println(usuario.getContrasena()); %>" readonly name="inputPassword" >
                </div>
                <div class="form-group col-md-12">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control border border-success" id="inputEmail" placeholder="<%out.println(usuario.getEmail()); %>" readonly name="inputEmail" >
                </div>
                <div class="alert alert-success" role="alert" style="margin: 15px 5px;">
  					You were registered successfully! Click down to finish with the form.
				</div>
				<div class="form-group col-md-12">
					<a href="home" class="btn btn-outline-dark text-light bg-dark my-2 my-sm-0" role="button">Finish</a>
				</div>
            </div>
    </div>
</body>
</html>