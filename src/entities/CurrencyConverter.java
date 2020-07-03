package entities;

public class CurrencyConverter {
		
	public static double valorTotal(double valor, double dolarPrice){
		return (dolarPrice * valor) + (valor * 0.6);
		
	}
}