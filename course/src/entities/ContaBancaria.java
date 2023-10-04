package entities;

public class ContaBancaria {
	
	private final int numeroConta;
	private String nomeTitular;
	private double saldo;
	private final int taxaSaque = 5;
	
	// criado dois construtores, pelo motivo de ter a criação da conta sem deposito ou com depositov;
	public ContaBancaria(int numeroConta, String nome, double valorDepositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nome;
		// no caso do saldo por regra de negocio o ideal é encapsular, chamar o metodo de deposito,
		// futuramente se precisar mudar, alteramos somente o metodo e não o construtor.
		//this.saldo = valorDepositoInicial;
		depositoBancario(valorDepositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nome;
	}
	
	// conta depois de criada não ira mudar o número, então somente fazer o metodo de acesso get;
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	// saldo somente pode mudar atraves do metodo saque ou deposito, entao somente fazer o metodo de acesso get;
	public double getSaldo() {
		return saldo;
	}
	
	public void depositoBancario (double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void saqueBancario (double valorSaque) {
		this.saldo -= taxaSaque;
		this.saldo -= valorSaque;
	}
	
	

}
