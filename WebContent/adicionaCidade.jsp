<%@page import="br.com.marcoswinicios.atividadealuno.model.Cidade"%>
<%@page import="br.com.marcoswinicios.atividadealuno.dao.AlunoDAO"%>
<%@page import="br.com.marcoswinicios.atividadealuno.dao.CidadeDAO"%>
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
		String estado =  request.getParameter("estado");
		
		Cidade c = new Cidade();
		c.setNome(nome);
		c.setEstado(estado);
		new CidadeDAO().inserirCidade(c);
		
	%>
</body>
</html>