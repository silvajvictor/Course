package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionário;

public class Program4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionário funcionário = new Funcionário();
		System.out.println("Entre com suas informações: ");
		System.out.println("Nome: ");
		funcionário.name = sc.nextLine();
		System.out.println("Salário: ");
		funcionário.grossSalary = sc.nextDouble();
		System.out.println("Quanto de desconto: ");
		funcionário.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("O salário líquido do funcionário é " +  funcionário.salarioLiq());
		System.out.println("Qual será o aumento de funcionário?(%) ");
		double aumento = sc.nextDouble();
		System.out.println("O salário com aumento ficará de: " + funcionário.salarioAum(aumento));
		
		
		sc.close();
	}
}
