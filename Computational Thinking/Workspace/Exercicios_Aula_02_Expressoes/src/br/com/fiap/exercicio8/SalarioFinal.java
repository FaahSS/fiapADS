package br.com.fiap.exercicio8;

import java.util.Scanner;

public class SalarioFinal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double salarioMin=0, salarioBruto=0, horasTrab=0,
				vHorasTrab=0, imposto=0, salarioFinal=0;
		
		//Entradas
		System.out.println("Digite o Sal�rio M�nimo: ");
		salarioMin = entrada.nextDouble();
		
		System.out.println("Digite o N�mero de Horas Trabalhadas: ");
		horasTrab = entrada.nextDouble();
		
		//Processamento
		vHorasTrab = salarioMin/3;
		salarioBruto = horasTrab * vHorasTrab;
		imposto = salarioBruto*0.07;
		salarioFinal = salarioBruto - imposto;
		
		//Saidas
		System.out.println("A hora trabalhada equivale a: " + vHorasTrab);
		System.out.println("O Sal�rio Bruto equivale a: "+ salarioBruto);
		System.out.println("O Imposto equivale a: "+ imposto);
		System.out.println("O Sal�rio a receber �: " + salarioFinal);
	}
}
