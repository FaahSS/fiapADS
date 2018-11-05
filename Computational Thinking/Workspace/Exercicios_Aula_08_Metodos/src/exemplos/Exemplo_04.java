package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo_04 {
	static Scanner e = new Scanner(System.in);
	static DecimalFormat p = new DecimalFormat("#0.00");
	
	public static void main(String[] args) {
		int opcao = 0;
		double num1=0, num2=0;
		
		while (opcao!=5) {
			System.out.println("Escolha uma opção: ");
			System.out.println("[1] ------ Adicionar");
			System.out.println("[2] ------ Subtrair");
			System.out.println("[3] ------ Multiplicar");
			System.out.println("[4] ------ Dividir");
			System.out.println("[5] ------ Cancelar / Finalizar Programa");
			
			opcao = e.nextInt();
			
			if(opcao>0 && opcao<5) {
				System.out.println("Digite o primeiro número: ");
				num1=e.nextDouble();
				System.out.println("Digite o segundo número: ");
				num2=e.nextDouble();
			}
			
			if(opcao==1) {
				adicao(num1,num2);
			} else if(opcao==2) {
				subtracao(num1, num2);
			} else if(opcao==3) {
				multiplicacao(num1, num2);
			} else if(opcao==4) {
				divisao(num1, num2);
			} else if(opcao==5) {
				System.exit(0);
			} else {
				System.out.println("OPÇÃO INVÁLIDA"+"\n");
			}
			
		}
	}
	
	public static void adicao(double num1, double num2) {
		System.out.println("A Soma é: "+(num1+num2)+"\n");
	}
	
	public static void subtracao(double num1, double num2) {
		System.out.println("A Subtração é: "+(num1-num2)+"\n");
	}
	
	public static void multiplicacao(double num1, double num2) {
		System.out.println("A Multiplicação é: "+(num1*num2)+"\n");
	}
	public static void divisao(double num1, double num2) {
		System.out.println("A Divisão é: "+p.format((num1/num2))+"\n");
	}

}
