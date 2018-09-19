package br.com.fiap.exercicio6;

import java.util.Scanner;

public class Forma_Pagamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		int cod=0;
		double precoProduto=0, conta=0;
		
		//Entradas
		System.out.println("Digite o Pre�o do Produto: ");
		precoProduto = entrada.nextDouble();
		System.out.println("1 - � vista em dinheiro ou cheque, recebe 10% de desonto.");
		System.out.println("2 - � vista no cart�o de cr�dito, recebe 5% de desconto.");
		System.out.println("3 - Em duas vezes, pre�o normal de etiqueta sem juros.");
		System.out.println("4 - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%.");
		System.out.println("Digite a condi��o de pagamento: ");
		cod = entrada.nextInt();
		
		//Processamento e Sa�da
		switch (cod) {
		case 1:
			conta = precoProduto - (precoProduto*0.10);
			System.out.println("O Valor a ser pago �: R$"+conta);
			break;
		
		case 2:
			conta = precoProduto - (precoProduto*0.05);
			System.out.println("O Valor a ser pago �: R$"+conta);
			break;
			
		case 3:
			conta = precoProduto/2;
			System.out.println("O Valor a ser pago �: R$"+conta +" em duas vezes sem juros do Valor do Produto");
			break;
			
		case 4:
			conta = (precoProduto + (precoProduto*0.1))/3;
			System.out.println("O Valor a ser pago �: R$"+conta+" em tr�s vezes com juros de 10% em cima do valor do Produto");
			break;
		default:
			System.out.println("Caso indispon�vel, favor informar um n�mero entre 1 e 4.");
			break;
		}
		
	}

}
