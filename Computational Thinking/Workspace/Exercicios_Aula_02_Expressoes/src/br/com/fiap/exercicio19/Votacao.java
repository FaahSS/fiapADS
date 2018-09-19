package br.com.fiap.exercicio19;

import java.util.Scanner;

public class Votacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		
		int totalVotos=0, votosA=0, votosB=0, votosC=0, votoNulo=0, votoBranco=0, validos=0;
		String a, b, c;
		
		//Entradas
		System.out.println("Digite a Quantidade de Votos do Candidato A: ");
		votosA = entrada.nextInt();
		
		System.out.println("Digite a Quantidade de Votos do Candidato B: ");
		votosB = entrada.nextInt();
		
		System.out.println("Digite a Quantidade de Votos do Candidato C: ");
		votosC = entrada.nextInt();
		
		System.out.println("Digite a Quantidade de Votos Nulo: ");
		votoNulo = entrada.nextInt();
		
		System.out.println("Digite a Quantidade de Votos em Branco: ");
		votoBranco = entrada.nextInt();
		
		//Processamento
		totalVotos = votosA+votosB+votosC+votoNulo+votoBranco;
		validos = votosA+votosB+votosC;
		
		//Saidas
		System.out.println("Número total de eleitores: "+totalVotos);
		System.out.println("Percentual de Votos Válidos: " + (double)validos/totalVotos*100 + "%");
		System.out.println("Percentual de votos Candidato A: "+(double)votosA/totalVotos*100+"%");
		System.out.println("Percentual de votos Candidato B: "+(double)votosB/totalVotos*100+"%");
		System.out.println("Percentual de votos Candidato C: "+(double)votosC/totalVotos*100+"%");
		System.out.println("Percentual de votos em Branco: "+(double)votoBranco/totalVotos*100+"%");
		System.out.println("Percentual de votos Nulo: "+(double)votoNulo/totalVotos*100+"%");
	}

}
