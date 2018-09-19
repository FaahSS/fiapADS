package br.com.fiap.model;

public class Calculadora {
private double n1;
private double n2;
private double r;

public void soma (double n1, double n2) {
	r = n1 + n2;
	
}

public String getAll() {
	return "Número 1:" + n1 + "\n" +
		   "Número 2:" + n2 + "\n"+
		   "Resposta:" + r;
}

public void setAll(double n1, double n2, double r) {
	setN1(n1);
	setN2(n2);
	setR(r);
}

//Construtores
public Calculadora() {
	super();
}

public Calculadora(double n1, double n2, double r) {
	super();
	setN1(n1);
	setN2(n2);
	setR(r);
}
//get & set
public double getN1() {
	return n1;
}
public void setN1(double n1) {
	this.n1 = n1;
}
public double getN2() {
	return n2;
}
public void setN2(double n2) {
	this.n2 = n2;
}

public double getR() {
	return r;
}

public void setR(double r) {
	this.r = r;
}







}
