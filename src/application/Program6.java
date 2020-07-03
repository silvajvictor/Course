package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		
		System.out.println("How dollars will be bought? ");
		double valor = sc.nextDouble();
		
		double valorTotal = CurrencyConverter.valorTotal(valor, dolarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", valorTotal);
			
		sc.close();
	}
}
