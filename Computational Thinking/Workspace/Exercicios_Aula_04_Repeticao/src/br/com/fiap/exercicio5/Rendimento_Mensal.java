package br.com.fiap.exercicio5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rendimento_Mensal {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("R$#,##0.00");
		
		//Variáveis
		int cliente=0, tipo=0, tot=0;
		double vlInvestido=0, rendimento=0;
		double vl1=0, vl2=0, vl3=0;
		double vlJ1=0, vlJ2=0, vlJ3=0;
		
		System.out.println("Informe o Código do Cliente: ");
		cliente = e.nextInt();
		
		while (cliente!=0) {
			System.out.println("1 - Poupança");
			System.out.println("2 - Poupança Plus");
			System.out.println("3 - Fundos de Renda Fixa");
			System.out.println("Informe o Tipo da Conta: ");
			tipo = e.nextInt();
			
			while (tipo<1 || tipo>3) {
				System.out.println("Informe o Tipo da Conta Corretamente: ");
				tipo = e.nextInt();
			}
			
			System.out.println("Valor Investido: ");
			vlInvestido = e.nextDouble();
			
			if (tipo==1) {
				rendimento = vlInvestido*0.015;
				vl1+=vlInvestido;
				vlJ1=vl1*0.015;
			} else if (tipo==2) {
				rendimento = vlInvestido*0.02;
				vl2+=vlInvestido;
				vlJ2=vl1*0.02;
			} else {
				rendimento = vlInvestido*0.04;
				vl3+=vlInvestido;
				vlJ3=vl3*0.04;
			}
			tot++;
			System.out.println("Rendimento Mensal: "+rendimento);
			System.out.println("Informe o Código do Cliente: ");
			cliente = e.nextInt();
		}
		
		System.out.println("Número de Clientes: "+tot);
		System.out.println("Total Investido em Poupança: "+p.format(vl1));
		System.out.println("Valor de Juros em Poupança: "+p.format(vlJ1));
		System.out.println("Total Investido em Poupança Plus: "+p.format(vl2));
		System.out.println("Valor de Juros em Poupança Plus: "+p.format(vlJ2));
		System.out.println("Total Investido em Renda Fixa: "+p.format(vl3));
		System.out.println("Valor de Juros em Renda Fixa: "+p.format(vlJ3));
		
		e.close();
	}

}
