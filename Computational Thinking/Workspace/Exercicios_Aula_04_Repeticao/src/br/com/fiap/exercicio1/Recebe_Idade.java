package br.com.fiap.exercicio1;

import java.util.Scanner;

public class Recebe_Idade {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		int idade=0, tot1=0, tot2=0, tot3=0, tot4=0, tot5=0, i=0;
		
		for (i=0; i<5;i++) {
			System.out.println("Digite a sua idade: ");
			idade = e.nextInt();
			
			if (idade<=15) {
				tot1++;
			} else if(idade<=30) {
				tot2++;
			} else if(idade<=45) {
				tot3++;
			} else if(idade<=60) {
				tot4++;
			} else {
				tot5++;
			}
		}
		System.out.println("1ª Faixa Etária: "+tot1+" Pessoas.");
		System.out.println("2ª Faixa Etária: "+tot2+" Pessoas.");
		System.out.println("3ª Faixa Etária: "+tot3+" Pessoas.");
		System.out.println("4ª Faixa Etária: "+tot4+" Pessoas.");
		System.out.println("5ª Faixa Etária: "+tot5+" Pessoas.");
		System.out.println((double)tot1/i*100 +"% estão na 1ª Faixa Etária.");
		
		e.close();
	}

}
