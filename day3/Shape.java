package day3;

public class Shape {
	private String color;

	public Shape() {

	}

	public Shape(String color) {
		this.color = color;
		
	}
	public void showDetails() {
		System.out.println("Shape Details \n-----------");
		System.out.println("Color :"+color);
	
	}

	public double calculateArea() {
		
		return 0;
	}

}