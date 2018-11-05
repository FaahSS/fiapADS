package exercicios;

import java.util.Scanner;

public class Exercicio_05 {
	static Scanner e = new Scanner(System.in);
	static int vetor1[] = new int[8];
	static int vetor2[] = new int[8];
	static int vetor3[] = new int[8];
	
	static int cont1, cont2;
	
	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			System.out.println("Informe o "+(i+1)+"º número: ");
			vetor1[i] = e.nextInt();
		}
		
		cont1 = pares();
		if(cont1==0) {
			System.out.println("Nenhum Par");
		}else {
			System.out.println("Relação de Números Pares: ");
			for(int i=0;i<cont1;i++) {
				System.out.println("Número digitado: "+vetor2[i]);
			}
		}
		
		cont2 = impares();
		if(cont2==0) {
			System.out.println("Nenhum Ímpar");
		}else {
			System.out.println("Relação de Números Ímpares: ");
			for(int i=0;i<cont2;i++) {
				System.out.println("Número digitado: "+vetor3[i]);
			}
		}

	}
	
	//Funções
	public static int pares() {
		int cont=0, resto=0;
		for(int i=0;i<8;i++) {
			resto = vetor1[i]%2;
			if (resto==0) {
				vetor2[cont]= vetor1[i];
				cont++;
			}
		}
		return cont;
	}
	
	public static int impares() {
		int cont=0, resto=0;
		for(int i=0;i<8;i++) {
			resto = vetor1[i]%2;
			if (resto==1) {
				vetor3[cont]= vetor1[i];
				cont++;
			}
		}
		return cont;
	}
}
