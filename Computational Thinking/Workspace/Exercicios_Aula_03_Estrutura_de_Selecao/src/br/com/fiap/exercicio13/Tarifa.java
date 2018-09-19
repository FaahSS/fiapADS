package br.com.fiap.exercicio13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarifa {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("###0.00");

		//Variáveis
		String nomeCliente, classe, opTarifa;
		int qtdDias=0;
		double km=0, tControlada= 0, tLivre=0, precoDesc=0;
		//Entradas
		
		System.out.println("Digite o nome do Cliente: ");
		nomeCliente = entrada.next() + entrada.nextLine();

		System.out.println("A - Econômico");
		System.out.println("F - Intermediário");
		System.out.println("H - Executivo");
		System.out.println("Informe a Classe: ");
		classe = entrada.next(); 


		System.out.println("Informe a Quantidade de Dias: ");
		qtdDias = entrada.nextInt();

		System.out.println("TC - Tarifa Controlada");
		System.out.println("TL - Tarifa Livre");
		System.out.println("Informe a Opção de Tarifa: ");
		opTarifa = entrada.next();
		
		//Processamento
		if (opTarifa.equalsIgnoreCase("TC")) {
			System.out.println("Digite a Quilometragem(KM): ");
			km = entrada.nextDouble();
			switch (classe) {
			case "A":
				tControlada = qtdDias*39.90+km*0.46;
				break;
			case "F":
				tControlada = qtdDias*95.90+km*0.90;
				break;
			case "H":
				tControlada = qtdDias*157.90+km*1.50;
				break;
			}
		} else 
			if (opTarifa.equalsIgnoreCase("TL")) {
				switch (classe) {
				case "A":
					tLivre = 99.90*qtdDias;
					break;
				case "F":
					tLivre = 178.90*qtdDias;
					break;
				case "H":
					tLivre = 294*qtdDias;
					break;
				}

			} else {
				System.out.println("Você não escolheu uma opção válida. Por favor refaça a operação.");
				System.exit(1);
			}

		//Saidas
		System.out.println("Nome do Cliente: "+nomeCliente);
		System.out.println("Classe Escolhida: "+classe);
		System.out.println("Quantidade de Dias: "+qtdDias);
		System.out.println("Opção de Tarifa escolhida: "+opTarifa);
		if (opTarifa.equalsIgnoreCase("TC")) {
			if (classe.equalsIgnoreCase("A") && qtdDias>10) {
				precoDesc = tControlada - (tControlada*0.05);
				System.out.println("Preço Final: "+ decimal.format(tControlada));
				System.out.println("Preço Final com desconto de 5% (TC): R$"+ decimal.format(precoDesc));
			} else
				if(classe.equalsIgnoreCase("F") && qtdDias>7){
					precoDesc = tControlada -(tControlada*0.07);
					System.out.println("Preço Final: "+ decimal.format(tControlada));
					System.out.println("Preço Final com desconto de 7% (TC): R$"+ decimal.format(precoDesc));
				}else
					if(classe.equalsIgnoreCase("H") && qtdDias>5) {
						precoDesc = tControlada-(tControlada*0.1);
						System.out.println("Preço Final: "+ decimal.format(tControlada));
						System.out.println("Preço Final com desconto de 10% (TC): R$"+ decimal.format(precoDesc));
					} else {
						System.out.println("Preço Final (TC): R$"+ decimal.format(tControlada));
					}
		}else 
			if (opTarifa.equalsIgnoreCase("TL")) {
				if (classe.equalsIgnoreCase("A") && qtdDias>10) {
					precoDesc = tLivre - (tLivre*0.05);
					System.out.println("Preço Final: R$"+ decimal.format(tLivre));
					System.out.println("Preço Final com desconto de 5% (TL): R$"+ decimal.format(precoDesc));
				} else
					if(classe.equalsIgnoreCase("F")&& qtdDias>7) {
						precoDesc = tLivre - (tLivre*0.07);
						System.out.println("Preço Final: "+ decimal.format(tLivre));
						System.out.println("Preço Final com desconto de 7% (TL): R$"+ decimal.format(precoDesc));
					} else
						if (classe.equalsIgnoreCase("H") && qtdDias>10) {
							precoDesc = tLivre - (tLivre*0.1);
							System.out.println("Preço Final: R$"+ decimal.format(tLivre));
							System.out.println("Preço Final com desconto de 10% (TL): R$"+ decimal.format(precoDesc));
						} else {
							System.out.println("Preço Final (TL): R$"+ decimal.format(tLivre));
						}


			}


	}
}

