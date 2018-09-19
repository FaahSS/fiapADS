package br.com.fiap.exercicio15;

import java.util.Scanner;

public class Ler_0_Ate_60 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		int numero=0, sucessor=0;
		
		//Entradas
		System.out.println("Digite um Número entre 0 a 60: ");
		numero = entrada.nextInt();
		
		//Processamento
		sucessor = numero + 1;
		
		//Saidas
		System.out.println("O Sucessor é: "+ sucessor % 61);
	}

}
