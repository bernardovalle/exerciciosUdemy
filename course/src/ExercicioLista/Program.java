package ExercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos Funcionarios deseja cadastrar?");
		int n = leia.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #"+(i+1));
			System.out.println("Id -");  
			int id = leia.nextInt();
//			while (hasId(list, id)) {
//				System.out.print("Já cadastrado, tente novamente: ");
//				id = leia.nextInt();
//			}
			System.out.println("Nome -");
			String nome = leia.next();
			System.out.println("Salario - ");
			double salary = leia.nextDouble();
			
			// instanciar o objeto emp,"Criou/instaciou o funcionario"
			Employee emp = new Employee(id, nome, salary);
			list.add(emp);			
		} 
		
		System.out.println("Digite o id do funcionario que deseja aumentar o salario: ");
		int id = leia.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("Esse id não existe.");
		} else {
			System.out.println("Id encontrado*");
			System.out.println("Informe a porcentagem: ");
			double porct = leia.nextDouble();
			emp.increaseSalary(porct);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : list) {
			System.out.println(x);
		}
		leia.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
