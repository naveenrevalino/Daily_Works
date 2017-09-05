package calling_method_from_another_class;

public class Classone {
	public static void main(String[] args) {
		
		/*before calling a method from a different class
		 * we will have to create an instance of the class as shown below.
		 * 
		 * the name of the instance of the class created is add1
		 * then i call the method of class to as add1.performadd and print the result*/
		
		Classtwo add1 = new Classtwo();
		System.out.println("method name is performadd and is called from Classtwo");
		System.out.println("the result of addition performed by the method performadd is:" +add1.performadd());
		
		
		Classthree add2 = new Classthree();
		System.out.println("method name is newadd and is called from Classthree");
		System.out.println("the result of addition performed by the method newadd is:"+add2.newadd(30, 40));
	}

}
