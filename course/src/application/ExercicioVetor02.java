package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos números voce vai digitar?");
		int n = leia.nextInt();
		
		double[] vetor = new double [n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero:");
			vetor[i] = leia.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		double soma = 0;
		for(int i=0;i<vetor.length;i++) {
			soma +=vetor[i];
		}
		
		System.out.println("\nSoma: "+soma);
		System.out.println("Media"+(soma/n));
		
	}

}
