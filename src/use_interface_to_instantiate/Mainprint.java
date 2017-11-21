package use_interface_to_instantiate;

public class Mainprint {
/**
 * This Class demonstrate how we can instantiate a class using an Interface
 * @param args
 */
	public static void main(String[] args) {
		Iprint  newprint = new PrintImpl();
		// INTERFACEname RefferencevariableName = new The_Class_That_Implemented_The_Interface();
		newprint.hPrint();
		// Refference_Variable . Method_Name();

	}

}
