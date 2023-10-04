package entities;

public class ExercicioAprovados {
	
	private String nome;
	private double primeiraNota;
	private double SegundaNota;
	
	public ExercicioAprovados(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.primeiraNota = nota1;
		this.SegundaNota = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrimeiraNota() {
		return primeiraNota;
	}

	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public double getSegundaNota() {
		return SegundaNota;
	}

	public void setSegundaNota(double segundaNota) {
		SegundaNota = segundaNota;
	}
	
	
	
	
	
	

}
