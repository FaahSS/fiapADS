package exemplos;

import java.util.Scanner;

public class Exemplo_01 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Chamada de M�todo
		verificar();
	}
	
	//PROCEDIMENTOS S�O SEMPRE VOID POIS NUNCA IR�O RETORNAR NADA
	//FUN��O VAI RETORNAR
	//EXIBIR VAI SER VOID
	
	public static void verificar() {
		int numero = 0;
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		if (numero %2==0) {
			System.out.println("Par");
		} else {
			System.out.println("�mpar");
		}
	
	}

}
