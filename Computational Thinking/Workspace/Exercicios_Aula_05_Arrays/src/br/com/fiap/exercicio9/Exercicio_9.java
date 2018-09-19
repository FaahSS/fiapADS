package br.com.fiap.exercicio9;

public class Exercicio_9 {
	public static void main(String[] args) {

		int[] vetor1 = new int[] { 3, 5, 4, 2, 2, 5, 3, 2, 5, 9 };
		int[] vetor2 = new int[] { 7, 15, 20, 0, 18, 4, 55, 23, 8, 6 };
		// vetorResultante {3, 7, 5, 15, 4, 20, 2, 0, 2, 18, 5, 4, 2, 55, 2, 23, 5, 8,
		// 9, 6}
		int[] vetorResultante = new int[20];
		int j = 0;

		// Intercalar Vetores
		for (int i = 0; i < 10; i++) {
			vetorResultante[j] = vetor1[i];
			System.out.println("Indice " + (j) + ": " + vetorResultante[j] + " ");
			j++; //foi criada uma variável inteiro 
			vetorResultante[j] = vetor2[i];
			System.out.println("Indice " + (j) + ": " + vetorResultante[j] + " ");
			j++;
		
		}

	}

}

