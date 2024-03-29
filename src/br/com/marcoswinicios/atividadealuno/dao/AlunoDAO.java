package br.com.marcoswinicios.atividadealuno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.marcoswinicios.atividadealuno.conexao.Conexao;
import br.com.marcoswinicios.atividadealuno.model.Aluno;

public class AlunoDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public AlunoDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	public void inserirAluno(Aluno a) {
		String sql = "INSERT INTO aluno(nome, idade, idCidade) values (?, ?, ?)";
		 try {
			 stmt = conexao.prepareStatement(sql);
			 stmt.setString(1, a.getNome());
			 stmt.setInt(2, a.getIdade());
			 stmt.setInt(3, a.getCidade().getId());
			 stmt.execute();
			 stmt.close();
		 }catch(Exception e) {
			 throw new RuntimeException(e);
		 }
	}
}
