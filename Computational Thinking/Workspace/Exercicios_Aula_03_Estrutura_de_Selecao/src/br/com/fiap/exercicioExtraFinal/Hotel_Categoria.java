package br.com.fiap.exercicioExtraFinal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel_Categoria {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("#,##0.00");

		//Variáveis
		String nome="", categoria="", msg="";
		int opcao=0, nrDiarias=0;
		double diaria=0, vlDiaria=0, imposto=0, vlEstadia=0,
				txServico=0, vlTotal=0, vlTaxa=0, desconto=0,
				vlImposto=0, vlDesc=0, vlFinal=0;

		//Entradas
		System.out.println("Digite o nome do Hóspede: ");
		nome = entrada.next() + entrada.nextLine();
		System.out.println("\n");

		System.out.println("----- CATEGORIAS -----");
		System.out.println("SU - Superior");
		System.out.println("LX - Luxo");
		System.out.println("LP - Luxo Premier");
		System.out.println("SE - Suite");
		System.out.println("\n");

		System.out.println("Digite a Categoria Desejada: ");
		categoria = entrada.next();
		System.out.println("\n");

		System.out.println("----- OPÇÃO -----");
		System.out.println("1 - Individual");
		System.out.println("2 - Casal");
		System.out.println("Digite a Opção Desejada: ");
		opcao = entrada.nextInt();
		System.out.println("\n");

		System.out.println("Digite o número de diárias: ");
		nrDiarias = entrada.nextInt();

		//Processamento
		switch (categoria) {
		case "SU":
			if (opcao==1) {
				diaria=650;
				vlImposto=0.1;
			} else {
				diaria = 780;
				vlImposto=0.1;
			}
			if(nrDiarias<5) {
				vlTaxa=20;
			} else {
				vlTaxa=22.5;
			}
			break;
		case "LX":
			if(opcao==1) {
				diaria=580;
				vlImposto=0.15;
			}else {
				diaria=790;
				vlImposto=0.15;
			}
			if(nrDiarias<6) {
				vlTaxa=24.5;
			}else {
				vlTaxa=22.5;
			}
			break;
		case "LP":
			if(opcao==1) {
				diaria=920;
				vlImposto=0.18;
			}else {
				diaria=1080;
				vlImposto=0.18;
			}
			if(nrDiarias<5) {
				vlTaxa=26.5;
			}else {
				vlTaxa=23.5;
			}
			break;
		case "SE":
			if(opcao==1 || opcao==2) {
				diaria=1220;
				vlImposto=0.2;
			}
			if(nrDiarias <7) {
				vlTaxa=28.5;
			}else {
				vlTaxa=27.5;
			}
		}
		vlDiaria = diaria*nrDiarias;
		imposto=vlDiaria*vlImposto;
		vlEstadia = vlDiaria+imposto;
		txServico=nrDiarias*vlTaxa;
		vlTotal=vlEstadia+txServico;
		
		//Processamento - Desconto
		if (nrDiarias<5) {
			vlDesc=0;
			desconto=vlDesc;
		}else
			if(nrDiarias<=7) {
				vlDesc=0.07;
				desconto=vlTotal*vlDesc;
			}else {
				vlDesc=0.1;
				desconto=vlTotal*vlDesc;
			}
		vlFinal=vlTotal-desconto;
		
		//Processamento - Promoção
		if (categoria.equalsIgnoreCase("LX") || categoria.equalsIgnoreCase("LP") || nrDiarias>8){
			msg = "Na próxima hospedagem, você tem uma diária gratuíta!";
		}
		
		//Saidas
		System.out.println("---------- DADOS HOSPEDAGEM ----------");
		System.out.println("Nome do Hóspede: "+nome);
		System.out.println("Categoria: "+categoria+" Opção: "+opcao);
		System.out.println("Número de Diárias: "+nrDiarias);
		System.out.println();
		System.out.println("Valor da Diária: "+moeda.format(diaria)+" - Valor Estadia: "+moeda.format(vlDiaria));
		System.out.println("Imposto: "+vlImposto+" - Valor do Imposto: "+moeda.format(imposto));
		System.out.println("Valor Taxa de Serviço: "+vlTaxa+" - Total Taxa de Serviço: "+txServico);
		System.out.println("Valor Total: "+moeda.format(vlTotal));
		System.out.println("Desconto: "+vlDesc+" - Valor do Desconto: "+moeda.format(desconto));
		System.out.println("Valor Final: "+moeda.format(vlFinal));
		if (categoria.equalsIgnoreCase("LX") || categoria.equalsIgnoreCase("LP") || nrDiarias>8){
			System.out.println("Aviso: "+msg);
		}
	}


}


