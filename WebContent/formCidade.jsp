<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>Cadastro de Cidade</h1>
		<form action="adicionaCidade.jsp">
			<label for = "nome">Nome:</label>
			<input type="text" name="nome">
			<br><br>
			<label for="Estado" id="estado">Estado:</label>
			<input type="text" name="estado"> <br><br>
			<input type="submit" value="gravar">
		</form>
	</body>
</html>