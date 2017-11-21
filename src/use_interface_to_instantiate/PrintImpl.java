package use_interface_to_instantiate;
/**
 * Since this class implements the interface Iprint
 * It will force this class to use the methods declared in the interface
 * but you can use your own logic to implement the method, or what it would do.
 * I am just printing a simple sentence to the screen.
 * @author Naveen Ravi
 *
 */
public class PrintImpl implements Iprint {

	@Override
	public void hPrint() {
		System.out.println("This method is implemented from the interface Iprint");
		
	}

}
