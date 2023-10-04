package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExemploVetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Enter number");
		int n = leia.nextInt();
		
		// criando vetor com n elementos;
		
		double[] vect = new double[n];
		for (int i=0; i <n; i++) {
			vect[i] = leia.nextDouble();
		}
	}

}
