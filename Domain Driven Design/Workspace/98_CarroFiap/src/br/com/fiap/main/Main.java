package br.com.fiap.main;

import br.com.fiap.model.Carro;

public class Main {
	public static void main(String[] args) {
		Carro c = new Carro(2000, 1900.0);
		System.out.println(c.getAno());
		System.out.println(c.getValor());
		System.out.println(c.getDesconto());
	}
}
