package br.com.fiap.exercicio10;

import java.util.Scanner;

public class Sistema_Caixa {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		String resp="sim";
		double pe=0, total=0, desconto=0, juros=0, vlFinal=0;
		int cp=0;
		int cont=1, contItem=0;
		
		//1ª REPETIÇÃO GERENCIA COMPRA
		while(resp.equalsIgnoreCase("Sim")) {
			System.out.println(cont+"ª Compra");
			System.out.println();
			
			System.out.println("Digite PE: ");
			pe = e.nextDouble();
			//2ª REPETIÇÃO GERENCIA ITENS
			while(pe!=0) {
				total+=pe; //total=total+pe
				contItem++;
				
				System.out.println("Digite PE: ");
				pe = e.nextDouble();
			}//Fim 2ª Repetição
			System.out.println("Valor da Compra: R$"+total);
			System.out.println("Quantidade de Itens: "+contItem);
			System.out.println();
			
			
			System.out.println("1 - À vista em Dinheiro ou Cheque, com 10% de desconto.");
			System.out.println("2 - À vista com Cartão de Crédito, com 5% de desconto.");
			System.out.println("3 - Em 2 vezes, preço normal de etiqueta sem juros.");
			System.out.println("4 - Em 3 vezes, preço de etiqueta com acréscimo de 10%.");
			System.out.println("Qual a Forma de Pagamento: ");
			cp = e.nextInt();
			//3ª REPETIÇÃO GERENCIA FORMA PAGAMENTO
			while(cp<1 || cp>4) {
				System.out.println("Digite corretamente:");
				cp=e.nextInt();
			}
			//ESTRUTURA DE SELEÇÃO
		
			if (cp==1) {
				desconto =0.1;
				vlFinal=total-(total*desconto);
				System.out.println("Valor Total: R$"+total);
				System.out.println("Valor Total com desconto de 10%: R$"+vlFinal);
			} else if (cp==2) {
				desconto =0.05;
				vlFinal=total-(total*desconto);
				System.out.println("Valor Total: R$"+total);
				System.out.println("Valor Total com desconto de 5%: R$"+vlFinal);
			} else if (cp==3) {
				juros=0;
				vlFinal = total/2;
				System.out.println("Valor Total: R$"+total);
				System.out.println("Valor Total Parcelado em 2 Vezes: R$"+vlFinal);
			} else if (cp==4) {
				juros=0.1;
				System.out.println("Valor Total sem Juros: R$"+total);
				total=total+(total*juros);
				System.out.println("Valor Total com 10% de Juros: R$"+total);
				vlFinal=total/3;
				
				System.out.println("Valor Total Parcelado em 3 Vezes com 10% de Juros: R$"+vlFinal);
			} 
			
			contItem=0;
			total=0;
			cont++;
			System.out.println("Deseja Continuar? ");
			resp=e.next();
		}
		
	
	}

}
