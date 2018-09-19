package br.com.fiap.exercicio10;

import java.util.Scanner;

public class Parcelamento_Desc_Juros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		String nomeProduto;
		double preco=0, valor=0, valorP=0, valorV=0;
		int qtde=0;
		
		//Entradas
		System.out.println("Declare o nome do Produto: ");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Declare a Quantidade: ");
		qtde = entrada.nextInt();
		
		System.out.println("Declare o Preço do Produto: ");
		preco = entrada.nextDouble();
		
		//Processamento
		valor = qtde*preco;
		valorV = valor*0.95;
		valorP=(valor+(valor*0.7))/2;
		
		//Saidas
		System.out.println("O Valor Total do Produto é: "+valor);
		System.out.println("O Valor à vista com desconto é: "+valorV);
		System.out.println("O Valor parcelado é: "+valorP+" resultando o valor final de: "+valorP*2);
	}
}
