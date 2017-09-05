package create_constructor;

public class Human {
	/* going to give some behavior for the human's */
	String name;
	String eyecolor;
	int age;
	int height;
	
	/*This is my constructor
	 * it will not have a return type unlike other methods*/
	public Human() {
		
	}
	
	/* Then create a method called speak, the human we create will speak out the above behaviors*/
	public void speak() {
		System.out.println("Hi !! my name is: "+name);
		System.out.println("The color of my eye is: " +eyecolor);
		System.out.println("My age is: "+age);
		System.out.println("and my height in cm is: "+height);
	}
	/*i am creating a few other methods that will talk about the behavior of the human*/
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking....");
	}
	
	/* all of these methods above are the behaviors of human object, but we need a special method to create them
	 * so i am going to create a special method called constructor, which will have the same name as my class
	 * it is in this method all the humans are going to be created.*/
	
	

}
