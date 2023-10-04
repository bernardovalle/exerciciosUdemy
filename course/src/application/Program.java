package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
	
		System.out.println("Quem tem a maior Area.");
		System.out.println("Informe os lados do triangulo A");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		System.out.println("Informe os lados do triangulo A");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area X "+ areaX);
		System.out.println("Area Y "+ areaY);
		
		if(areaX > areaY) {
			System.out.println("Area X é maior");
		} else {
			System.out.println("Area Y é maior");
		}
	}

}
