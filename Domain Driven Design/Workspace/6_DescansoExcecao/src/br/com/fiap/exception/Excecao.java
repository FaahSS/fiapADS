package br.com.fiap.exception;

public class Excecao extends Exception{
	public static String tratar(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {	
		return"N�mero Inv�lido";
		}else {
			return"Erro desconhecido";
		}
	}
	

}

