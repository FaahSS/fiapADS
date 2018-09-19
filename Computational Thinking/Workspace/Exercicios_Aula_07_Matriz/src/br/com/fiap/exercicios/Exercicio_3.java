package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		String loja[] = new String[] {"LojaA","LojaB","LojaC","LojaD","LojaE"};
		String produto[] = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L"};
		double matrizPreco[][] = new double [12][5];
		double menorPreco =0, maiorPreco=0;
		String maiorProduto="", menorProduto="", maiorLoja="", menorLoja="";
		
		for (int i=0;i<12;i++) {
			System.out.println("-------- Produto: "+produto[i]+" --------");
			for(int j=0;j<5;j++) {
				System.out.println("Informe o pre�o na loja "+loja[j]);
				matrizPreco[i][j] = e.nextDouble();
				
				if(i==0 & j==0) {
					menorPreco=matrizPreco[i][j];
					menorLoja=loja[j];
					menorProduto=produto[i];
					maiorPreco=matrizPreco[i][j];
					maiorLoja=loja[j];
					maiorProduto=produto[i];
				}else {
				if(maiorPreco<matrizPreco[i][j]) {
					maiorPreco=matrizPreco[i][j];
					maiorLoja=loja[j];
					maiorProduto=produto[i];
				}
				if(menorPreco>matrizPreco[i][j]) {
					menorPreco = matrizPreco[i][j];
					menorLoja=loja[j];
					menorProduto=produto[i];
				}
				}
			}
		}
		
		
		System.out.println("Produto mais Barato: " + menorProduto);
		System.out.println("Loja: "+ menorLoja);
		System.out.println("Pre�o: " + menorPreco);
		System.out.println("");
		System.out.println("Produto mais Caro: " + maiorProduto);
		System.out.println("Loja: "+ maiorLoja);
		System.out.println("Pre�o: "+maiorPreco);
	}

}
