package br.com.fiap.exercicio11;

import java.util.Scanner;

public class Maior_Menor {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		int numero=0, numMaior=0, numMenor=0;
		
		for(int cont=1;cont<11;cont++) {
			System.out.println("Digite um número: "+cont+"º número: ");
			numero = e.nextInt();
			
			if(cont==1) {
				numMaior = numero;
				numMenor= numero;
			}
			if(numero>numMaior) {
				numMaior=numero;
			}
			if(numero<numMenor) {
				numMenor=numero;
			}
		}
		System.out.println("Maior Número: "+numMaior);
		System.out.println("Menor Número: "+numMenor);
		
		e.close();
	}

}
