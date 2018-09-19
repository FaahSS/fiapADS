package br.com.fiap.model;

public class Carro {
	private int ano;
	private double valor;
	
	public double getDesconto() {
		if (ano > 2000) {
			return 0.07;
		} else {
			return 0.12;
		}
			}
	public Carro(int ano, double valor) {
		//
		this.ano = ano;
		this.valor = valor;
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
