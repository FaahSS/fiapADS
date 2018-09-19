package br.com.fiap.modelo;

public class Escala {
	private String localidade;
	private String duracao;
	
	//Construtores
	public Escala () {}
	public Escala (String localidade) {
		
	}
	public Escala(String localidade, String duracao) {
		setLocalidade(localidade);
		setDuracao(duracao);

	}
	
	//Getters & Setters
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

}
