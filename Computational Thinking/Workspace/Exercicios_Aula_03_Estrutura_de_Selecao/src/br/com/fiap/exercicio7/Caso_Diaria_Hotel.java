package br.com.fiap.exercicio7;

import java.util.Scanner;

public class Caso_Diaria_Hotel {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Vari�veis
		double hotelDiaria=0, taxa=0, conta=0;
		String cliente;
		
		//Constantes
		double DIARIA=80;
		
		//Entradas
		System.out.println("Informe o nome do Cliente: ");
		cliente = entrada.nextLine();
		System.out.println("Informe o n�mero de di�rias: ");
		hotelDiaria = entrada.nextDouble();
		
		//Processamento e Sa�da
		if (hotelDiaria <=14) {
			taxa=8;
			conta= DIARIA * hotelDiaria + (hotelDiaria*taxa);
			System.out.println("O Nome do Cliente �: "+cliente);
			System.out.println("O Valor da Conta �: "+conta);
		}else
			if(hotelDiaria==15) {
				taxa=6;
				conta= DIARIA * hotelDiaria + (hotelDiaria*taxa);
				System.out.println("O Nome do Cliente �: "+cliente);
				System.out.println("O Valor da Conta �: "+conta);
			} else {
				taxa=5.50;
				conta= DIARIA * hotelDiaria + (hotelDiaria*taxa);
				System.out.println("O Nome do Cliente �: "+cliente);
				System.out.println("O Valor da Conta �: "+conta);
		}
	}
}
