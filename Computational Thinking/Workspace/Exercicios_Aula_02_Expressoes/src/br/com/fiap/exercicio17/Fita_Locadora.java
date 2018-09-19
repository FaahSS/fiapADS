package br.com.fiap.exercicio17;

import java.util.Scanner;

public class Fita_Locadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		int qtdFita=0;
		double aluguel=0, fatAnual=0, conta=0, multas=0, quantFinal=0;
		
		//Constantes
		double FITAALUGADA=0;
		
		//Entradas
		System.out.println("Digite a Quantidade de Fitas: ");
		qtdFita = entrada.nextInt();
		
		System.out.println("Digite o valor de cada Aluguel: ");
		aluguel = entrada.nextDouble();
		
		//Processamento
		FITAALUGADA = qtdFita/3;
		//A
		conta = qtdFita;
		fatAnual = (FITAALUGADA*aluguel)*12;
		//B
		multas = (aluguel*0.1) * (FITAALUGADA/10);
		//C
		quantFinal = qtdFita - (qtdFita*0.02) + (qtdFita*0.1);
		
		//Saidas
		System.out.println("O Faturamento Anual da Locadora é: "+fatAnual);
		System.out.println("O Valor de Multas é: "+multas);
		System.out.println("Quantidade Final de Fitas: "+quantFinal);
		
	}

}
