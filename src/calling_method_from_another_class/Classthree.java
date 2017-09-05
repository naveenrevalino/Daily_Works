package calling_method_from_another_class;

public class Classthree {
	
	/*1. create a method called newadd 
	 *2. instead of initializing the variables before creating the method, i am passing it in the method as arguments
	 *3. add the value of "a" and "b" and store it in "c"
	 *4. here the values of "a" and "b" will be mentioned while calling the method in another class*/
	
	
	public int newadd(int a, int b) {
		int c = a+b;
		return c;
	}

}
