package inheritance_method_overriding;


public class Zoo {
	public static void main(String[] args) {
		
		Animal cat = new Animal("cat", "orange", 4, 100);
		cat.talk();
		cat.eat();
		cat.sleep();	
		
		Fish gold = new Fish("Gold Fish", "Black", 0, 3);
		gold.talk();
		gold.swim();
		gold.eat();
		gold.sleep();
		
		Bird little = new Bird("Sparrow", "blue", 2, 7);
		little.talk();
		little.fly();
		little.eat();
		little.sleep();
	}


}

