package br.com.fiap.exercicio12;

import java.util.Scanner;

public class Calculo_Salario_Bruto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double salarioBruto=0, gratificacao=0, imposto=0, valorFinal=0;
		
		//Entradas
		System.out.println("Informe o valor do Sal�rio Bruto: ");
		salarioBruto = entrada.nextDouble();
		
		//Processamento
		gratificacao = salarioBruto*0.1;
		imposto = salarioBruto * 0.2;
		valorFinal = salarioBruto - imposto + gratificacao;
		
		//Saidas
		System.out.println("O Sal�rio L�quido �: "+valorFinal);
		System.out.println("O Sal�rio Bruto �: "+salarioBruto);
		System.out.println("A Gratifica��o em cima do Sal�rio Bruto � de 10%: "+gratificacao);
		System.out.println("O Imposto de Renda em cima do Sal�rio Bruto � de 20%: "+imposto);
	}

}
