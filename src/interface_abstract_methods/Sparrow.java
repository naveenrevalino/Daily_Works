package interface_abstract_methods;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, String color, int numberoflegs, int age) {
		super(name, color, numberoflegs, age);

	}

	@Override
	public void fly() {
		System.out.println("Sparrow is flyingg high ... high");
		
		
	}
	

}
