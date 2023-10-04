package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramMembrosEstaticosEX3 {
	
	// variavel constante que não muda.
	//public static final double PI = 3.14159;

	// NOTA - dentro de um metodo static não é possivel chamar outro metodo que não seja static
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		// quando o método for static pode ser chamar direto a classe, pois não é necessario instanciar. 
		// exemplo abaixo
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		
		}

}
