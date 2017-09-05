package calling_method_from_another_class;

public class Classtwo {
	
	
	/*1. initialize 3 variables
	* 2. create a new method called perform add
	* 3. add values of "a" and "b"
	* 4. store the result in "c" */
	
	
	int a = 10;
	int b = 20;
	int c = 0;
	public int performadd() {
		int c = a + b;
		return c;
		}

}
