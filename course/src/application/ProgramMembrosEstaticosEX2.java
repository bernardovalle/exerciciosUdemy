package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramMembrosEstaticosEX2 {
	
	// variavel constante que não muda.
	//public static final double PI = 3.14159;

	// NOTA - dentro de um metodo static não é possivel chamar outro metodo que não seja static
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// na segunda etapa do código, criei uma classe Calculator, com os metodos dentro da classe;
		// nesse caso é necessario instanciar um objeto Calculator para poder chamar as funções
		
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
		}

}
