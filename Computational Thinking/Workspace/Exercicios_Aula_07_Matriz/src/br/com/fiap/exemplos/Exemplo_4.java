package br.com.fiap.exemplos;

import java.util.Scanner;

public class Exemplo_4 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int num[][] = new int[5][2];
		double val[][] = new double[5][2];
		double totGeral =0;

		for(int i=0;i<num.length;i++) {
			System.out.println("Digite o código");
			num[i][0] = e.nextInt();
			System.out.println("Digite o a quantidade:");
			num[i][1] = e.nextInt();
			System.out.println("Digite o preço do produto:");
			val[i][0] = e.nextDouble();

			val[i][1]+=val[i][0]*num[i][1];
			totGeral+=val[i][1];
			
			
		}
			for(int i=0;i<num.length;i++) {
				System.out.println("");
				System.out.println("Código: "+num[i][0]);
				System.out.println("Quantidade: "+num[i][1]);
				System.out.println("Preço: "+val[i][0]);
				System.out.println("Total: "+val[i][1]);
			}
			System.out.println("");
			System.out.println("Total Geral: "+totGeral);
	}
}
