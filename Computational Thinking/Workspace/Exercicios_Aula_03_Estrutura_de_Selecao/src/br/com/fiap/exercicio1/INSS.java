package br.com.fiap.exercicio1;

import java.util.Scanner;

public class INSS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double salarioBruto=0, inss=0, salarioLiquido=0, valorFinal=0;
		
		//Entrada
		System.out.println("Digite um Sal�rio: ");
		salarioBruto = entrada.nextDouble();
		
		//Processamento
		if (salarioBruto <= 1693.72) {
			inss = salarioBruto * 0.08;
		} else 
			if (salarioBruto <=2822.90) {
				inss = salarioBruto * 0.09;
			} else 
				if (salarioBruto <=5645.80) {
					inss = salarioBruto * 0.11;
				} else {
					inss = 608.44;
				}
		salarioLiquido = salarioBruto - inss;
		
		//Saidas
		System.out.println("O Sal�rio L�quido �: " + salarioLiquido);
		System.out.println("O Sal�rio Bruto informado foi: " + salarioBruto);
		System.out.println("A Contribui��o ao INSS � de: " + inss);
	}
}
