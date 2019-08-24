package br.com.marcoswinicios.atividadealuno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.marcoswinicios.atividadealuno.conexao.Conexao;
import br.com.marcoswinicios.atividadealuno.model.Cidade;

public class CidadeDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public CidadeDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	public void inserirCidade(Cidade c) {
		String sql = "INSERT INTO cidade(nome, estado) values (?, ?)";
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setString(2,c.getEstado());
			stmt.execute();
			stmt.close();
		}catch(Exception e){
			throw new RuntimeException(e);

		}
	}
	
}
