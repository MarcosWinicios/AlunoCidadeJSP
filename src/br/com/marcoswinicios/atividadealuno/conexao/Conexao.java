package br.com.marcoswinicios.atividadealuno.conexao;

import java.sql.Connection;

import java.sql.DriverManager;

public class Conexao {

	private static final String DSN = "jdbc:mysql://localhost:3306/progWeb1?useTimezone=true&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "20181032";

	public Connection getConexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			return DriverManager.getConnection(DSN, USUARIO, SENHA);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
