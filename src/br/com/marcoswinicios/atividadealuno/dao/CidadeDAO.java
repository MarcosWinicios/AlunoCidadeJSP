package br.com.marcoswinicios.atividadealuno.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	public ArrayList<Cidade> listar() {
		String sql = "SELECT * FROM cidade";
		try {
			this.stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Cidade> cidades =  new ArrayList<Cidade>();
			while(rs.next()) {
				Cidade cidade = new Cidade(rs.getInt("id"), rs.getString("nome"), rs.getString("estado"));
				cidades.add(cidade);
			}
			this.stmt.close();
			return cidades;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public Cidade pesquisarId(int id) {
		String	sql = "SELECT * FROM cidade WHERE id = ?";
		try {
			this.stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			Cidade cidade = new Cidade();
			if(rs.next()) {
				cidade = new Cidade(rs.getInt("id"), rs.getString("nome"), rs.getString("estado"));
			}
			return cidade;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
