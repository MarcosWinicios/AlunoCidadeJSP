package br.com.marcoswinicios.atividadealuno.model;

public class Cidade {
	private int id;
	private String nome;
	private String estado;
	
	public Cidade() {
		
	}
	public Cidade(int id, String nome, String estado) {
		this.setId(id);
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
