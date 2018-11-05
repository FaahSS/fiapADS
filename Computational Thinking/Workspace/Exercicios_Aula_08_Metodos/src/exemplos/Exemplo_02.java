package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo_02 {
	static Scanner e = new Scanner(System.in);
	static DecimalFormat p = new DecimalFormat("#0.00");
	
	public static void main(String[] args) {
		int opcao=0;
		
		while(opcao!=5) {
			System.out.println("Escolha uma opção: ");
			System.out.println("[1] ------ Adicionar");
			System.out.println("[2] ------ Subtrair");
			System.out.println("[3] ------ Multiplicar");
			System.out.println("[4] ------ Dividir");
			System.out.println("[5] ------ Cancelar / Finalizar Programa");
			
			opcao = e.nextInt();
			
			if(opcao==1) {
				adicao();
			} else if(opcao==2) {
				subtracao();
			} else if(opcao==3) {
				multiplicacao();
			} else if(opcao==4) {
				divisao();
			} else if(opcao==5) {
				System.exit(0);
			} else {
				System.out.println("OPÇÃO INVÁLIDA");
			}
			
		}
	}
	
	public static void adicao() {
		int numero1=0,numero2=0;
		System.out.println("Digite o primeiro número a ser somado: ");
		numero1 = e.nextInt();
		System.out.println("Digite o segundo número a ser somado:");
		numero2 = e.nextInt();
		System.out.println("A soma é: "+(numero1+numero2)+"\n");
	}
	
	public static void subtracao() {
		int numero1=0, numero2=0;
		System.out.println("Digite o primeiro número a ser subtraído: ");
		numero1 = e.nextInt();
		System.out.println("Digite o segundo número a ser subtraído: ");
		numero2 = e.nextInt();
		System.out.println("A subtração é: "+(numero1-numero2)+"\n");
	}
	
	public static void multiplicacao() {
		int numero1=0, numero2=0;
		System.out.println("Digite o primeiro número a ser multiplicado: ");
		numero1 = e.nextInt();
		System.out.println("Digite o segundo número a ser multiplicado: ");
		numero2 = e.nextInt();
		System.out.println("A multiplicação é: "+(numero1*numero2)+"\n");
	}
	
	public static void divisao() {
		double numero1=0, numero2=0;
		System.out.println("Digite o número a ser dividio: ");
		numero1 = e.nextDouble();
		System.out.println("Digite o número que irá dividi-lo: ");
		numero2 = e.nextDouble();
		System.out.println("A divisão é: "+p.format((numero1/numero2))+"\n");
	}

}
