package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_8 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String lojas[] = new String[] {"lojaA", "lojaB", "lojaC"};
		String prods[] = new String[] {"prod1", "prod2", "prod3"};
		
		int[][] vendas1 = new int[3][3];
		int[][] vendas2 = new int[3][3];
		int[][] bimestre = new int[3][4];
		
		int meta[] = new int[3];
		int matrizBimestre[][] = new int[3][4];
		
		for(int i=0;i<3;i++) {
			System.out.print("Digite a meta de vendas para o prod"+i+":");
			meta[i]=e.nextInt();
		}
		System.out.println("");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Produto: prod"+i+" \t Loja: loja"+j);
			}
		}
	}

}
