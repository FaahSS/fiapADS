package br.com.fiap.exercicio11;

import java.util.Scanner;

public class Troca_De_Valores_Na_Variavel {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		int x=0, y=0, memoria=0;
		
		//Entradas
		System.out.println("Digite o Valor de X: ");
		x = entrada.nextInt();
		
		System.out.println("Digite o Valor de Y: ");
		y = entrada.nextInt();
		
		//Processamento
		memoria = x;
		x = y;
		y = memoria;
		
		//Saidas
		System.out.println("O Valor de X é: "+x);
		System.out.println("O Valor de Y é: "+y);
	}

}
