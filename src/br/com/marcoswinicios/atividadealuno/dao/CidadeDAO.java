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
	
	public void inserirCidade() {
		String sql = "";
		try {
			
		}catch(Exception e){
			throw new RuntimeException(e);

		}
	}
	
}
