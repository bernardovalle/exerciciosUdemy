package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Employee employee = new Employee();
		
		
		System.out.println("Informe o nome do funcionario");
		employee.name = leia.next();
		System.out.println("Informe o salario bruto do funcionario");
		employee.grossSalary = leia.nextDouble();
		System.out.println("Informe o a taxa de imposto do funcionario");
		employee.tax = leia.nextDouble();
		System.out.println(employee.toString());
		System.out.println("Which percentage to increase salary?");
		double tax = leia.nextDouble();
		employee.increaseSalary(tax);
		System.out.println(employee.toString());
		
		leia.close();

	}

}
