package br.com.fiap.beans;

public class Produto {
	private int codigo;
	private double valor;
	private String descricao;
	
	
	public Produto(int codigo, double valor, String descricao) {
		super();
		setCodigo(codigo);
		setValor(valor);
		setDescricao(descricao);
	}


	public Produto() {
		super();
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}