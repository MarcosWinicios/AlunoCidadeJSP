<%@page import="br.com.marcoswinicios.atividadealuno.dao.AlunoDAO"%>
<%@page import="br.com.marcoswinicios.atividadealuno.model.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		Aluno a = new Aluno();
		a.setNome(nome);
		a.setIdade(idade);
		
		new AlunoDAO().inserirAluno(a);
	%>
</body>
</html>