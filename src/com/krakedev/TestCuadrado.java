package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado a1 = new Cuadrado();
		Cuadrado a2 = new Cuadrado();
		Cuadrado a3 = new Cuadrado();
		
		a1.lado = 6;
		a2.lado = 5;
		a3.lado = 4;
		
		double areaCuadrado = a1.calcularArea();
		double areaCuadrado2 = a2.calcularArea();
		double areaCuadrado3 = a3.calcularArea();
		
		double perimetroCuadrado = a1.calcularPerimetro();
		double perimetroCuadrado2 = a2.calcularPerimetro();
		double perimetroCuadrado3 = a3.calcularPerimetro();
		
		System.out.println("*****AREA DEL CUADRADO*******");
		
		System.out.println("AREA 1= "+areaCuadrado);
		System.out.println("AREA 2= "+areaCuadrado2);
		System.out.println("AREA 3= "+areaCuadrado3);
		
		System.out.println("*****PERIMETRO DEL CUADRADO*******");
		
		System.out.println("PERIMETRO 1= "+perimetroCuadrado);
		System.out.println("PERIMETRO 2= "+perimetroCuadrado2);
		System.out.println("PERIMETRO 3= "+perimetroCuadrado3);
		
		
		
		
		

	}

}
