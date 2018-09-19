package br.com.fiap.exercicio9;

import java.util.Scanner;

public class Ordem_Decrescente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Variáveis
		int a=0, b=0, c=0;

		//Entradas
		System.out.println("Digite o Valor de A: ");
		a = entrada.nextInt();

		System.out.println("Digite o Valor de B: ");
		b = entrada.nextInt();

		System.out.println("Digite o Valor de C: ");
		c= entrada.nextInt();

		//Processamento e Saída
		if (a==b || a==c || b==c) {
			System.out.println("Alguns dos números digitados são Iguais, refaça a operação.");
		}else
			if(a>b && a>c) {
				if (b>c) {
					System.out.println("A: "+a+" B: "+b+" C: "+c);
				}else{
					System.out.println("A: "+a+" C: "+c+" B: "+b);	
				} 
			}

		if (b>a && b>c) {
			if (a > c) {
				System.out.println("B: "+b+" A: "+a+" C: "+c);
			}else {
				System.out.println("B: "+b+" C: "+c+" A: "+a);
			}
		}
		if(c>a && c>b) {
			if(a>b) {
				System.out.println("C: "+c+" A: "+a+" B: "+b);
			}else {
				System.out.println("C: "+c+" B: "+b+" A: "+a);
			}
		}




	}
}


