package br.com.fiap.model;

public class Medio extends Curso {
	private String tipo;
	private String orientadorPedagogico;
	
	
	
	
	//GetAll & SetAll
	
	public String getAll() {
		return super.getAll() + "\n" +
			   "Tipo.................: " + tipo + "\n" +
			   "Orientador Pedagógico: " + orientadorPedagogico;
	}
	
	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor, String tipo, String orientadorPedagogico) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico); 
		}
	
	//Construtores
	
	public Medio() {
		super();
	}
	public Medio(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor, String tipo, String orientadorPedagogico) {
		super(descricao, coordenacao, unidade, sigla, duracao, valor);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico); 
		}
	
	//Getters & Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.equalsIgnoreCase("Tecnico")) {
			tipo="tecnico";
		} else {
			tipo="regular";
		}
		this.tipo = tipo.toUpperCase();
	}
	public String getOrientadorPedagogico() {
		return orientadorPedagogico;
	}
	public void setOrientadorPedagogico(String orientadorPedagogico) {
		this.orientadorPedagogico = orientadorPedagogico.toUpperCase();
	}

	

}
