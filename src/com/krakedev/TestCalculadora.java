package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		double p1;
		p1=c1.producto(10, 5);
		
		System.out.println("Producto= "+p1);
		
		double d1;
		d1=c1.dividir(10, 2);
		
		System.out.println("Division= "+d1);
		
		double p2;
		p2=c1.promedio(5, 8, 10);
		
		System.out.println("Promedio= "+p2);
		
		
		c1.mostrarResultado();
		
		
		
		

	}

}
