package br.com.fiap.exercicio7;

import java.util.Scanner;

public class Juros_Composto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double capital=0, taxaMJuros=0, montante=0;
		int periodoM=0;
		
		//Entradas
		System.out.println("Digite o valor do Capital: ");
		capital = entrada.nextDouble();
		
		System.out.println("Digite o valor da Taxa Mensal de Juros: ");
		taxaMJuros = entrada.nextDouble();
		
		System.out.println("Digite o Período em Meses: ");
		periodoM = entrada.nextInt();
		
		//Processamento
		taxaMJuros = taxaMJuros/100;
		montante = capital*Math.pow((1+taxaMJuros),periodoM);
		
		//Saidas
		System.out.println("O Montante após o período de aplicação é: "+ montante);
	}
}
