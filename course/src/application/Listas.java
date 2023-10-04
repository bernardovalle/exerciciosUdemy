package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("Bernardo");
		list.add("Alex");
		list.add("Roze");
		list.add("Ana");
		list.add("Maria");
		// add na posição sem prejudicar o resto da lista
		list.add(2, "Marco");
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------------");
		// removendo um dado da lista com a comparação dele com outro
		list.remove("Maria");
		// remove todos os elementos que tem a primeira letra M		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Index of Bob"+ list.indexOf("Bob"));
		System.out.println("Index of Valle"+ list.indexOf("Valle"));
		
		System.out.println("------------------------------------------------------------------");
		
		// convertendo para lista, após expressão lambda e após converter novamente para lista.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
	}

}
