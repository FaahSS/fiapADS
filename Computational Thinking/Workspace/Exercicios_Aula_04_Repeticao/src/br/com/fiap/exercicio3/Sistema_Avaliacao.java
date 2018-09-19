package br.com.fiap.exercicio3;

import java.util.Scanner;

public class Sistema_Avaliacao {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		double nota1=0, nota2=0, nota3=0, notaFinal=0;
		int aulas=0, nmMatricula=0;
		int contAprov=0, contReprov=0, contReprovF=0;
		String msg;
		
		for(int i=0;i<3;i++) {
			System.out.println("Digite o número de Matricula: ");
			nmMatricula = e.nextInt();
			System.out.println("Informe a Primeira Nota: ");
			nota1 = e.nextDouble();
			System.out.println("Informe a Segunda Nota: ");
			nota2 = e.nextDouble();
			System.out.println("Informe a Terceira Nota: ");
			nota3= e.nextDouble();
			System.out.println("Informe a quantidade de aulas frequentadas: ");
			aulas= e.nextInt();
			
			notaFinal = (nota1+nota2+nota3)/3;
			
			if (notaFinal>=6 && aulas>=40) {
				msg = "Aprovado";
				contAprov++;
			} else {
				msg = "Reprovado";
				contReprov++;
			}
			if (aulas<40) {
				contReprovF++;
			}
			
			System.out.println("Número Matricula: "+nmMatricula+" Média: "+notaFinal+" Situação: "+msg);
			System.out.println();
		}
		System.out.println("Total de Alunos Aprovados: "+contAprov);
		System.out.println("Total de Alunos Reprovados: "+contReprov);
		System.out.println("Total de Alunos Reprovados por Faltas: "+contReprovF);
		
		e.close();
		
	}

}
