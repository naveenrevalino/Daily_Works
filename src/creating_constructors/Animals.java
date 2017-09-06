package creating_constructors;

public class Animals {
	public Animals(String name, String color, int numberoflegs, int age) {
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
	
	public void bark() {
		System.out.println("I am a: " +name);
		System.out.println("and my skin color is: " +color);
		System.out.println("Number of legs:"+ numberoflegs );
		System.out.println("and my age is: " +age);
		}
	public void swim() {
		System.out.println("not sure if i can swim");
	}
	public void run() {
		
	System.out.println("i am pretty fast than what you think...");
	}
	

}
