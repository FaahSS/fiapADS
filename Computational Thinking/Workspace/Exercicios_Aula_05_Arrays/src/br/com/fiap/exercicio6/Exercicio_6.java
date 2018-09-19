package br.com.fiap.exercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("#,##");
		
		int[] arrayAlunos = new int[10];
		String [] arrayResp = new String[8];
		String [] arrayGab = new String[8];
		double nota=0, contAprovado=0, porcAprov=0;
		int alunos=0;
		
		//Entrada do Gabarito
		System.out.println("---------------GABARITO---------------");
		for(int g=0;g<8;g++) {
			System.out.println("Digite a resposta da quest�o "+(g+1)+":");
			arrayGab[g] = e.next();
		}
		
		//Entrada do N�mero do Aluno
		for(int i =0;i<10;i++) {
			alunos++;
			System.out.println("---------------ALUNO: "+(i+1)+"---------------");
			System.out.println("Digite o N�mero do "+(i+1)+"�Aluno:");
			arrayAlunos[i] = e.nextInt();
			for(int b=0;b<8;b++) {
				System.out.println("Digite a resposta dada pelo aluno "+arrayAlunos[i]+" � quest�o "+(b+1)+":");
				arrayResp[b] = e.next().toUpperCase();
				if (arrayGab[b].equalsIgnoreCase(arrayResp[b])) {
					nota++;
				}
			}
			System.out.println("A nota do aluno "+arrayAlunos[i]+" foi "+nota);
			
		    
			if(nota>=6) {
				contAprovado++;
			}
			nota=0;
		}
		
		porcAprov=(contAprovado/alunos)*100;
		System.out.println("A Porcentagem de aprova��o foi: "+p.format(porcAprov)+"%");
		System.out.println("De "+alunos+" Alunos!");
		

	}
}
