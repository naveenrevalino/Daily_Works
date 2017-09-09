package creating_constructors;

public class Zoo {
	public static void main(String[] args) {
		Animals lion = new Animals("Lion", "orange", 4, 100);
		lion.talk();
		lion.eat();
		lion.sleep();	
		
		Fish fish1 = new Fish();
		fish1.swim();
		Bird bird1 = new Bird();
		bird1.fly();
		
	}


}
