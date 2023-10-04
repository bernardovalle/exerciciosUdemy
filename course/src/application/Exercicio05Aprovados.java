package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioAprovados;

public class Exercicio05Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos alunos serão digitados? ");
		n = leia.nextInt();
		
		ExercicioAprovados[] vetorAprovados = new ExercicioAprovados[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Nome do aluno, nota 1 e nota 2: ");
			String nomeAluno = leia.next();
			double nota1 = leia.nextDouble();
			double nota2 = leia.nextDouble();
			vetorAprovados[i] = new ExercicioAprovados(nomeAluno, nota1, nota2);
		}
		
		System.out.println("APROVADOS ");
		for(int i=0; i<n; i++) {
			if (((vetorAprovados[i].getPrimeiraNota() + vetorAprovados[i].getSegundaNota())/2) > 6) {
				System.out.println(vetorAprovados[i].getNome()+";");
			}
		}
		
	}

}
