package exercicios;

import java.util.Scanner;

public class Exercicio_06 {
	static Scanner e = new Scanner(System.in);
	static int arrayMatriz[][] = new int[6][6];
	
	public static void main(String[] args) {
		for(int i =0;i<6;i++) {
			for (int j=0;j<6;j++) {
				System.out.println("Informe a posição [ "+(i)+", "+(j)+" ]: ");
				arrayMatriz[i][j] = e.nextInt();
			}
		}
		
		multiplicaMatriz();
		
		System.out.println("Matriz Multiplicação");
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.println("Posição [ "+(i)+", "+(j)+" ]: "+arrayMatriz[i][j]);
			}
		}
		
	}
	
	//Procedimentos
	public static void multiplicaMatriz() {
		int valor =0;
		for(int i=0;i<6;i++) {
			valor = arrayMatriz[i][i];
			for (int j=0;j<6;j++) {
				arrayMatriz[i][j] = arrayMatriz[i][j]*valor;
			}
		}
	}

}
