package ExercicioHeranca;

public class pessoaJuridica extends Contribuinte{

	private Integer quantidadeFuncionarios;
	
	public pessoaJuridica() {
		
	}
	
	public pessoaJuridica(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public pessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	
	@Override
	public double taxaImposto() {
		
		if(quantidadeFuncionarios > 10) {
			return  getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}

}
