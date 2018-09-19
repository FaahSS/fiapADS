package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private int numero;
	private int qtdeEstrelas;
	private Endereco endereco;
	
	//GetAll & SetAll
	public String getAll() {
		return "Nome...................: "+nome+"\n"+
				"Numero................: "+numero+"\n"+
				"Quantidade de Estrelas: "+qtdeEstrelas+"\n"+
				"Endereco..............: "+endereco;
	}
	
	public void setAll(String nome, int numero, int qtdeEstrelas, Endereco endereco) {
		setNome(nome);
		setNumero(numero);
		setQtdeEstrelas(qtdeEstrelas);
		setEndereco(endereco);
	}
	
	//Constructors
	public Cliente() {
		super();
	}
	public Cliente(String nome, int numero, int qtdeEstrelas, Endereco endereco) {
		super();
		setNome(nome);
		setNumero(numero);
		setQtdeEstrelas(qtdeEstrelas);
		setEndereco(endereco);
	}
	
	//Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdeEstrelas() {
		return qtdeEstrelas;
	}
	public void setQtdeEstrelas(int qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
