package br.com.fiap.exercicio4;

import java.util.Scanner;

public class Rendimento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double valor=0, rendimento=0;
		String tipo;
		
		//Entradas
		System.out.println("P - Poupança            - 3%");
		System.out.println("F - Fundo de Renda Fixa - 5%");
		System.out.println("C - CDB                 - 6%");
		System.out.println("A - Ações              - 10%");
		System.out.println("Digite o Tipo de Invstimento: ");
		tipo = entrada.nextLine();
		System.out.println("Digite o Valor do Investimento: ");
		valor = entrada.nextDouble();
		
		//Processamento
		switch (tipo) {
		case "P": 
			rendimento=valor*0.03;
			System.out.println("O Rendimento mensal da Poupança é de: R$"+rendimento);
			break;
			
		case "F":
			rendimento=valor*0.05;
			System.out.println("O Rendimento Mensal do Fundo de Renda Fixa é de: R$"+rendimento);
			break;
			
		case "C":
			rendimento=valor*0.06;
			System.out.println("O Rendimento Mensal do CDB é de: R$"+rendimento);
			break;
		
		case "A":
			rendimento=valor*0.1;
			System.out.println("O Rendimento Mensal das Ações é de: R$"+rendimento);
			break;
		}
}
}