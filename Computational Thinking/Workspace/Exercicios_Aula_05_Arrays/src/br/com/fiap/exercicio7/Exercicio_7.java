package br.com.fiap.exercicio7;

import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String [] arrayNomes = new String[5];
		double [] arraySalario = new double[5];
		int [] arrayTempo = new int[5];
		double salarioFinal=0;
		
		
		for(int i=0;i<arrayNomes.length;i++) {
			System.out.println("------------"+(i+1)+" FUNCIONÁRIO ------------");
			System.out.print("Informe o nome do funcionário: ");
			arrayNomes[i] = e.next()+e.nextLine();
			System.out.print("Informe o salário do funcionário: ");
			arraySalario[i] = e.nextDouble();
			System.out.print("Informe o tempo de serviço do funcionário: ");
			arrayTempo[i] = e.nextInt();
			}
		
		System.out.println("------------ FUNCIONÁRIOS QUE NÃO TERÃO AUMENTO------------");
		for(int i=0;i<arrayNomes.length;i++) {
			if(arrayTempo[i]<5 && arraySalario[i]>=780) {
				System.out.println(arrayNomes[i]);
			} 
			
	}
		System.out.println("------------ FUNCIONÁRIOS QUE TERÃO AUMENTO------------");
		for(int i=0;i<5;i++) {
			if(arrayTempo[i]>5 || arraySalario[i]<780) {
			if(arrayTempo[i]>5 && arraySalario[i]<780) {
				salarioFinal = arraySalario[i]+(arraySalario[i]*0.35);
		} else if (arrayTempo[i]>5) {
			salarioFinal = arraySalario[i]+(arraySalario[i]*0.25);
		} else {
			salarioFinal = arraySalario[i]+(arraySalario[i]*0.15);
		}
			System.out.println("Nome: "+arrayNomes[i]+ "           - novo salário: R$ "+salarioFinal);
		}
			}
		e.close();
	}

}
