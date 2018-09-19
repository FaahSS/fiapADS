package br.com.fiap.beans;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private double venda;
	private double compra;
	
	//Set All
	public void setAll(String placa, String modelo, String cor, int ano, double venda, double compra) {
		setPlaca(placa);
		setModelo(modelo);
		setCor(cor);
		setAno(ano);
		setVenda(venda);
		setCompra(compra);
	}
	
	
	//Get All
	public String getAll() {
		return "Número da Placa.: "+placa+"\n"+
			   "Descrição Modelo: "+modelo+"\n"+
			   "Cor.............: "+cor+"\n"+
			   "Ano.............: "+ano+"\n"+
			   "Valor da Venda..: "+venda+"\n"+
			   "Valor da Compra.: "+compra;
	}
	
	//Constructors
	
	public Veiculo() {
		super();
	}

	public Veiculo(String placa, String modelo, String cor, int ano, double venda, double compra) {
		super();
		setPlaca(placa);
		setModelo(modelo);
		setCor(cor);
		setAno(ano);
		setVenda(venda);
		setCompra(compra);
	}
	
	//Getters & Setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getVenda() {
		return venda;
	}
	public void setVenda(double venda) {
		this.venda = venda;
	}
	public double getCompra() {
		return compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}
	
	

}
