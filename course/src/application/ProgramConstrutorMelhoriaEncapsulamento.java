package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import entities.ProductEncapsulamento;
import entities.ProductSobreCarga;

public class ProgramConstrutorMelhoriaEncapsulamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// melhoria para que o programa obrigue o user a informar um produto
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();

		// usado variaveis locais para forçar somente criar o produto quando esses dados acima;
		// feito construtor na classe product referenciando o objeto;
		// nesse passo abaixo ao instanciar o objeto foi repassado 3 parametros.
		
		ProductEncapsulamento product = new ProductEncapsulamento(name, price);
		// removido a quantidade para usar a sobre carga somente com nome e preço, pois a quantidade já foi iniciada por padrão em 0.
		
		product.setName("computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1000.00);
		System.out.println("Updated price: " + product.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}