package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Triangle;

public class ProgramaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and height:");
		rectangle.width = leia.nextDouble();
		rectangle.height = leia.nextDouble();
		
		System.out.println(rectangle.toString());

	}

}
