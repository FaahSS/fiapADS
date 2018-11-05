package exercicios;

import java.util.Scanner;

public class Exercicio_01 {
	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int tipo=0, qtdDiaria=0;
		double total=0;
		
		System.out.println("Digite o Nome do Hóspede: ");
		nome = e.next()+e.nextLine();
		
		System.out.println("[1] ------ Standard");
		System.out.println("[2] ------ Luxo");
		System.out.println("[3] ------ Super Luxo");
		System.out.println("");
		
		System.out.println("Digite o Tipo de Acomodação: ");
		tipo = e.nextInt();
		while(tipo<1 || tipo>3) {
			System.out.println("Digite um Tipo de Acomodação Válido: ");
			tipo = e.nextInt();
		}
		
		System.out.println("Digite a Quantidade de Diárias: ");
		qtdDiaria = e.nextInt();
		
		total = calcularEstadia(tipo, qtdDiaria);
		pagamento(total, nome);
	}
	
	//Funções
	public static double calcularEstadia(int tipo, int qtdDiaria) {
		double total=0;
		if(tipo==1) {
			total = qtdDiaria*380;
		}else if(tipo==2) {
			total = qtdDiaria*450;
		}else {
			total = qtdDiaria*560;
		}
		return total;
	}
	
	//Procedimentos
	public static void pagamento(double total, String nome) {
		char pagamento;
		double desconto;
		System.out.println("[V] ------ à vista");
		System.out.println("[P] ------ a prazo");
		System.out.println("Solicite a Forma de Pagamento: ");
		pagamento = e.next().toUpperCase().charAt(0);
		
		while(pagamento !='V' && pagamento !='P') {
			System.out.println("Informe uma Forma de Pagamento Válida: ");
			pagamento = e.next().toUpperCase().charAt(0);
		}
		
		if(pagamento=='V') {
			desconto = total-(total*0.1);
			System.out.println("Nome: "+nome+" - Total a pagar: "+desconto);
		}else {
			System.out.println("Nome: "+nome+" - Total a pagar: "+total);
		}
	}
}
