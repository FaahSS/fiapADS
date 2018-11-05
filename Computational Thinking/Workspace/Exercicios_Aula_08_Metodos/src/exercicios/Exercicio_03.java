package exercicios;

import java.util.Scanner;

public class Exercicio_03 {
	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String arrayNome[] = new String[4];
		double arraySalario[] = new double[4];
		double arrayTempo[] = new double[4];
		
		String arrayAumento[] = new String[4];
		
		for(int i=0;i<arrayNome.length;i++) {
			System.out.println("--------- "+(i+1)+"º Funcionário ");
			System.out.println("Informe o Nome: ");
			arrayNome[i] = e.next()+e.nextLine();
			System.out.println("Informe o Salário: ");
			arraySalario[i] = e.nextDouble();
			System.out.println("Informe o Tempo de Serviço: ");
			arrayTempo[i] = e.nextDouble();
		}
		
		arrayAumento = verificarAumento(arraySalario, arrayTempo);
		System.out.println("\nNome\tAumento\t\n--------------------------\n");
		for(int i=0;i<arrayNome.length;i++) {
			System.out.println(arrayNome[i]+"\t"+arrayAumento[i]+"\t");
		}
		
	}
	
	public static String[] verificarAumento(double salario[], double tempo[]) {
		String aumento[] = new String[4];
		
		for(int i=0;i<aumento.length;i++) {
			if(salario[i]<700 || tempo[i]>3) {
				aumento[i] = "Tem direito ao aumento";
			}else {
				aumento[i] = "Não tem direito ao aumento";
			}
		}
		return aumento;
	}

}
