package br.com.fiap.exercicio3;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double imc=0, imc2=0, altura=0, peso=0;
		
		//Entradas
		System.out.println("Digite o Peso da Pessoa: ");
		peso = entrada.nextDouble();
		
		System.out.println("Digite a Altura da Pessoa: ");
		altura = entrada.nextDouble();
		
		//Processamento
		imc = peso/Math.pow(altura,2);
		
		//Saidas
		if (imc <= 18.4) {
			System.out.println("Classificação: Baixo Peso");
		} else
			if (imc<=24.9) {
				System.out.println("Classificação: Peso Normal");
			} else
				if (imc <= 29.9) {
					System.out.println("Classificação: Pré-obesidade");
				} else
					if(imc <= 34.9) {
						System.out.println("Classificação: Obesidade Grau I");
					} else
						if(imc <=39.9) {
							System.out.println("Classificação: Obesidade Grau II");
						} else {
							System.out.println("Classificação: Obesidade Grau III");
						}
		
	}
}
