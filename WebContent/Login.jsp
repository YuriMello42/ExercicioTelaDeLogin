<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="css/Home.css">
<link rel="stylesheet" href="css/bootstrap.css">

<title>Login</title>


</head>

<body>
	<div>
		<img src="css/img/logo.png">

	</div>

	<form action="login" method="post">
		<div class="grupo" style="border: 1px;">
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"
					style="color: #88393d;">Login</label> <input type="email"
					class="form-control" id="formGroupExampleInput" name="usuario"
					placeholder="Digite seu Email"
					style="background-color: white; color: gray;"> <label
					for="formGroupExampleInput2" class="form-label"
					style="color: #88393d;">Senha</label> <input type="password"
					class="form-control" id="formGroupExampleInput2" name="senha"
					placeholder="Senha" style="background-color: white; color: gray;">
			</div>

			<div style="margin-left: 40px;">

				<a href="LembrarSenha.jsp" id="LinkEsqueceuSenha"> Esqueceu sua
					Senha?</a>
			</div>
			<br>

			<div>
				<input type="submit" class="bEntrar" value="Entrar">
			</div>

		</div>
	</form>

</body>

</html>