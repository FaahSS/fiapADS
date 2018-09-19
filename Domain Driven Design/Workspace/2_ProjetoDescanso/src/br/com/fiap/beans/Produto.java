package br.com.fiap.beans;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private Fabricante fabricante;

	public String aumentar(double porc) {
		valor = valor + valor * (porc/100);
		return "Produto Alterado!";
	}
	
	public double getDesconto() {
		return valor*0.9;
	}
	
	public String getBasico() {
		return "Descrição: " + descricao + "\n" +
				"Valor....: " + valor; 
	}
	
	
	public void setBasico(String descricao, double valor) {
		setDescricao(descricao);
		setValor(valor);
	}
	
	//SetAll	
	public void setAll(int c, String d, double v, Fabricante f) {
		codigo=c;
		descricao=d;
		valor=v;
		fabricante=f;
	}
	
	//GetAll
	public String getAll() {
		return "Código......: " + codigo + "\n" +
				"Descrição...: " + descricao + "\n" +
				"Valor.......: " + valor + "\n" + 
				"Fabricante..: " + "\n" + fabricante.getAll();
	}
	
	//Construtores
	public Produto() {}
	public Produto(int codigo, String descricao, double valor, Fabricante fabricante) {
		this.codigo=codigo;
		this.descricao=descricao;
		this.valor=valor;
		this.fabricante=fabricante;
	}

	//Getters & Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


}
