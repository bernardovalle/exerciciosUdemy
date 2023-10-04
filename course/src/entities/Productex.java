package entities;

public class Productex {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		// o this se refere ao atributo dentro da minha classe, no caso o quantity, para não ocorrer erro na hora de validar o método.
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// feito para implementar a minha operação do toString() sobreposição. Fazendo o retorno da minha escolha.
	public String toString() {
		return name
				+ ", $ "
				// usado para formatar as casas decimais.
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+  String.format("%.2f", totalValueStock());
	}

}
