package br.com.fiap.exercicio12;

import java.util.Scanner;

public class Locacao_DVD_DoWhile {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		//Vari�veis
				String resp="Sim", resp2="Sim";
				int cdCliente=0, cdDvd=0, contDvd=0, contLoc=0, cMaior=0, cMenor=0;
				char tipoDvd=' ';
				double vlLocacao=0, vlFinal=0, total=0, nmMaior=0, nmMenor=0;
				
		do {
			contLoc++;
			System.out.println("Informe o C�digo do Cliente: ");
			cdCliente = e.nextInt();
			do {
				System.out.println(contLoc+"� Loca��o");
				System.out.println();
				

				System.out.println("Informe o C�digo do DvD: ");
				cdDvd = e.nextInt();
				do {
						System.out.println("Informa��o Incorreta. Digite um n�mero de 01 at� 20.");
						cdDvd = e.nextInt();
				}while(cdDvd<1 || cdDvd>20);
				
				System.out.println("A - A��o");
				System.out.println("C - Com�dia");
				System.out.println("D - Drama");
				System.out.println("Informe o Tipo do DvD: ");
				tipoDvd = e.next().toUpperCase().charAt(0);
				do {
					System.out.println("Tipo Inv�lido, por favor re-digite: ");
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
				
				System.out.println("Deseja Efetuar uma nova Loca��o?");
				resp = e.next();
			} while(resp.equalsIgnoreCase("Sim"));
			System.out.println("N�mero de Loca��es Realizadas: "+contLoc);
			if (contDvd>=4) {
				System.out.println("Valor Total das Loca��es: "+total);
				vlFinal = total - (total*0.05);
				System.out.println("Valor Total com Desconto de 5%: "+vlFinal);
			} else {
				vlFinal = total;
				System.out.println("Valor Total das Loca��es: "+vlFinal);
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
			System.out.println("C�digo do Cliente: "+cMaior +" Maior Loca��o: "+nmMaior);
			System.out.println("C�digo do Cliente: "+cMenor +" Menor Loca��o: "+nmMenor);
			System.out.println();	
			
			contDvd=0;
			total=0;
			vlFinal=0;
			System.out.println("Deseja Registrar uma Nova Loca��o?");
			resp2=e.next();
			
		}while(resp2.equalsIgnoreCase("Sim"));
		e.close();
	}

}
