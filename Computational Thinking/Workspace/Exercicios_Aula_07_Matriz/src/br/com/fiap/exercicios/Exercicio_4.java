package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String loja[] = new String[] {"A","B","C","D","E","F","G","H"};
		String produto[] = new String[] {"W","X","Y","Z"};
		double precos[][] = new double[4][8];
		
		System.out.println("---------------------------------------------");
		System.out.println("--------Preços dos Produtos por Loja---------");
		System.out.println("---------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println("--- Produto: "+produto[i]);
			for(int j=0;j<8;j++) {
				System.out.println("Informe o preço do produto "+produto[i]+" na loja "+loja[j]+" :");
				precos[i][j] = e.nextDouble();
			}
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("-----Produtos que custam menos de R$120,00---");
		System.out.println("---------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println("--- Produto: "+produto[i]);
			for(int j=0;j<8;j++) {
				if(precos[i][j]<=120) {
					System.out.println("------ Loja: "+loja[j]+" Preço: R$ "+precos[i][j]);
				}
			}
		}
		
	}

}
