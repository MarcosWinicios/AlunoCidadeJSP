package br.com.marcoswinicios.atividadealuno.model;

public class Aluno {
	private int id;
	private String nome;
	private int idade;
	private Cidade cidade;
	
	
	public Aluno() {
		
	}
	public Aluno(int id, String nome, int idade, Cidade cidade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public Aluno(String nome, int idade, Cidade cidade) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
}
