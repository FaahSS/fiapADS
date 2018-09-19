package br.com.fiap.exercicio18;

import java.util.Scanner;

public class Verdadeiro_Falso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Constantes
		int A=3, B=4, C=8;
		
		//Saidas
		System.out.println("A=3, B=4, C=8");
		//A
		System.out.println("a) A>3 .e. C=8");
		if (A>3 && C==8) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//B
		System.out.println("b) A<>2 .ou. B<=5");
		if (A!=2 || B<=5) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//C
		System.out.println("c) A=3 .ou. B>=2 .e. c=8");
		if (A==3 || B>=2 && C==8) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//D
		System.out.println("d) A=3 .e. .não. B<=4 .e. C=8");
		if (A==3 && !(B==4) && C==8) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//E
		System.out.println("e) A<>8 .ou. B=4 .e. C>2");
		if (A!=8 || B==4 && C>2) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//F
		System.out.println("f) B>4 .e. C<>2");
		if (B>4 && C!=2) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//G
		System.out.println("g) A>B .e. C<>4");
		if (A>B && C!=4) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//H
		System.out.println("h) A<>B .e. B=C");
		if (A!=B && B==C) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//I
		System.out.println("i) C>2 .ou. A<B");
		if (C>2 || A<B) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		//J
		System.out.println("j) A>B .ou. B>A .e. C<>B");
		if (A>B || B>A && C!=B) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
	}

}
