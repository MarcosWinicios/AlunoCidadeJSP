<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Adicionar Aluno</h1>
	
	<form action="adicionarAluno.jsp">
		<label for="nome">Nome:</label>
		<input type ="text" name = "nome">
		<br><br>
		<label for= "idade" id="idade">Idade:</label>
		<input type = "text" name="idade">
		<br><br>
		<input type = "submit" value="gravar">
	</form>
</body>
</html>