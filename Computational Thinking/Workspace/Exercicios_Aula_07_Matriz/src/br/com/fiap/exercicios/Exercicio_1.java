package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int num[][] = new int[4][5];
		int bonus=0;
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Digite o código do "+(i+1)+"º Cliente: ");
			num[i][0] = e.nextInt();
			System.out.println("Digite a quantidade de milhagem: ");
			num[i][1] = e.nextInt();
			System.out.println("1 - Diammante");
			System.out.println("2 - Ouro");
			System.out.println("3 - Prata");
			System.out.println("Digite a Categoria: ");
			num[i][2] = e.nextInt();
			while(num[i][2]<1 || num[i][2]>3) {
				System.out.println("Categoria Inválida, redigite: ");
				num[i][2] = e.nextInt();
			}
			if(num[i][2]==1) {
				bonus=10000;
			} else if(num[i][2]==2) {
				bonus=5000;
			} else {
				bonus=0;
			}
			
			num[i][3] = bonus;
			num[i][4] = num[i][1]+ bonus;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Código do Cliente: "+num[i][0]+"\t"+"Quant. Milhagem: "+num[i][1]+"\t"+"Categoria: "+num[i][2]+"\t"+"Bônus: "+num[i][3]+"\t"+"Milhagem Atual: "+num[i][4]+"\t");
		}
		e.close();
	}

}
