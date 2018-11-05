package exemplos;

import java.util.Scanner;

public class Exemplo_01 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Chamada de Método
		verificar();
	}
	
	//PROCEDIMENTOS SÃO SEMPRE VOID POIS NUNCA IRÃO RETORNAR NADA
	//FUNÇÃO VAI RETORNAR
	//EXIBIR VAI SER VOID
	
	public static void verificar() {
		int numero = 0;
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		if (numero %2==0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
	
	}

}
