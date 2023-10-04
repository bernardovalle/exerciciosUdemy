package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioVetorAltura;
import entities.ProdutoVetor;

public class ExercicioVetor03_alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int n, menores;
		System.out.println("Informe o número de pessoas: ");
		
		 n = leia.nextInt();
		// criando vetor com n elementos // tipo referencia;
		
		ExercicioVetorAltura[] vetorPessoas = new ExercicioVetorAltura[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite os dados "+(i+1)+"a pessoa: ");
			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Idade: ");
			int idade = leia.nextInt();
			System.out.println("Altura: ");
			double altura = leia.nextDouble();
			vetorPessoas[i] = new ExercicioVetorAltura(nome, idade, altura);
		}
		
		double percentualMenores, alturaMedia = 0;
		menores = 0;
		for(int i=0; i<vetorPessoas.length;i++) {
			alturaMedia += vetorPessoas[i].getAltura();
			if(vetorPessoas[i].getIdade() < 16) {
				menores++;
			}
		}
		
		percentualMenores = (menores * 100) / n;
		System.out.println("Altura média "+(alturaMedia/n));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		

	}

}
