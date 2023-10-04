package entities;
// aula sobre encapsulamento, onde foi criado os metodos get e set dos atributos.
// opção para fazer os consyrutores e gets/sets automaticos, botão direito do mouse e em source terá a opção 
public class ProductEncapsulamento {
	// modificato o tipo dos atributos para private.
	private String name;
	private double price;
	private int quantity;
	
	public ProductEncapsulamento() {
		
	}
	
	// criação do construtor para obrigação de fornecer nome, preço e quantidade, com intuito de não criar um objeto vaziu;
	public ProductEncapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Sobre carga seria disponibilizar mais de uma versão da mesma versão da operação, no caso dos construtores somente,
	// mudou a lista de parametro;
	public ProductEncapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
		//this.quantity = quantity; por padrão o java já inicia numero do objeto e array em 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// refernete a quantidade somente feito o get, pois o set para poder garantir a integridade do produto, 
	// somente foi criado os metodos para adicionar ou remover a quantidade;
	public int getQuantity() {
		return quantity;
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
