package br.com.fiap.exercicio5;

import java.util.Scanner;

public class CarroNovo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double precoFabrica=0, percentLuc=0, imposto=0,
				valorFinal=0, valorDistri=0, valorImp=0;
		
		//Entradas
		System.out.println("Informe o pre�o do Ve�culo: ");
		precoFabrica = entrada.nextDouble();
		
		System.out.println("Digite o Percentual de Lucro do Distribuidor: ");
		percentLuc = entrada.nextDouble();
		
		System.out.println("Digite o Percentual de Impostos: ");
		imposto = entrada.nextDouble();
		
		//Processamento
		imposto = imposto/100;
		percentLuc = percentLuc/100;
		valorDistri = precoFabrica * percentLuc;
		valorImp = precoFabrica * imposto;
		valorFinal = precoFabrica + valorImp + valorDistri;
		
		//Saidas
		System.out.println("O Valor correspondente ao Lucro do Distribuidor �: " + valorDistri);
		System.out.println("O Valor correspondente aos Impostos �: " + valorImp);
		System.out.println("O Pre�o Final do Ve�culo �: " + valorFinal);
	}
}
