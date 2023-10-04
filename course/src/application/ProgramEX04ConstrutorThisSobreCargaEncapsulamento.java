package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramEX04ConstrutorThisSobreCargaEncapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		// minha versão; 
		
		//System.out.println("Digite o número da conta:");
		//int numeroconta = leia.nextInt();
		//System.out.println("Digite o nome do titular:");
		//String nomeTitular = leia.next();
		//System.out.println("Deseja despositar um valor inicial (s/n) ?");
		//String opcaoDeposito = leia.next();
		
		//if(opcaoDeposito.equals("s")) {
		//	System.out.println("Informe o valor inicial");
		//	double valorInicial = leia.nextDouble();
		//	ContaBancaria conta = new ContaBancaria(numeroconta, nomeTitular, valorInicial);
			
		//	System.out.println("Informações da Conta");
		//	System.out.println("Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
			
		//	System.out.println("Digite um valor para deposito: ");
		//	double valorDeposito = leia.nextDouble();
		//	conta.depositoBancario(valorDeposito);
		//	System.out.println("Update - Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
			
		//	double valorSaque = leia.nextDouble();
		//	conta.saqueBancario(valorSaque);
		//	System.out.println("Update - Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
			
		//} else if (opcaoDeposito.equals("n")) {
		//	ContaBancaria conta = new ContaBancaria(numeroconta, nomeTitular);
		//	System.out.println("Informações da Conta");
		//	System.out.println("Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
			
		//} 
		
		// versão Corrigido;
		
		ContaBancaria conta = null; //A declaração não cria uma instância real da classe Account, mas apenas reserva espaço na memória para que uma referência a um objeto Account possa ser armazenada
		
		System.out.println("Digite o número da conta:");
		int numeroconta = leia.nextInt();
		System.out.println("Digite o nome do titular:");
		String nomeTitular = leia.next();
		System.out.println("Deseja despositar um valor inicial (s/n) ?");
		char opcaoDeposito = leia.next().charAt(0);
		
		if(opcaoDeposito == 's') {
			System.out.println("Informe o valor inicial");
			double valorInicial = leia.nextDouble(); 
			conta = new ContaBancaria(numeroconta, nomeTitular, valorInicial);
			
		} else if (opcaoDeposito == 'n') {
			conta = new ContaBancaria(numeroconta, nomeTitular);
		} 
		
		System.out.println("Informações da Conta");
		System.out.println("Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
		
		System.out.println("Digite um valor para deposito: ");
		double valorDeposito = leia.nextDouble();
		conta.depositoBancario(valorDeposito);
		System.out.println("Update - Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
		
		double valorSaque = leia.nextDouble();
		conta.saqueBancario(valorSaque);
		System.out.println("Update - Conta"+conta.getNumeroConta()+", Titular: "+conta.getNomeTitular()+", Saldo: "+conta.getSaldo());
		
		
		leia.close();
	}

}
