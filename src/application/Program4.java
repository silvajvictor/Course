package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcion�rio;

public class Program4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcion�rio funcion�rio = new Funcion�rio();
		System.out.println("Entre com suas informa��es: ");
		System.out.println("Nome: ");
		funcion�rio.name = sc.nextLine();
		System.out.println("Sal�rio: ");
		funcion�rio.grossSalary = sc.nextDouble();
		System.out.println("Quanto de desconto: ");
		funcion�rio.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("O sal�rio l�quido do funcion�rio � " +  funcion�rio.salarioLiq());
		System.out.println("Qual ser� o aumento de funcion�rio?(%) ");
		double aumento = sc.nextDouble();
		System.out.println("O sal�rio com aumento ficar� de: " + funcion�rio.salarioAum(aumento));
		
		
		sc.close();
	}
}
