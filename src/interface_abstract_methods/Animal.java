package interface_abstract_methods;

public class Animal {
	public Animal(String name, String color, int numberoflegs, int age) {
		super();
		this.name = name;
		this.color = color;
		this.numberoflegs = numberoflegs;
		this.age = age;
	}
	
	String name;
	String color;
	int numberoflegs;
	int age;
	
	public void talk() {
		System.out.println("I am a: " +name);
		System.out.println("and my skin color is: " +color);
		System.out.println("Number of legs:"+ numberoflegs );
		System.out.println("and my age is: " +age);
		}
	public void eat() {
		System.out.println("eating......");
	}
	public void sleep() {
		
	System.out.println("sleeeeeeping...");
	}
}
