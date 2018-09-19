package br.com.fiap.exercicio5;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
			
		String[] arrayMeses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double[] arrayTemperatura = new double[12];
		String mesMaior="", mesMenor="";
		
		double maiorTemp=0, menorTemp=0;
		
		for(int i=0;i<12;i++) {
			System.out.println("Informe a temperatura do mês de "+arrayMeses[i]+":");
			arrayTemperatura[i]=e.nextDouble();
			
			if(i==0) {
				maiorTemp=arrayTemperatura[i];
				menorTemp=arrayTemperatura[i];
				mesMenor=arrayMeses[i];
				mesMaior=arrayMeses[i];
			} else {
			
			if(arrayTemperatura[i] > maiorTemp) {
				maiorTemp = arrayTemperatura[i];
				mesMaior = arrayMeses[i];
			}
			if(arrayTemperatura[i] < menorTemp) {
				menorTemp = arrayTemperatura[i];
				mesMenor = arrayMeses[i];
			}
			
		}
		}
		
		System.out.println("Maior temperatura "+maiorTemp+" graus ocorrida em: "+mesMaior);
		System.out.println("Menor temperatura "+menorTemp+" graus ocorrida em: "+mesMenor);
		
		
	
	}
}
