package br.com.fiap.exercicios;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		/*int numero[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
		int numero2[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
		*/
		int matrizMegaSena[][] = new int[6][10];
		int sorteado[] = new int[6];
		int apostado[] = new int[6];
		int cont=1;
		String msg="X";
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				matrizMegaSena[i][j]=cont;
				System.out.print(matrizMegaSena[i][j]+"\t");
				cont++;
			}
			System.out.println(" ");
		}
		System.out.println("");
		System.out.println("-------- N�MEROS SORTEADOS --------");
		for(int i =0;i<6;i++) {
			System.out.println("Informe o "+(i+1)+"� n�mero sorteado: ");
			//sorteado[i] = e.nextInt();	
			for(int j=0;j<10;j++) {
				if(sorteado[i]==matrizMegaSena[i][j]) {
					matrizMegaSena[i][j] = (char)'X';
				}
			}
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matrizMegaSena[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		System.out.println("-------- N�MEROS APOSTADOS --------");
		for(int i=0;i<6;i++) {
			System.out.println("Informe o "+(i+1)+"� n�mero apostado: ");
			//apostado[i] = e.nextInt();
		}
	}

}
