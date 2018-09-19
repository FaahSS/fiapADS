package br.com.fiap.exercicio12;

import java.util.Scanner;

public class Menu_Opcoes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Variáveis
		int cod=0;
		double salario=0, imposto=0, aumento=0, salarioF=0;

		//Entradas
		System.out.println("---------- Menu de Opções ----------");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salário");
		System.out.println("3. Classificação");
		System.out.println("Digite a opção desejada: ");
		cod = entrada.nextInt();
		if(cod>=4) {
			System.out.println("Informação Incorreta, escolher o Código de 1 até 3");
			System.exit(1);
		}
		System.out.println("Digite o salário de um funcionário: ");
		salario = entrada.nextDouble();

		//Processamento e Saída
		if(cod==1) {
			if(salario<=1000) {
				imposto = salario*0.07;
				salarioF= salario-imposto;
				System.out.println("O Valor do Salário é: "+salario);
				System.out.println("O Valor do Imposto é: "+imposto);
				System.out.println("O Valor do Salário Final é: "+salarioF);
			} else
				if(salario<=1850) {
					imposto = salario*0.12;
					salarioF= salario-imposto;
					System.out.println("O Valor do Salário é: "+salario);
					System.out.println("O Valor do Imposto é: "+imposto);
					System.out.println("O Valor do Salário Final é: "+salarioF);
				} else {
					imposto = salario*0.15;
					salarioF= salario-imposto;
					System.out.println("O Valor do Salário é: "+salario);
					System.out.println("O Valor do Imposto é: "+imposto);
					System.out.println("O Valor do Salário Final é: "+salarioF);
				}
		}

		if(cod==2) {
			if(salario<=900) {
				aumento=salario*0.05;
				salarioF=salario+aumento;
				System.out.println("O Valor do Salário é: "+salario);
				System.out.println("O Valor do Aumento é: "+aumento);
				System.out.println("O Valor do Salário Final é: "+ salarioF);
			} else
				if(salario<=1600) {
					aumento=salario*0.07;
					salarioF=salario+aumento;
					System.out.println("O Valor do Salário é: "+salario);
					System.out.println("O Valor do Aumento é: "+aumento);
					System.out.println("O Valor do Salário Final é: "+ salarioF);
				} else
					if(salario<=2000){
						aumento=salario*0.09;
						salarioF=salario+aumento;
						System.out.println("O Valor do Salário é: "+salario);
						System.out.println("O Valor do Aumento é: "+aumento);
						System.out.println("O Valor do Salário Final é: "+ salarioF);
					} else {
						aumento=salario*0.12;
						salarioF=salario+aumento;
						System.out.println("O Valor do Salário é: "+salario);
						System.out.println("O Valor do Aumento é: "+aumento);
						System.out.println("O Valor do Salário Final é: "+ salarioF);
					}
		}
		if(cod==3) {
			if(salario<=1550) {
				System.out.println("Mal Remunerado");
			}else {
				System.out.println("Bem Remunerado");
			}
		}


	}




}

