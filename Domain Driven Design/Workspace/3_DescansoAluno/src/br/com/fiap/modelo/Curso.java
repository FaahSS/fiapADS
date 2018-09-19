package br.com.fiap.modelo;

public class Curso {
	private String nome;
	private String sigla;
	private String titulacao;
	
	
	//get & set all
	
	public void setAll(String nome, String sigla, String titulacao) {
		this.nome = nome;
		this.sigla = sigla;
		this.titulacao = titulacao;
	}
	
	public String getAll(){
		return "Nome.....: " + nome + "\n" +
			   "Sigla....: " + sigla + "\n" +
			   "Titulação: " + titulacao + "\n";
	}
	
	//Constructors
	public Curso() {
		super();
	}
	
	public Curso(String nome, String sigla, String titulacao) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.titulacao = titulacao;
	}
	
	//Get & Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	

}
