package br.com.fiap.exercicio1;

import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
	double distancia=0, combustivel=0, consMedio=0;
	
	
	//Entradas
	System.out.println("Digite a dist�ncia: ");
	distancia = entrada.nextDouble();
	
	System.out.println("Digite o consumo de combust�vel: ");
	combustivel = entrada.nextDouble();
	
	//Processamento
	consMedio = distancia/combustivel;
	
	//Saidas
	
	System.out.println("Consumo m�dio: "+ consMedio);
	
	
	}

}
