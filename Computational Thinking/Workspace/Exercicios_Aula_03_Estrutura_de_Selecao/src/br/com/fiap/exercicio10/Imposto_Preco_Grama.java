package br.com.fiap.exercicio10;

import java.util.Scanner;

public class Imposto_Preco_Grama {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Variáveis
		int codigo=0, codPais=0;
		double peso=0, gramas=0, preco=0, valorTotal=0, precoTotal=0, imposto=0;

		//Entradas
		System.out.println("1 - Imposto  0%");
		System.out.println("2 - Imposto 15%");
		System.out.println("3 - Imposto 25%");
		System.out.println("Digite o Código do Produto: ");
		codigo = entrada.nextInt();

		System.out.println("Digite o Peso do Produto: ");
		peso = entrada.nextDouble();

		System.out.println("1 até 4  - Preço por Grama R$15");
		System.out.println("5 até 7  - Preço por Grama R$25");
		System.out.println("8 até 10 - Preço por Grama R$35");
		System.out.println("Digite o Código do País de Origemm: ");
		codPais = entrada.nextInt();

		//Processamento
		gramas = peso*1000;

		if (codigo<=4) {
			preco=15;
			precoTotal = preco*gramas;
		}else
			if(codigo<=7) {
				preco=25;
				precoTotal = preco*gramas;
			}else
				if(codigo<=10){
					preco=35;
					precoTotal = preco*gramas;
				} else {
					System.out.println("Código Incorreto, digite um código de 1 até 10.");
					System.exit(1);
				}
		if (codPais == 1) { 	 	
			imposto = precoTotal*0;
			valorTotal = precoTotal+imposto;
		}else
			if(codPais == 2) {
				imposto = precoTotal*0.15;
				valorTotal = precoTotal+imposto;
			}else 
				if(codPais ==3){
					imposto = precoTotal*0.25;
					valorTotal= precoTotal+imposto;
				} else {
					System.out.println("País Inválido, refaça a operação");
					System.exit(1);
				}

		//Saidas
		System.out.println("O Código digitado foi: "+codigo);
		System.out.println("O Peso do Produto em Quilos é: "+peso);
		System.out.println("O Codigo do País fornecido foi: "+codPais);
		System.out.println("O peso do produto em Gramas é: "+gramas);
		System.out.println("O Preço Total do Produto sem Imposto é: "+precoTotal);
		System.out.println("O Valor do Imposto é: "+imposto);
		System.out.println("O Preço Total do Produto com Imposto é: "+ valorTotal);
	}
}

