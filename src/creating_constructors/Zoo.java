package creating_constructors;

public class Zoo {
	public static void main(String[] args) {
		Animals lion = new Animals("Lion", "orange", 4, 100);
		lion.bark();
		lion.swim();
		lion.run();		
	}

}
