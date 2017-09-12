package interface_abstract_methods;


public class Chicken extends Bird{

	public Chicken(String name, String color, int numberoflegs, int age) {
		super(name, color, numberoflegs, age);

	}
	
	// Overriding the method fly(); defined in the class Bird
	public void fly() {
		System.out.println("A chicken can never fly");
	}
}
