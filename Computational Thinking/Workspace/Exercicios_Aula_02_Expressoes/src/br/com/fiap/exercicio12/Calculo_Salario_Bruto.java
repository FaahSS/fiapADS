package br.com.fiap.exercicio12;

import java.util.Scanner;

public class Calculo_Salario_Bruto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double salarioBruto=0, gratificacao=0, imposto=0, valorFinal=0;
		
		//Entradas
		System.out.println("Informe o valor do Salário Bruto: ");
		salarioBruto = entrada.nextDouble();
		
		//Processamento
		gratificacao = salarioBruto*0.1;
		imposto = salarioBruto * 0.2;
		valorFinal = salarioBruto - imposto + gratificacao;
		
		//Saidas
		System.out.println("O Salário Líquido é: "+valorFinal);
		System.out.println("O Salário Bruto é: "+salarioBruto);
		System.out.println("A Gratificação em cima do Salário Bruto é de 10%: "+gratificacao);
		System.out.println("O Imposto de Renda em cima do Salário Bruto é de 20%: "+imposto);
	}

}
