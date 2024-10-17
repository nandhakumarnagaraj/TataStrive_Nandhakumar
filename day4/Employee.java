package day4;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	
	public Employee() {
	}


	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Name:"+ name + "\nID:"+ id +"\nsalary:"+salary);
	}
	
}