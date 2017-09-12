package interface_abstract_methods;

public class Zoo {

	public static void main(String[] args) {
		Sparrow little = new Sparrow("Sparrow", "blue", 2, 7);
		little.talk();
		little.fly();
		little.eat();
		little.sleep();
		
		Chicken chicken1 = new Chicken("Chicken", "White", 2, 1);
		chicken1.talk();
		chicken1.fly();
		chicken1.eat();
		chicken1.sleep();
		

	}

}
