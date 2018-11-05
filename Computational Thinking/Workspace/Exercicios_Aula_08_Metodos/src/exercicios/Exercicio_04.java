package exercicios;

import java.util.Scanner;

public class Exercicio_04 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arrayChamado[][] = chamados();
		
		verificarChamado(arrayChamado);
		verificarCriterio(arrayChamado);
		
	}
	
	//Funções
	public static int[][] chamados(){
		int arrayChamado[][] = new int[5][3];
		System.out.println("-------- Abertura do Chamado --------");
		for(int i=0;i<5;i++) {
			System.out.println("Digite a Identificação do Funcionário: ");
			arrayChamado[i][0] = e.nextInt();
			System.out.println("\n[1] ------ Sistema não inicia");
			System.out.println("[2] ------ Nome ou caminho do banco de dados não encontrado");
			System.out.println("[3] ------ Sistema não responde");
			System.out.println("Digite o código de erro do Sistema: ");
			arrayChamado[i][1]= e.nextInt();
			while(arrayChamado[i][1]<1 || arrayChamado[i][1]>3) {
				System.out.println("Informe um Erro Válido: ");
				arrayChamado[i][1]= e.nextInt();
			}
			System.out.println("\n[1] ------ Sistema parado");
			System.out.println("[2] ------ Grave");
			System.out.println("[3] ------ Não Grave");
			System.out.println("[4] ------ Dúvida");
			System.out.println("Digite o critério do chamado: ");
			arrayChamado[i][2] = e.nextInt();
			while(arrayChamado[i][2]<1 || arrayChamado[i][2]>4) {
				System.out.println("Informe um Critério Válido: ");
				arrayChamado[i][2]=e.nextInt();
			}
		}
		return arrayChamado;
	}
	
	//Procedimentos
	public static void verificarChamado(int arrayControleChamado[][]) {
		 int contErro1=0, contErro2=0, contErro3=0;
		 
		 for(int i=0;i<5;i++) {
			 if(arrayControleChamado[i][1]==1) {
				 contErro1++;
			 }else if(arrayControleChamado[i][1]==2) {
				 contErro2++;
			 }else {
				 contErro3++;
			 }
		 }
		 
		 System.out.println("--------------- RELATÓRIO DE CHAMADOS POR ERRO ---------------");
		 System.out.println("Números de chamados com Código do Erro 1: "+contErro1);
		 System.out.println("Números de chamados com Código do Erro 2: "+contErro2);
		 System.out.println("Números de chamados com Código do Erro 3: "+contErro3);
	}
	
	public static void verificarCriterio(int arrayControleChamado[][]) {
		int contCr1=0, contCr2=0, contCr3=0, contCr4=0;
		
		for(int i=0;i<5;i++) {
			if(arrayControleChamado[i][2]==1) {
				contCr1++;
			}else if(arrayControleChamado[i][2]==2) {
				contCr2++;
			}else if(arrayControleChamado[i][2]==3) {
				contCr3++;
			}else {
				contCr4++;
			}
		}
		System.out.println("--------------- RELATÓRIO DE CHAMADOS POR CRITÈRIO ---------------");
		 System.out.println("Números de chamados - Sistema Parado: "+contCr1);
		 System.out.println("Números de chamados - Grave: "+contCr2);
		 System.out.println("Números de chamados - Não Grave: "+contCr3);
		 System.out.println("Números de chamados - Dúvida: "+contCr4);
	}

}
