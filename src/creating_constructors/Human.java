package creating_constructors;

public class Human {
	public Human() {
		
	}
	
	String name;
	String eyecolor;
	int age;
	int height;
	
	public void speak() {
		System.out.println("Hi my name is: "+name);
		System.out.println("My eye color is: "+eyecolor);
		System.out.println("My age is: "+age);
		System.out.println("My height is: "+height);
	}
	public void sleep() {
		System.out.println("I am going to sleep now..... ");
	}

}
