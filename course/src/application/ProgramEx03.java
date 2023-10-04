package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Informe o nome do aluno:");
		student.name = leia.next();
		System.out.println("Informe as 3 notas do aluno:");
		student.nota1 = leia.nextDouble();
		student.nota2 = leia.nextDouble();
		student.nota3 = leia.nextDouble();
		
		if (student.calculoNota() > 60 ) {
			System.out.println("Final Grade: "+student.calculoNota()+", PASS");
		} else {
			double pontoRestanten = 60 - student.calculoNota();
			System.out.println("Final Grade: "+student.calculoNota()+", Failed. "+
			"Missing: "+pontoRestanten+" points");
		}
		leia.close();
	}
	
}
