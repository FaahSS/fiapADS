package nac;

import java.text.DecimalFormat;
import java.util.Scanner;

//Modelo B
public class Exercicio {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat p = new DecimalFormat("###0.00");

		int estoque[][] = new int[5][4];
		String modelos[] = new String[] {"Classic", "Cobalt", "Onix", "Prisma"};
		double custoModelo[] = new double[] {33600,44900,37790,43150};
		String concessionaria[] = new String[] {"Santo André", "Mauá", "Guarulhos", "Aricanduva", "Ipiranga"};

		double custo =0;

		int menorEstoque =0;
		int menorEstoqueGeral=0;
		int maiorEstoqueGeral =0;
		int totalEstoqueG =0;
		int soma[] = new int[5];
		int somaA[]= new int[5];
		String menorModelo ="";
		String menorConc="";
		String menorConcG="";
		String maiorConcG="";

		for (int i=0;i<5;i++) {
			System.out.println("Concessionária "+concessionaria[i]);
			for (int j=0;j<4;j++) {
				System.out.println("--- Quantidade vendida modelo "+modelos[j]+":" );
				estoque[i][j] = e.nextInt();
			}
		}
		//A)
		for(int i=0;i<5;i++) {
			custo=0;
			for(int j=0;j<4;j++) {
				custo+=estoque[i][j]*custoModelo[j];
			}
			System.out.println("Custo do Estoque para concessinaria "+concessionaria[i]+": "+custo);
		}

		//B 
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(i==0&j==0) {
					menorEstoque = estoque[i][j];
					menorConc= concessionaria[i];
				}else {
					if(menorEstoque>estoque[i][2]) {
						menorEstoque = estoque[i][2];
						menorModelo = modelos[2];
						menorConc = concessionaria[i];
					}	
				}
			}
		}
		System.out.println("");
		System.out.println("A Concessionária com menor estoque do modelo "+menorModelo+" é: "+menorConc );

		//C
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				soma[i]+=estoque[i][j];
			}

		}
		for(int i=0;i<5;i++)	{

			if(i==0) {
				menorEstoqueGeral = soma[i];
				maiorEstoqueGeral = soma[i];
			}else {
				if(menorEstoqueGeral > soma[i]) {
					menorEstoqueGeral = soma[i];
					menorConcG = concessionaria[i];
				}
				if(maiorEstoqueGeral < soma[i]) {
					maiorEstoqueGeral = soma[i];
					maiorConcG = concessionaria[i];
				}
			}
		}

		System.out.println("");
		System.out.println("Maior Número de Carros em Estoque: "+maiorConcG+" - "+maiorEstoqueGeral+" Carros em Estoque");
		System.out.println("Menor Número de Carros em Estoque: "+menorConcG+" - "+menorEstoqueGeral+" Carros em Estoque");

		//D 
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				totalEstoqueG+=estoque[i][j];
			}
		}
		System.out.println("");
		System.out.println("Total de Carros em Estoque: "+totalEstoqueG);
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				somaA[j]+=estoque[i][j];
			}
		}

		for(int i=0;i<4;i++) {
			
			System.out.println(modelos[i]+" \t"+p.format(((double)somaA[i]/totalEstoqueG)*100)+"%");
		}
	}
}
