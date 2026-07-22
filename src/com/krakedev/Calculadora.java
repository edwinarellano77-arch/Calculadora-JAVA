package com.krakedev;

public class Calculadora {
	
	public double producto(double a, double b) {
		
		double resultado = a * b;
		return resultado;
	}
	
	public double dividir(double a, double b) {
		
		double resultado = a / b;
		return resultado;
	}
	
	public double promedio(double a, double b, double c) {
		
		double resultado = (a + b + c)/3;
		return resultado;
	}
	
	public void mostrarResultado() {
		
		System.out.println("Ahorita no joven, Sali al almuerzo, Regreso en 15 minutos");
	}

}
