package br.com.fiap.exercicio1;

import java.util.Scanner;

public class Mod_Array {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int[] numero = new int[6];
		int contPar=0, contImpar=0;
		
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"� N�mero: ");
			numero[i] = e.nextInt();
		}
		
		for(int i=0;i<6;i++) {
			if(numero[i]%2==0) {
				System.out.println("O N�mero "+numero[i]+" � PAR");
				contPar++;		
			} else {
				System.out.println("O N�mero "+numero[i]+" � IMPAR");
				contImpar++;
			}
			
		}
		
		System.out.println("Quantidade de n�meros Pares:"+contPar);
		System.out.println("Quantidade de n�meros �mpares:"+contImpar);
	}
}
