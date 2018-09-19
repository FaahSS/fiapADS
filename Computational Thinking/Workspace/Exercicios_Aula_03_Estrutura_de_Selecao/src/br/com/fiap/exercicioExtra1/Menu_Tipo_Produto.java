package br.com.fiap.exercicioExtra1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu_Tipo_Produto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("###0.00");  

		//Variáveis
		String produto="", classe="", tipo="";
		double preco=0, imposto=0, valor=0, desconto=0, valorDesc=0,
				descontoPag=0, valorTotal=0;
		double descNumI=0, descNumP=0;
		int formaPag=0;

		//Entradas
		System.out.println("Digite o Nome do Produto: ");
		produto = entrada.next() + entrada.nextLine();
		System.out.println("Digite o Valor do Produto: ");
		preco = entrada.nextDouble();
		System.out.println("Classe I ou Classe N");
		System.out.println("Digite a classe do Produto: ");
		classe = entrada.next();
		if (classe.equalsIgnoreCase("I")) {
			System.out.println("P - Perfume");
			System.out.println("I - Informatica");
			System.out.println("V - Vestuário");
			System.out.println("Digite o Tipo do Produto: ");
			tipo = entrada.next();
		} else 
			if(classe.equalsIgnoreCase("N")){
				tipo="I";
			} else {
				System.out.println("Classe não existente refaça a operação.");
				System.exit(1);
			}
		System.out.println("1 - À vista em dinheiro ou cheque. (recebe 8% de desconto)");
		System.out.println("2 - À vista no cartão de crédito. (recebe 5% de desconto)");
		System.out.println("Escolha a Forma de Pagamento: ");
		formaPag = entrada.nextInt();
		if (formaPag < 1 || formaPag >2) {
			System.out.println("Forma de Pagamento Inexistente, Por Favor refaça a operação.");
			System.exit(1);
		}

		//Processamento
		switch (classe) {
		case "I":
			if (tipo.equalsIgnoreCase("P")) {
				if (preco<100) {
					imposto=0;
				}else {
					imposto=0.05*preco;
				}
			}
			if (tipo.equalsIgnoreCase("I")) {
				if (preco<500) {
					imposto=0.1*preco;
				} else {
					imposto=0.2*preco;
				}
			}
			if (tipo.equalsIgnoreCase("V")) {
				if (preco<200) {
					imposto=0.05*preco;
				}else {
					imposto=0.08*preco;
				}
			}
			break;
		case "N":
			if (tipo.equalsIgnoreCase("I")) {
				if(preco<500) {
					imposto=0.12*preco;
				} else {
					imposto=0.2*preco;
				}
			}
			break;
		}

		//Fim do Switch
		valor = imposto+preco;
		if (classe.equalsIgnoreCase("I") && tipo.equalsIgnoreCase("I")) {
			descNumI=0.1;
			desconto=descNumI*valor;
		}else {
			desconto=0;
		}
		valorDesc = valor - desconto;
		//Processamento - Forma de Pagamento
		switch (formaPag) {
		case 1:
			descNumP=0.08;
			descontoPag=descNumP*valorDesc;
			break;
		case 2:
			descNumP=0.05;
			descontoPag=descNumP*valorDesc;
			break;
		}
		valorTotal=valorDesc-descontoPag;
		//Saidas
		System.out.println("O Produto "+produto+" de Classe: "+classe+" e Tipo: "+tipo);
		System.out.println("Valor Total do Produto com imposto: R$"+ moeda.format(valor));
		if (classe.equalsIgnoreCase("I") && tipo.equalsIgnoreCase("I")) {
			System.out.println("O Produto possui "+descNumI*100+"% de desconto referente ao tipo e classe do produto.");
			System.out.println("Desconto recebido pelo tipo e classe: R$" + moeda.format(desconto));
			System.out.println("Valor total do produto com o desconto: R$:"+ moeda.format(valorDesc));
		} else {
			System.out.println("Valor total do produto: R$"+ moeda.format(valorDesc));
		}
		System.out.println("Desconto da Forma de Pagamento: R$"+ moeda.format(descontoPag)+" - "+descNumP*100+"% do Valor Total");
		System.out.println("Valor Final do Produto: R$"+ moeda.format(valorTotal));


	}
}


