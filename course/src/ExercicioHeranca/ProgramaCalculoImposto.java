package ExercicioHeranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaCalculoImposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Contribuinte> listContribuinte = new ArrayList<>();

		System.out.println("Informe quantos contribuintes vai calcular?");
		int n = leia.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("CPF(f) ou CNPJ(j):");
			char tipo = leia.next().charAt(0);
			if(tipo == 'f') {
				System.out.println("Informe o nome do contribuinte:");
				String nome = leia.next();
				System.out.println("Informe a renda anual: ");
				double renda = leia.nextDouble();
				System.out.println("Gastos com saúde? ");
				double gastosSaude = leia.nextDouble();
//				pessoaFisica pessoa = new pessoaFisica(nome, renda, gastosSaude);
//				listContribuinte.add(pessoa);
				listContribuinte.add(new pessoaFisica(nome, renda, gastosSaude));
			} else {
				System.out.println("Informe o nome do contribuinte CNPJ:");
				String nome = leia.next();
				System.out.println("Informe a renda anual: ");
				double renda = leia.nextDouble();
				System.out.println("Número de Funcionarios: ");
				int nFuncionario = leia.nextInt();
				listContribuinte.add(new pessoaJuridica(nome, renda, nFuncionario));
				
			}
		}
		
		System.out.println("Contribuintes - ");
		double cont = 0;
		for(Contribuinte x: listContribuinte) {
			System.out.println("Nome: "+ x.getNome()+". $"+x.taxaImposto());
			cont += x.taxaImposto();
		}
		System.out.println("Total Impostos - "+cont);
		
	}

}
