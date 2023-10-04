package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Productex;

public class ProgramProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
			
		Productex product = new Productex();
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		product.name = leia.nextLine();
		System.out.println("Price:");
		product.price = leia.nextDouble();
		System.out.println("Quantity in stock:");
		product.quantity = leia.nextInt();
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added in stock:");
		int quantidade = leia.nextInt();
		product.addProducts(quantidade);
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be removed from stock:");
		quantidade = leia.nextInt();
		product.removeProducts(quantidade);
		
		System.out.println(product.toString());
		
		leia.close();
	}

}
