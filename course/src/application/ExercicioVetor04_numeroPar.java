package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor04_numeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		int n ;
		
		System.out.println("Quantos números voce vai digitar? ");
		n = leia.nextInt();

		int[] numerosPares =  new int[n];

		for (int i=0; i < n; i++) {
			System.out.printf("Digite um número: ");
			numerosPares[i] = leia.nextInt();
		}
		
		int soma = 0;
		System.out.print("Números pares = ");
		for(int i=0;i<numerosPares.length;i++) {
			if(numerosPares[i] % 2 == 0 ) {
				System.out.print(numerosPares[i]);
				System.out.print(";");
				soma++;
			}
			
		}
		System.out.println("");
		System.out.println("Quantidade de pares: "+ soma);
		
		
		leia.close();
	}
	

}
