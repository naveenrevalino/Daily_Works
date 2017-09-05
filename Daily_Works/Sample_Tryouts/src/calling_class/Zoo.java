package calling_class;

public class Zoo {

	public static void main(String[] args) {
		
		Animal myage = new Animal();
		System.out.println(myage.age(10));System.out.println("Year's old.");
		Animal myname = new Animal();
		System.out.println(myname.name("Lion"));System.out.println("is my NAME.");
		Animal legs = new Animal();
		System.out.println(legs.numberoflegs(4)); System.out.println("is the number of legs i have");

	}

}
