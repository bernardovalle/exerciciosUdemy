package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		double p = 2 * (width+height);
		return p;
	}
	public double diagonal() {
		// Math.pow é uma função com dois paremetros, no caso Math.pow(width,2) seria para elevar o width ao quadrado, que seria2
		return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
	
	}
	
	public String toString() {
		return "AREA "+area()
				+" PERIMETER "+perimeter()
				+" DIAGONAL "+diagonal();
	}

}
