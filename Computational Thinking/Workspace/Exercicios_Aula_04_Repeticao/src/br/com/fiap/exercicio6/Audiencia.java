package br.com.fiap.exercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Audiencia {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("##0.00");
		
		//Variáveis
		int nrCanal=0, nrPessoas=0;
		int cont4=0, cont5=0, cont7=0, cont12=0, tot=0;
		
		System.out.println("Informe o Canal Assistido: ");
		nrCanal = e.nextInt();
		
		while (nrCanal!=0) {
		while (nrCanal!=4 && nrCanal!=5 && nrCanal!=7 && nrCanal!=12) {
			System.out.println("Infome um Canal Válido: ");
			nrCanal=e.nextInt();
		}
			System.out.println("Informe o Número de Pessoas Assistindo: ");
			nrPessoas = e.nextInt();
		
			if (nrCanal==4) {
				cont4=+nrPessoas;
			} else if (nrCanal==5) {
				cont5=+nrPessoas;
			} else if (nrCanal==7) {
				cont7=+nrPessoas;
			} else {
				cont12=+nrPessoas;
			}
			System.out.println("Informe o Canal Assistido: ");
			nrCanal = e.nextInt();
			
		}
		tot = cont4 + cont5 + cont7 + cont12;
		System.out.println("Quantidade Total de Pessoas Assistindo TV: "+tot);
		System.out.println("Canal 4: "+p.format((double)cont4/tot*100)+"% de Audiência que Equivalem à: "+cont4+" Pessoas!");
		System.out.println("Canal 5: "+p.format((double)cont5/tot*100)+"% de Audiência que Equivalem à: "+cont5+" Pessoas!");
		System.out.println("Canal 7: "+p.format((double)cont7/tot*100)+"% de Audiência que Equivalem à: "+cont7+" Pessoas!");
		System.out.println("Canal 12: "+p.format((double)cont12/tot*100)+"% de Audiência que Equivalem à: "+cont12+" Pessoas!");
		
		e.close();
		
		
	}

}
