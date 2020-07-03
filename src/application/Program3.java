package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Quais as medidas do retangulo: ");
		System.out.println("Width: ");
		retangulo.width = sc.nextDouble();
		System.out.println("Height: ");
		retangulo.height = sc.nextDouble();
		
		System.out.println();
		System.out.println("A área do retangulo é: " + retangulo.calcularArea());
		
		System.out.println();
		System.out.println("O perimetro do retangulo é: " + retangulo.calcularPerimeter());
		
		sc.close();
	}
}
