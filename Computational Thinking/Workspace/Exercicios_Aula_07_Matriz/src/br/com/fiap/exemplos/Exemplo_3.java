package br.com.fiap.exemplos;

import java.util.Scanner;

public class Exemplo_3 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		double arrayNotas[][] = new double[10][4];
		double somaNota = 0;

		for(int i=0;i<10;i++) {
			//for(int i=0;i<arrayNotas.length;i++) {
			System.out.println("Aluno 0"+(i+1));

			for(int j=0;j<3;j++) {
				//for(int j=0;j<arrayNotas.length-1;j++) {
				System.out.println("Nota Prova "+(j+1)+":");
				arrayNotas[i][j] = e.nextDouble();
				
				somaNota+=arrayNotas[i][j];
			}//fecha for notas
			
			arrayNotas[i][3]=somaNota/3;
			somaNota =0;
			
		
		}//fecha alunos
		System.out.println();
		System.out.println("Relatório de Notas");
		for(int i=0;i<arrayNotas.length;i++){
			System.out.println("Aluno "+(i+1)+" - Média: "+arrayNotas[i][3]);
		}
		//somaNota=+arrayNotas[i][j];
	}
}


