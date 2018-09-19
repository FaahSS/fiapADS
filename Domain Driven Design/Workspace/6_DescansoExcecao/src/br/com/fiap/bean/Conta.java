package br.com.fiap.bean;

public class Conta {
	private String numero;
	private double saldo;
	
	//getAll & setAll
	public String getAll() {
		return numero + "\n" + saldo;
	}
	
	public void setAll(String numero, double saldo) {
		setNumero(numero);
		setSaldo(saldo);
	}
	
	//Constructors
	public Conta() {
		super();
	}
	public Conta(String numero, double saldo) {
		super();
		setNumero(numero);
		setSaldo(saldo);
	}
	
	//Get & Set
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
