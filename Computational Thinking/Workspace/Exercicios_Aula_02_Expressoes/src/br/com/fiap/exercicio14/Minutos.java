package br.com.fiap.exercicio14;

import java.util.Scanner;

public class Minutos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		int hora=0, min=0, minFinal=0;
		
		//Entradas
		System.out.println("Digite as Horas: ");
		hora = entrada.nextInt();
		
		System.out.println("Digite os Minutos: ");
		min = entrada.nextInt();
		
		//Processamento
		minFinal = (hora*60)+min;
		
		//Saidas
		System.out.println("Passaram-se "+minFinal + " minutos desde o inicio do dia");
		System.out.println("Horário informado: "+hora+":"+min);
	}
}
