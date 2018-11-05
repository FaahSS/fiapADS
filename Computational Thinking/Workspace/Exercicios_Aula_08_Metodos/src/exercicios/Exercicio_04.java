package exercicios;

import java.util.Scanner;

public class Exercicio_04 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arrayChamado[][] = chamados();
		
		verificarChamado(arrayChamado);
		verificarCriterio(arrayChamado);
		
	}
	
	//Fun��es
	public static int[][] chamados(){
		int arrayChamado[][] = new int[5][3];
		System.out.println("-------- Abertura do Chamado --------");
		for(int i=0;i<5;i++) {
			System.out.println("Digite a Identifica��o do Funcion�rio: ");
			arrayChamado[i][0] = e.nextInt();
			System.out.println("\n[1] ------ Sistema n�o inicia");
			System.out.println("[2] ------ Nome ou caminho do banco de dados n�o encontrado");
			System.out.println("[3] ------ Sistema n�o responde");
			System.out.println("Digite o c�digo de erro do Sistema: ");
			arrayChamado[i][1]= e.nextInt();
			while(arrayChamado[i][1]<1 || arrayChamado[i][1]>3) {
				System.out.println("Informe um Erro V�lido: ");
				arrayChamado[i][1]= e.nextInt();
			}
			System.out.println("\n[1] ------ Sistema parado");
			System.out.println("[2] ------ Grave");
			System.out.println("[3] ------ N�o Grave");
			System.out.println("[4] ------ D�vida");
			System.out.println("Digite o crit�rio do chamado: ");
			arrayChamado[i][2] = e.nextInt();
			while(arrayChamado[i][2]<1 || arrayChamado[i][2]>4) {
				System.out.println("Informe um Crit�rio V�lido: ");
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
		 
		 System.out.println("--------------- RELAT�RIO DE CHAMADOS POR ERRO ---------------");
		 System.out.println("N�meros de chamados com C�digo do Erro 1: "+contErro1);
		 System.out.println("N�meros de chamados com C�digo do Erro 2: "+contErro2);
		 System.out.println("N�meros de chamados com C�digo do Erro 3: "+contErro3);
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
		System.out.println("--------------- RELAT�RIO DE CHAMADOS POR CRIT�RIO ---------------");
		 System.out.println("N�meros de chamados - Sistema Parado: "+contCr1);
		 System.out.println("N�meros de chamados - Grave: "+contCr2);
		 System.out.println("N�meros de chamados - N�o Grave: "+contCr3);
		 System.out.println("N�meros de chamados - D�vida: "+contCr4);
	}

}
