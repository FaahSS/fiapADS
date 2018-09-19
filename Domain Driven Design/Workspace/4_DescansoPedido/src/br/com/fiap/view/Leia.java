package br.com.fiap.view;

import javax.swing.JOptionPane;

public class Leia {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
}