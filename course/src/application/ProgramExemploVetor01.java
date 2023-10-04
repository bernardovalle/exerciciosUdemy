package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoVetor;

public class ProgramExemploVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Enter number");
		
		int n = leia.nextInt();
		// criando vetor com n elementos // tipo referencia;
		
		ProdutoVetor[] vect =  new ProdutoVetor[n];
		for(int i=0; i < vect.length; i++) {
			leia.nextLine();
			String name = leia.nextLine();
			double price = leia.nextDouble();
			vect[i] = new ProdutoVetor(name, price);
		}
		
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double result = soma / n;
		System.out.printf("Result %.2f%n", result);
	
		leia.close();
	}

}
