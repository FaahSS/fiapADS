package br.com.fiap.model;

public class Unidade {
	private String nome;
	private String fone;
	private String email;
	
	//GetAll & SetAll
	
	public String getAll() {
		return "Nome....: " + nome + "\n" +
			   "Telefone: " + fone + "\n" +
			   "E-mail..: " + email;
	}
	
	public void setAll(String nome, String fone, String email) {
		setNome(nome);
		setFone(fone);
		setEmail(email);
	}
	
	//Construtores
	public Unidade() {
		super();
	}
	public Unidade(String nome, String fone, String email) {
		super();
		setNome(nome);
		setFone(fone);
		setEmail(email);
	}
	//Get & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>20) {
			nome.substring(0, 20);
		}
		
		this.nome = nome.toUpperCase();
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@") < 2 || email.indexOf(".") < 2) {
			email="email@fiap.com.br";
		}
		this.email = email.toLowerCase();
	}
	
	
}
