package br.com.fiap.modelo;

public class Produto {
	//Atributos
	private String descricao;
	private double valor;
	private int codigo;
	
	//aumentar
	public double aumentar(double p) {
		return valor = valor + valor * (p/100);
	}
	
	//getResumo
	public String getResumo() {
		return descricao.substring(0, descricao.length()/2);
	}
	
	//SetAll & GetAll
	
	public String getAll() {
		return "Descrição: " + descricao + "\n" +
			   "Valor....: " + valor + "\n" +
			   "Codigo...: " + codigo;
	}
	
	public void setAll(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	
	//Construtor
	public Produto() {
	}
	
	public Produto(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	// Get & Set
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor < 0) {
			valor = 1;
		}
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if (codigo < 1) {
			codigo = 1;
		}
		this.codigo = codigo;
	}

	

}
