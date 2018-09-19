package br.com.fiap.exercicio16;

import java.util.Scanner;

public class Dias_Vividos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Varáveis
		int diaNasc=0, mesNasc=0, anoNasc=0;
		int diaAtual=0, mesAtual=0, anoAtual=0;
		int diasNasc=0, diasAtuais=0;
		double conta=0, contaAno=0, contaMes=0;
		
		//Constantes
		int MES=30, ANO=365;
		
		//Entradas
		System.out.println("Digite o Dia de Nascimento: ");
		diaNasc = entrada.nextInt();
		
		System.out.println("Digite o Mês de Nascimento: ");
		mesNasc = entrada.nextInt();
		
		System.out.println("Digite o Ano de Nascimento: ");
		anoNasc = entrada.nextInt();
		
		System.out.println("Digite o Dia Atual: ");
		diaAtual = entrada.nextInt();
		
		System.out.println("Digite o Mês Atual: ");
		mesAtual = entrada.nextInt();
		
		System.out.println("Digite o Ano Atual: ");
		anoAtual = entrada.nextInt();
		
		//Processamento
		mesNasc = mesNasc*MES;
		anoNasc = anoNasc*ANO;
		mesAtual = mesAtual*MES;
		anoAtual = anoAtual*ANO;
		diasNasc = diaNasc + mesNasc + anoNasc;
		diasAtuais = diaAtual + mesAtual + anoAtual;
		conta = diasAtuais - diasNasc;
		contaAno = conta/ANO;
		contaMes = conta/MES;
		
		//Saidas
		System.out.println("Você viveu: "+conta+" dias.");
		System.out.println("Você viveu: "+contaMes+" meses.");
		System.out.println("Ou seja você viveu: "+contaAno+" anos.");
		
	}

}
