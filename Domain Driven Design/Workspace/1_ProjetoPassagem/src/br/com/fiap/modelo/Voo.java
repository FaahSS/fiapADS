package br.com.fiap.modelo;

public class Voo {
	private String destino;
	private String horario;
	private String duracao;
	private Escala escala;
	
	
	//Construtores
	public Voo() {
		super();
	}
	public Voo(String destino, String horario, String duracao, Escala escala) {
		super();
		setDestino(destino);
		setHorario(horario);
		setDuracao(duracao);
		setEscala(escala);
	}
	//Getters & Setters
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}

}
