package br.com.fiap.main;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista);
		/*
		 * Set não possui índice, não aceita dados duplicados
		 * Permite a busca mais rápida, não precisa varrer a lista.
		 */
	}

}
