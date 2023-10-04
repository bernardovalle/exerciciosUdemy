package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números");
		int num = leia.nextInt();
		
		int[] vetor = new int[num];
		
		for(int i=0; i < num;i++) {
			System.out.println("Informe o número");
			vetor[i]= leia.nextInt();
		}
		System.out.println("Números negativos");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i] <0 ) {
				System.out.println(vetor[i]);
			}
		}
		leia.close();
	}

}
