package br.com.fiap.exercicio4;

import java.util.Scanner;

public class Quilowatt {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double salarioMin=0, quilowatt=0, quantQuil=0,
				descQuil=0, valorQuil=0;
		
		//Entrada
		System.out.println("Digite o Sal�rio M�nimo: ");
		salarioMin = entrada.nextDouble();
		
		System.out.println("Digite a Quantidade de Quilowatts consumida: ");
		quantQuil = entrada.nextDouble();
		
		//Processamento
		quilowatt = salarioMin/5;
		valorQuil = quantQuil*quilowatt;
		descQuil = valorQuil - (valorQuil*0.15);
		
		//Saida
		System.out.println("O Valor de cada Quilowatt �: " + quilowatt);
		System.out.println("O Valor a ser pago por essa resid�ncia �: " + valorQuil);
		System.out.println("O Valor pago com desconto de 15% �: " + descQuil);
	}
}
