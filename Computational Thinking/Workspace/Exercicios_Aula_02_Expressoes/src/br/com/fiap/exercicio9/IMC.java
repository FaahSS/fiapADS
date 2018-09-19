package br.com.fiap.exercicio9;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double imc=0, altura=0, peso=0;
		
		//Entradas
		System.out.println("Digite o Peso da Pessoa: ");
		peso = entrada.nextDouble();
		
		System.out.println("Digite a Altura da Pessoa: ");
		altura = entrada.nextDouble();
		
		//Processamento
		imc = peso/Math.pow(altura,2);
		
		//Saidas
		System.out.println("O Peso informado foi: "+peso);
		System.out.println("A Altura informada foi: "+altura);
		System.out.println("O Índice de Massa Corporal da Pessoa é: " +imc);
		
	}
}
