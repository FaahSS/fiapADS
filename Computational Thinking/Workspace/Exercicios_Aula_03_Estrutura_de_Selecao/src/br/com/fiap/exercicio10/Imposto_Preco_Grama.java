package br.com.fiap.exercicio10;

import java.util.Scanner;

public class Imposto_Preco_Grama {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Vari�veis
		int codigo=0, codPais=0;
		double peso=0, gramas=0, preco=0, valorTotal=0, precoTotal=0, imposto=0;

		//Entradas
		System.out.println("1 - Imposto  0%");
		System.out.println("2 - Imposto 15%");
		System.out.println("3 - Imposto 25%");
		System.out.println("Digite o C�digo do Produto: ");
		codigo = entrada.nextInt();

		System.out.println("Digite o Peso do Produto: ");
		peso = entrada.nextDouble();

		System.out.println("1 at� 4  - Pre�o por Grama R$15");
		System.out.println("5 at� 7  - Pre�o por Grama R$25");
		System.out.println("8 at� 10 - Pre�o por Grama R$35");
		System.out.println("Digite o C�digo do Pa�s de Origemm: ");
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
					System.out.println("C�digo Incorreto, digite um c�digo de 1 at� 10.");
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
					System.out.println("Pa�s Inv�lido, refa�a a opera��o");
					System.exit(1);
				}

		//Saidas
		System.out.println("O C�digo digitado foi: "+codigo);
		System.out.println("O Peso do Produto em Quilos �: "+peso);
		System.out.println("O Codigo do Pa�s fornecido foi: "+codPais);
		System.out.println("O peso do produto em Gramas �: "+gramas);
		System.out.println("O Pre�o Total do Produto sem Imposto �: "+precoTotal);
		System.out.println("O Valor do Imposto �: "+imposto);
		System.out.println("O Pre�o Total do Produto com Imposto �: "+ valorTotal);
	}
}

