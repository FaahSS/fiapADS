package br.com.fiap.exercicio12;

import java.util.Scanner;

public class Locacao_DVD_DoWhile {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Variáveis
				String resp="Sim", resp2="Sim";
				int cdCliente=0, cdDvd=0, contDvd=0, contLoc=0, cMaior=0, cMenor=0;
				char tipoDvd=' ';
				double vlLocacao=0, vlFinal=0, total=0, nmMaior=0, nmMenor=0;
				
		do {
			contLoc++;
			System.out.println("Informe o Código do Cliente: ");
			cdCliente = e.nextInt();
			do {
				System.out.println(contLoc+"ª Locação");
				System.out.println();
				

				System.out.println("Informe o Código do DvD: ");
				cdDvd = e.nextInt();
				do {
						System.out.println("Informação Incorreta. Digite um número de 01 até 20.");
						cdDvd = e.nextInt();
				}while(cdDvd<1 || cdDvd>20);
				
				System.out.println("A - Ação");
				System.out.println("C - Comédia");
				System.out.println("D - Drama");
				System.out.println("Informe o Tipo do DvD: ");
				tipoDvd = e.next().toUpperCase().charAt(0);
				do {
					System.out.println("Tipo Inválido, por favor re-digite: ");
					tipoDvd = e.next().toUpperCase().charAt(0);
				}while(tipoDvd!='A' && tipoDvd!='C' && tipoDvd!='D');
				if(cdDvd<=10) {
					if(tipoDvd=='A') {
						vlLocacao=8;
					} else if (tipoDvd=='C') {
						vlLocacao=12;
					} else {
						vlLocacao=10;
					}
				} else if (cdDvd<=20) {
					if(tipoDvd=='A') {
						vlLocacao=5;
					} else if (tipoDvd=='C') {
						vlLocacao=7;
					} else {
						vlLocacao=9;
					}
				}
				total+=vlLocacao;
				contDvd++;
				
				System.out.println("Deseja Efetuar uma nova Locação?");
				resp = e.next();
			} while(resp.equalsIgnoreCase("Sim"));
			System.out.println("Número de Locações Realizadas: "+contLoc);
			if (contDvd>=4) {
				System.out.println("Valor Total das Locações: "+total);
				vlFinal = total - (total*0.05);
				System.out.println("Valor Total com Desconto de 5%: "+vlFinal);
			} else {
				vlFinal = total;
				System.out.println("Valor Total das Locações: "+vlFinal);
			}
			if(nmMaior==0 && nmMenor==0 && cMenor ==0 && cMaior ==0) {
				nmMaior = vlFinal;
				nmMenor = vlFinal;
				cMaior = cdCliente;
				cMenor = cdCliente;
			}
			if(vlFinal>nmMaior) {
				nmMaior = vlFinal;
				cMaior = cdCliente;
			}
			if(vlFinal<nmMenor) {
				nmMenor = vlFinal;
				cMenor = cdCliente;
			}
			System.out.println("Código do Cliente: "+cMaior +" Maior Locação: "+nmMaior);
			System.out.println("Código do Cliente: "+cMenor +" Menor Locação: "+nmMenor);
			System.out.println();	
			
			contDvd=0;
			total=0;
			vlFinal=0;
			System.out.println("Deseja Registrar uma Nova Locação?");
			resp2=e.next();
			
		}while(resp2.equalsIgnoreCase("Sim"));
		e.close();
	}

}
