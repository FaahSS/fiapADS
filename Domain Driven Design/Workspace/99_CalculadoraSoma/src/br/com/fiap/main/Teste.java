package br.com.fiap.main;

import br.com.fiap.model.Calculadora;

public class Teste {
public static void main(String[] args) {
	Calculadora c =  new Calculadora();
	
	c.soma(10, 5);
	System.out.println(c.getR());
}
}
