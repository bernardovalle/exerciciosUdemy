package util;

public class CurrencyConvert {

	public static final double IOF = 6.00;
	
	public static double convertValor(double valorCotacao, double valor) {
		double totalCotacao = valorCotacao * valor;
		double imposto = IOF * totalCotacao / 100;
		return totalCotacao + imposto;
	}
	
	
	
}
