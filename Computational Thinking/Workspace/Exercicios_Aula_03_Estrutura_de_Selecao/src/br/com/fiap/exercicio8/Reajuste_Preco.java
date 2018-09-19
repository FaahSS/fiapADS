package br.com.fiap.exercicio8;

import java.util.Scanner;

public class Reajuste_Preco {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double preco=0, precoF=0;
		int vendaM=0;
		
		//Entradas
		System.out.println("Informe o preço do Produto: ");
		preco = entrada.nextDouble();
		System.out.println("Informe a Quantidade de Vendas: ");
		vendaM = entrada.nextInt();
		
		//Processamento
		if (preco < 30 || vendaM < 500) {
			precoF= preco+(preco*0.10);
		}else
			if (preco <80 || vendaM < 1200) {
				precoF = preco+(preco*0.15);
			}else{
				precoF=preco+(preco*0.20);
		}
		//Saidas
		System.out.println("O Valor Inicial do Produto é: "+ preco);
		System.out.println("A Quantidade de Vendas deste é: "+ vendaM);
		System.out.println("O Valor atualizado do Produto é: " + precoF);
	
	}

}
