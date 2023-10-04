package application;

import entities.Pensionato;

public class LacoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		// Laco for
		for (int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		
		
		// Laço For Each
		// leitura -  para cada nomes contido no vetor vect faça
		for (String nomes : vect) {
			System.out.println(nomes);
		}
		

	}

}
