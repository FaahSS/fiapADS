package br.com.fiap.main;

import br.com.fiap.beans.Fabricante;
import br.com.fiap.beans.Produto;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto(); //Produto produto = new Produto(1, "Churros", 10.5, new Fabricante("123","Chaves SA"));
		
		produto.setCodigo(1);
		produto.setDescricao("Computador Dell i7, 16 gb, GeForce 940MX");
		produto.setValor(55.50);
		produto.setFabricante(new Fabricante("72.381.189/0001-10: DELL COMPUTADORES DO BRASIL LTDA","Dell"));
	//	System.out.println(produto.getAll());
		
		//Utilizando o setall()
	/*	Fabricante f = new Fabricante();
		f.setAll("123456", "Chaves SA");
		Produto p2 = new Produto();
		p2.setAll(2, "Mouse", 45, f);
		System.out.println(p2.getAll()); */
		
		//GetDesconto
		//System.out.println(produto.getDesconto());
		
		//GetBasico
		//System.out.println(produto.getBasico());
		
		//setBasico
		produto.setBasico("Mouse", 60.6);
		System.out.println(produto.aumentar(50));
		System.out.println(produto.getValor());
		//System.out.println(produto.getBasico());
		//System.out.println(produto.getDescricao());
		
		
		
		


	}

}
