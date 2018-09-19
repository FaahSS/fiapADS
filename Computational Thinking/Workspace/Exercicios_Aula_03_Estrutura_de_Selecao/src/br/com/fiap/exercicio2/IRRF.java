package br.com.fiap.exercicio2;

import java.util.Scanner;

public class IRRF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double salarioBruto=0, inss=0, irrf=0, salarioLiquido=0, valorFinal=0;
		
		//Entrada
		System.out.println("Digite um Salário: ");
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
		
		if (salarioLiquido <= 1903.98) {
			irrf = 0;
		} else
			if (salarioLiquido <= 2826.65) {
				irrf = (salarioLiquido*0.075)-142.80;
			} else
				if (salarioLiquido <= 3751.05) {
					irrf = (salarioLiquido*0.15)-354.80;
				} else
					if (salarioLiquido <= 4664.68) {
						irrf = (salarioLiquido*0.225)-636.13;
					} else {
						irrf = (salarioLiquido*0.275)-869.36;
					}
		valorFinal = salarioLiquido-irrf;
		
		//Saidas
		System.out.println("O Salário Líquido é: " + salarioLiquido);
		System.out.println("O Salário Bruto informado foi: " + salarioBruto);
		System.out.println("A Contribuição ao INSS é de: " + inss);
		System.out.println("A dedução do Imposto do IRRF é de: R$"+irrf);
		System.out.println("O Salário Restante é de: R$"+valorFinal);
	}
}
