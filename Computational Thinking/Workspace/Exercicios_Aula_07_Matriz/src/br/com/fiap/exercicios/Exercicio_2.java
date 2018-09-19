package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int num[][] = new int[2][2];
		int res[][] = new int[2][2];
		int numMaior=0;

		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print("Informe um número M["+(i+1)+", "+(1+j)+"]= ");
				num[i][j] = e.nextInt();

				if(i==0 && j==0) {
					numMaior = num[i][j];
				}
				if(numMaior<num[i][j]) {
					numMaior = num[i][j];
				}
				res[i][j] = num[i][j] * numMaior;

			}
		}//fecha for i

		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {

				System.out.println("Resultado - Matriz["+(i+1)+", "+(1+j)+"]= "+res[i][j]);
			}

		}
		System.out.println("O Número Maior foi: "+numMaior);
		e.close();	
	}

}
