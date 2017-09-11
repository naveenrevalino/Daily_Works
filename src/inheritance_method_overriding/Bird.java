package inheritance_method_overriding;

public class Bird extends Animal {
	public Bird(String name, String color, int numberoflegs, int age) {
		super(name, color, numberoflegs, age);
	}

	public void fly() {
		System.out.println("flying....");
	}
}