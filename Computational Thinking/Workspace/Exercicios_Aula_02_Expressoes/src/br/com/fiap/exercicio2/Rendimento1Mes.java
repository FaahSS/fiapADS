package br.com.fiap.exercicio2;

import java.util.Scanner;

public class Rendimento1Mes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Vari�veis
		double valorInicial=0, valorFinal=0;
		
		//Entradas
		System.out.println("Digite o valor depositado: ");
		valorInicial = entrada.nextDouble();
		
		//Processamento
		valorFinal = valorInicial+(valorInicial*0.04);
		
		//Saida
		System.out.println("O Valor com rendimento ap�s 1 m�s �: "+ valorFinal);
		
		
		
		
	}

}
