package entities;

public class ProductSobreCarga {
	public String name;
	public double price;
	public int quantity;
	
	public ProductSobreCarga() {
		
	}
	
	// criação do construtor para obrigação de fornecer nome, preço e quantidade, com intuito de não criar um objeto vaziu;
	public ProductSobreCarga(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Sobre carga seria disponibilizar mais de uma versão da mesma versão da operação, no caso dos construtores somente,
	// mudou a lista de parametro;
	public ProductSobreCarga(String name, double price) {
		this.name = name;
		this.price = price;
		//this.quantity = quantity; por padrão o java já inicia numero do objeto e array em 0;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
