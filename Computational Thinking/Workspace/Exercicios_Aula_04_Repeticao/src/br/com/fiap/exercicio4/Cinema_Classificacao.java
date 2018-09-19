package br.com.fiap.exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinema_Classificacao {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("##0.00");
		
		//Vari�veis
		int ID=0;
		char OP;
		int contA=0, contB=0, contC=0, contD=0, contE=0, tot=0;
		int somaIdade=0;
		
		System.out.println("Informe sua Idade: ");
		ID = e.nextInt();
		while(ID!=0) {
			System.out.println("A - �timo");
			System.out.println("B - Bom");
			System.out.println("C - Regular");
			System.out.println("D - Ruim");
			System.out.println("E - P�ssimo");
			System.out.println("Informe sua Opini�o sobre o Filme: ");
			OP = e.next().toUpperCase().charAt(0);
			
			while(OP!=('A') && OP!=('B') && OP!=('C') && OP!=('D') && OP!=('E')) {
				System.out.println("Digite sua opini�o corretamente: ");
				OP = e.next().toUpperCase().charAt(0);
			}
			
			switch (OP) {
			case 'A':
				contA++;
				break;
			case 'B':
				contB++;
				break;
			case 'C':
				contC++;
				break;
			case 'D':
				contD++;
				break;
			case 'E':
				contE++;
				break;
			}
			tot++;
			somaIdade+=ID;
			
			System.out.println("Informe sua Idade: ");
			ID = e.nextInt();
		}
		if(tot !=0) {
		System.out.println("Quantidade de Pessoas que responderam a essa pesquisa: "+tot);
		System.out.println("A M�dia de Idade das Pessoas que Responderam a Pesquisa � de: "+p.format((double)somaIdade/tot));
		System.out.println("Porcentagem de Opini�es em A: "+p.format((double)contA/tot*100)+"%");
		System.out.println("Porcentagem de Opini�es em B: "+p.format((double)contB/tot*100)+"%");
		System.out.println("Porcentagem de Opini�es em C: "+p.format((double)contC/tot*100)+"%");
		System.out.println("Porcentagem de Opini�es em D: "+p.format((double)contD/tot*100)+"%");
		System.out.println("Porcentagem de Opini�es em E: "+p.format((double)contE/tot*100)+"%");
		}
		
		e.close();
	}

}
