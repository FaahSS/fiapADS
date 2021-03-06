package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		double estoque[][] = new double[5][3];
		int qtd[] = new int[4];
		int qtdProduto[] = new int[3];
		double numMenor =0, numMaior=0;
		double custoTotalProduto=0, custoTotalArmazem=0;
		int indiceMenor=0, indiceMaior=0;


		for(int i=0;i<4;i++) {
			System.out.println("--- Estoque no Armaz�m ( "+(i+1)+" )---");
			for(int j=0;j<3;j++) {

				System.out.print("--- Informe a quantidade em estoque do Produto ( "+(j+1)+" ): ");
				estoque[i][j] = e.nextDouble();
			}
		}

		System.out.println("-------------- CUSTO DE CADA PRODUTO --------------");
		for(int j=0;j<3;j++) {
			System.out.print("--- Informe o custo do Produto ( "+(j+1)+" ): ");
			estoque[4][j] = e.nextDouble();

		}

		System.out.println("-------------- QUANTIDADE DE ITENS EM CADA ARMAZ�M --------------");

		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				qtd[i] += estoque[i][j];	
			}
			System.out.println("--- Estoque no armaz�m ( "+(i+1)+" ): "+ qtd[i]);
		}
		System.out.println("-------------- ARMAZEM COM MAIOR ESTOQUE DO PRODUTO 2 --------------");
		for(int i=0;i<4;i++) {
			if(numMaior==0) {
				numMaior = estoque[0][1];
				indiceMaior = 0;
			}
			if(estoque[i][1]>numMaior) {
				numMaior = estoque[i][1];
				indiceMaior = i+1;
			}
		}
		System.out.println("--- Armaz�m ( "+indiceMaior+" ) - Quantidade em estoque: "+numMaior);

		System.out.println("-------------- ARMAZEM COM MENOR ESTOQUE --------------");
		for(int i=0;i<4;i++) {
			for( int j=0;j<3;j++) {
				if(numMenor==0) {
					numMenor = estoque[0][0];
					indiceMenor = 0;
				}
				if(estoque[i][1]<numMenor) {
					numMenor = estoque[i][j];
					indiceMenor = i+1;
				}
			}
		}
		System.out.println("--- Armaz�m ( "+indiceMenor+" ) - Quantidade em estoque: "+numMenor);

		//Sa�da de Dados - Qual o custo total de cada produto
		System.out.println("");
		System.out.println("---------- CUSTO TOTAL DE CADA PRODUTO -----------");
		System.out.println();
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				qtdProduto[i] += estoque[j][i];
			}
			custoTotalProduto = qtdProduto[i] * estoque[4][i];
			System.out.println("Custo total do produto ( "+(i+1)+" ): "+custoTotalProduto);
		}
		
		System.out.println("");
		System.out.println("---------- CUSTO TOTAL DE CADA ARM�ZEM -----------");
		for(int i=0;i<4;i++) {
			custoTotalArmazem=0;
			for(int j=0;j<3;j++) {
				custoTotalArmazem += estoque[i][j] * estoque[4][j];
			}
			System.out.println("Custo total no armaz�m ( "+(i+1)+" ): "	+ custoTotalArmazem);
		}
		e.close();

	}
}
