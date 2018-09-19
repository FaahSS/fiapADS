package br.com.fiap.exercicio2;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		double [] arrayTemp = new double [7];
		double somaTemp=0, media=0;
		int cont=0;
		
		//Carregar Temperaturas
		for (int i=0;i<7;i++) {
			System.out.println("Digite "+(i+1)+"ª Temperatura:");
			arrayTemp[i] = e.nextDouble();
			//Somando Temperatura
			somaTemp+=arrayTemp[i];	
		}
		media=somaTemp/7;
		System.out.println("Média Temperaturas:"+media);
		
		for (int i=0;i<7;i++) {
			if(arrayTemp[i]>media) {
				cont++;
			}
		}
		
		System.out.println(cont+" dias a temperatura foi maior!");
		
	}

}
