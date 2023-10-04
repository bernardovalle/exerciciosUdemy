package ExercicioHeranca;

public abstract class Contribuinte {
	
	private String nome;
	private Double rendaAnual;
	
	// construtores
	public Contribuinte() {
		
	}
	
	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	// métodos
	public abstract double taxaImposto();
	// feito método abstract pois irei fazer a logica do valor de imposto dentro da subclasse, deste modo a super classe fica como abstract;
	
	// gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
}
