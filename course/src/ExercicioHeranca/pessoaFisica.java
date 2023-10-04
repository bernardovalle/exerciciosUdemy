package ExercicioHeranca;

public class pessoaFisica extends Contribuinte{

	private Double gastoComSaude;
	
	public pessoaFisica() {
	
	}
	
	public pessoaFisica(Double gastoComSaude) {
		super();
		this.gastoComSaude = gastoComSaude;
	}

	public pessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}


	@Override
	public double taxaImposto() {
		double valorImposto;
		if (getRendaAnual() < 2000.00){
			valorImposto = getRendaAnual() * 0.15;
		} else {
			valorImposto = getRendaAnual() * 0.25;
		}
		
		valorImposto -= gastoComSaude * 0.5;
		
		if (valorImposto < 0) {
			valorImposto = 0.0;
		} 
		return valorImposto;	
	}
}
