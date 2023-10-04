package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class ProgramExFixacaoMetododPt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da cotação");
		double priceDollar = ler.nextDouble();
		System.out.println("Informe o valor de Dollar");
		double valorDollar = ler.nextDouble();
		System.out.println("Valor em real: "+ CurrencyConvert.convertValor(priceDollar, valorDollar));
		
		
	}

}
