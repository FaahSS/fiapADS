package exercicios;

import java.util.Scanner;

public class Exercicio_07 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		//chamada do método de entrada de dados
		double[] arrayNumeros = obterDadosVetor();
		
		//chamada do método ordenaNumeros
		arrayNumeros = ordenaNumeros(arrayNumeros);
		
		System.out.println("------------------------------------------------------");
		
		// Exibe o vetor ordenado
		for(int i=0;i<5;i++) {
			System.out.println("Vetor V["+(i+1)+"]= " + arrayNumeros[i]);
		}
	}
	
	//Funções
	public static double[] obterDadosVetor() {
		
		double[] arrayNumeros = new double[5];
		
		//Entrada de Dados no Vetor
		//Preenche entrada aleatoriamente
		for(int i=0;i<5;i++) {
			System.out.println("Informe o valor para posição ["+(i+1)+"] do vetor: ");
			
			//Retorna numeros entre 0.0 e 0.99
			arrayNumeros[i] = e.nextDouble();
		}
		return arrayNumeros;
	}
	
	public static double[] ordenaNumeros(double arrayNum[]) {
		double aux=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				
				if(arrayNum[j] > arrayNum[j+1]) {
					
					aux = arrayNum[j];
					arrayNum[j] = arrayNum[j+1];
					arrayNum[j+1] = aux;
				}
			}
		}
		return arrayNum;
	}

}
