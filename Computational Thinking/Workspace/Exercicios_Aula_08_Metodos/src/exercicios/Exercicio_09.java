package exercicios;

import java.util.Scanner;

public class Exercicio_09 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] arrayProdutos = new String[] {"Notebook", "Computadores", "Tablets", "Servidores"};
		int[] metaVenda = new int[4];
		System.out.println("Controle Empresa Dell");
		System.out.println("");
		System.out.println("Metas de Vendas");
		
		for (int i =0;i<metaVenda.length;i++) {
			System.out.println("Digite a meta de venda do " + arrayProdutos[i] +": ");
			metaVenda[i] = e.nextInt();
		}
		
		//CHAMADA DOS MÉTODOS
		//A)
		int[][] vendas = preencherVendas(arrayProdutos);
		
		//B)
		int[] totLinhas = calcularLinha(vendas);
		System.out.println("");
		System.out.println("\n----- Relatório de Vendas Linha -----------");
		for(int i=0;i<4;i++) {
			System.out.println("Linha "+ arrayProdutos[i] + " vendeu: "+totLinhas[i]);
		}
		
		//C)
		int[] totTrimestre = calcularTrimestre(vendas);
		System.out.println("");
		System.out.println("\n----- Relatório de Vendas Trimestral------------");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"º TRI vendeu: "+totTrimestre[i]);
		}
		
		//D)
		System.out.println("");
		System.out.println("\n----- Metas de Vendas --------------");
		for(int i=0;i<4;i++) {
			System.out.println("Produto "+ arrayProdutos[i] + " " + verificarMeta(totLinhas, metaVenda)[i]);
		}
		
		//E)
		ordenar(totLinhas, arrayProdutos);
		// Exibe o vetor ordenado
		System.out.println("");
		System.out.println("\n----- Ranking 2017 --------------");
				for(int i=0;i<4;i++) {
					System.out.println((i+1)+"º Produto mais vendido: "+ arrayProdutos[i] + " com "+totLinhas[i]+" Unidades Vendidas!");
				}
	}
	
	//MÉTODOS
	
	//A - FUNÇÃO
	public static int[][] preencherVendas(String[] arrayProdutos){
		int vendas[][] = new int[4][4];
		
		for(int i =0;i<4;i++) {
			System.out.println("--- Trimestre "+(i+1));
			
			for(int j=0;j<4;j++) {
				System.out.println("Digite o valor da venda do " + arrayProdutos[j] +": ");
				vendas[j][i] = e.nextInt();
			}
			System.out.println("");
		}
		return vendas;
	}
	
	//B - FUNÇÃO
	public static int[] calcularLinha(int vendas[][]) {
		int [] linha = new int[4];
		for(int i=0;i<linha.length;i++) {
			for(int j=0;j<4;j++) {
				linha[i] += vendas[i][j];
			}
		}
		return linha;
	}
	
	//C
	public static int[] calcularTrimestre(int vendas[][]) {
		int [] trimestre = new int[4];
		
		for(int i=0;i<trimestre.length;i++) {
			for(int j=0;j<4;j++) {
				trimestre[i]+=vendas[j][i];
			}
		}
		return trimestre;
	}
	
	//D
	public static String[] verificarMeta(int totLinhas[], int metaVenda[]) {
		String[] meta = new String[4];
		
		for(int i=0;i<meta.length;i++) {
			if(totLinhas[i]>= metaVenda[i]) {
				meta[i] = "Atingiu a meta!";
			} else {
				meta[i] = "Não atingiu a meta!";
			}
		}
		return meta;
	}
	
	//E
	public static void ordenar(int totLinhas[], String arrayProduto[]) {
		int auxL =0;
		String auxP= null;
		
		for(int vetor=0;vetor<4;vetor++) {
			for (int comp=0;comp<3;comp++){
				if(totLinhas[comp] < totLinhas[comp+1]) {
					auxL = totLinhas[comp];
					auxP = arrayProduto[comp];
					
					totLinhas[comp] = totLinhas[comp+1];
					arrayProduto[comp] = arrayProduto[comp+1];
					
					totLinhas[comp+1] = auxL;
					arrayProduto[comp+1] = auxP;
				}
			}
		}
	}

}
