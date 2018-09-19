package br.com.fiap.exception;

public class Excecao extends Exception {
	public static String tratarExcecao(Exception e) {
		if(e.getClass().getName().equals("java.sql.SQLException")) {
			return "Ocorreu um erro ao conectar no banco!";
		} else if(e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "N�mero inv�lido!";
		} else {
			return "Deu ruim!!!";
		}
	}

}
