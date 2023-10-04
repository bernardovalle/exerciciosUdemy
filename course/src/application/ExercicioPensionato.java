package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ExercicioPensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Pensionato[] pensionato = new Pensionato[10];

		int numOspedes;
		
		System.out.println("How many rooms will be rented?");
		numOspedes = leia.nextInt();
		
		for (int i=0; i < numOspedes; i++) {
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = leia.next();
			System.out.print("Email: ");
			String email = leia.next();
			System.out.print("Romm: ");
			int room = leia.nextInt();
			pensionato[room] = new Pensionato(name, email);
		}
		
		System.out.println("Busy rooms ");
		for(int i=0; i < 10; i++) {
			if (pensionato[i] != null) {
				System.out.println(i+": "+ pensionato[i].getNome()+", "+pensionato[i].getEmail());
			}
		}
		
		
	}

}
