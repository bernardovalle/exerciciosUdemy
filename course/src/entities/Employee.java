package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double aux = grossSalary * (percentage / 100.0);
		grossSalary += aux;
	}
	
	public String toString() {
		return "Employee: "+name+", $"+netSalary();
	}
	
	
	
	

}
