package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String cidade[] = new String[] {"CAMPINAS", "BAURU", "SOROCABA", "ATIBAIA", "SANTOS"};
		double distancia[][] = new double[5][5];
		double consumo = 0;



		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					distancia[i][j]=0;
				}else {
					System.out.print("Informe a distância entre a cidade ( "+cidade[i]+" ) e a cidade ( "+cidade[j]+" ) =");
					distancia[i][j] = e.nextDouble();
				}
			}
		}
		
		System.out.println("----------- CONSUMO DE COMBÚSTIVEL POR UM VEÍCULO -----------");
		System.out.print("Informe o consumo de um veículo: ");
		consumo=e.nextDouble();
		System.out.println("");
		System.out.println("-------------------------------------------------------------");
		System.out.println("");
		System.out.println("----------- PERCURSOS INFERIORES A 250KM -----------");
		System.out.println("");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(distancia[i][j]<250) {
					System.out.println("-- Distancia: "+distancia[i][j]+"    \t  km - entre a cidade ( "+cidade[i]+" ) e ( "+cidade[j]+" )");
				}
			}
		}
		System.out.println("");
		System.out.println("----------- CONSUMOS POR PERCURSO -----------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("Consumo entre a cidade ( "+cidade[i]+" ) e ( "+cidade[j]+" ) é: "+"\t"+distancia[i][j]/consumo+" KM");
			}
		}
	}

}
