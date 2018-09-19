package br.com.fiap.exemplos;

import java.util.Scanner;

public class Exemplo_2 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int somaLinha=0, totalGeral=0, somaColuna=0;
		int arrayNumeros[][] = new int [4][4];

		//CARREGAR MATRIZ
		for(int i =0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Digite o valor Linha ["+i+"]- Coluna ["+j+"]:");
				arrayNumeros[i][j] = e.nextInt();
			}
		}

		//EXIBIR MATRIZ
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				somaLinha += arrayNumeros[i][j];
				somaColuna += arrayNumeros[j][i];
			}
			totalGeral += somaLinha;

			System.out.println("A Soma da Linha ["+i+"] é: "+somaLinha);
			System.out.println("A Soma da Coluna ["+i+"] é: "+somaColuna);

			somaLinha=0;
			somaColuna=0;
		}

		System.out.println("");
		System.out.println("Total Geral:"+totalGeral);

		e.close();
	}

}
