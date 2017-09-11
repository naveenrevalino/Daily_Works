package inheritance_method_overriding;


public class Fish extends Animal{
	public Fish(String name, String color, int numberoflegs, int age) {
		super(name, color, numberoflegs, age);
		}

	public void swim() {
		System.out.println("Swimminging....");
	}
}
