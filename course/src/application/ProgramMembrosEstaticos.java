package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramMembrosEstaticos {
	
	// variavel constante que não muda.
	public static final double PI = 3.14159;

	// NOTA - dentro de um metodo static não é possivel chamar outro metodo que não seja static
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// na segunda etapa do código, criei uma classe Calculator, com os metodos dentro da classe. Ver EX02;
		// nesse caso é necessario instanciar um objeto Calculator para poder chamar as funções
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
		}
	
	// metodo retornando um dado double
	// o método é static pois caso não seja não funciona. 
		public static double circumference(double radius) {
		return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		}

}
