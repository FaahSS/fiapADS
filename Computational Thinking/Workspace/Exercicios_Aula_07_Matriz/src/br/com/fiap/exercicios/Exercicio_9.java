package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_9 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int medalhas[][] = new int[5][4];
		String esporte[] = new String[] {"Nata��o", "Atletismo", "Jud�", "Ciclismo"};
		String paises[] = new String[] {"Brasil", "R�ssia", "Alemanha", "China"};
		int somaEsportes[] = new int[4];
		int totalMatriz =0;
		
		
		int maiorMedalha =0;
		String maiorPais="", maiorModalidade="";
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Informe a quantidade de medalhas do pa�s "+paises[j]+" na modalidade "+esporte[i]);
				medalhas[i][j] = e.nextInt();
				//Soma Matriz
				totalMatriz += medalhas[i][j];
				//Soma Esportes
				somaEsportes[i] += medalhas[i][j];
				//Soma Medalhas
				medalhas[4][j] += medalhas[i][j]; //Soma Medalha
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(medalhas[i][j]==0) {
					maiorMedalha = medalhas[i][j];
					maiorPais= paises[j];
					maiorModalidade = esporte[i];
				}
				if(medalhas[i][j]>maiorMedalha) {
					maiorMedalha = medalhas[i][j];
					maiorPais = paises[j];
					maiorModalidade = esporte[i];
				}
			}
		}
		System.out.println("A) Qual pa�s teve o maior n�mero de medalhas e em qual modalidade?");
		System.out.println(maiorPais+" com "+maiorMedalha+" Medalhas na modalidade "+maiorModalidade+";");
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
			}
		}
		
		
	}
}
