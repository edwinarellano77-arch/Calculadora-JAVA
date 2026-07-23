package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo p1 = new Rectangulo();
		p1.altura1=5;
		p1.altura2=5;
		p1.base1= 8;
		p1.base2=8;
		
		double perimetro = p1.calcularPerimetro();
		
		System.out.println("Perimetro= "+perimetro);
	}

}    
