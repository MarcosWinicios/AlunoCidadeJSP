<%@page import="br.com.marcoswinicios.atividadealuno.dao.CidadeDAO"%>
<%@page import="java.util.List"%>
<%@page import="br.com.marcoswinicios.atividadealuno.model.Cidade"%>
<%@page import="java.util.ArrayList"%>
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
		<label>Cidade</label>
		<br>
		<p>Olá
		<select name="idCidade">
		
		<%
			List<Cidade> cidades = new CidadeDAO().listar();
			for(Cidade cidade : cidades){
				out.println("<option value = '" + cidade.getId() + "'>" + cidade.getNome() + " - " + cidade.getEstado() + "</option>");
			}
			
		%>
		</select><br><br>
		<input type = "submit" value="gravar">
		
	</form>
</body>
</html>