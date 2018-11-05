package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_08 {
	static int[] arrayQuant = new int[5];
	static Scanner e = new Scanner(System.in);
	static DecimalFormat p = new DecimalFormat("R$ #,##0.00");
	
	public static void main(String[] args) {
		String arrayCarro[] = new String[] {"Classic", "Cobalt", "Onix", "Prisma", "Cruze"};
		double arrayPreco[] = new double[] {33600, 44900, 37790, 43150, 55400};
		
		//Exercicio A
		int[][] qtdVendida = exercicioA(arrayCarro);
		
		//Exercicio C
		relatorioGeral (arrayCarro, arrayPreco, qtdVendida);
	}
	
	//Exercicio A
	public static int[][] exercicioA(String[] arrayCarro){
		int[][] qtdVendida = new int[4][5];
		
		System.out.println("CONTROLE DE VENDAS VIGORITO 2015");
		for(int i=0;i<4;i++) {
			System.out.println("Vendas "+(i+1)+"º TRI");
			for(int j=0;j<5;j++) {
				System.out.println("Carro: "+ arrayCarro[j]+": ");
				qtdVendida[i][j] = e.nextInt();
			}
			System.out.println();
		}
		return qtdVendida;
	}
	
	//Exercicio B
	public static double[] exercicioB(int[][] qtdVendida, double[] arrayPreco) {
		
		double[] totVendas = new double[5];
		
		for (int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				arrayQuant[j] += qtdVendida[i][j];
			}
		}
		for(int i=0;i<5;i++) {
			totVendas[i] = arrayQuant[i] * arrayPreco[i];
		}
		return totVendas;
	}
	
	//Exercicio C
	public static void relatorioGeral (String[] arrayCarro, double[] arrayPreco, int[][] qtdVendida) {
		double totGeral =0;
		
		//chamada método B
		double [] totVendas = exercicioB(qtdVendida, arrayPreco);
		
		for(int i=0; i<5;i++) {
			System.out.println("Carro: " + arrayCarro[i] + "\t Quantidade Geral: " + arrayQuant[i] + "\t Total: " + p.format(totVendas[i]));
			totGeral += totVendas[i];
		}
		System.out.println("Total Geral de Vendas 2015: " + p.format(totGeral));
	}

}
