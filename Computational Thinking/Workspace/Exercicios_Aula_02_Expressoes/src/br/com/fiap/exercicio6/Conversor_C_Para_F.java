package br.com.fiap.exercicio6;

import java.util.Scanner;

public class Conversor_C_Para_F {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double f=0, c=0;
		
		//Entradas
		System.out.println("Informe a Temperatura em Graus Celsius: ");
		c = entrada.nextDouble();
		
		//Processamento
		f = (9*c+160)/5;
		
		//Saidas
		System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + f);
		
	}

}
