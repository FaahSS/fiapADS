package br.com.fiap.exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eleicao_Voto {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("##0.00");
		
		//Variáveis
		int voto=0;
		int voto1=0, voto2=0, voto3=0, voto4=0, voto5=0,voto6=0,tot=0;
		
		System.out.println("Informe seu voto: ");
		voto = e.nextInt();
		while (voto!=0) {
			if(voto>6) {
				System.out.println("Voto inválido!");
				tot--;
			} else if (voto==1) {
				voto1++;
			} else if (voto==2) {
				voto2++;
			} else if (voto==3) {
				voto3++;
			} else if (voto==4) {
				voto4++;
			} else if (voto==5) {
				voto5++;
			} else {
				voto6++;
			}
			tot++;
			
			System.out.println("Informe seu voto: ");
			voto = e.nextInt();
		}
		System.out.println("Total de Votos para o Candidato 1: "+voto1);
		System.out.println("Total de Votos para o Candidato 2: "+voto2);
		System.out.println("Total de Votos para o Candidado 3: "+voto3);
		System.out.println("Total de Votos para o Candidado 4: "+voto4);
		System.out.println("Total de Votos Nulos: "+voto5);
		System.out.println("Total de Votos em Branco: "+voto6);
		System.out.println("A Porcentagem de Votos Nulo foi de: "+p.format((double)voto5/tot*100)+"%");
		System.out.println("A Porcentagem de Votos em Branco foi de: "+p.format((double)voto6/tot*100)+"%");
		
		e.close();
	}
}
