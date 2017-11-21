package array_size;

public class ArraySize {
/**
 * In this program, first i create an ARRAY of size [3]
 * then added 3 strings to it.
 * then i iterate it using the for loop and print it.
 * After which i try to add a 4th element into the Array to see what error it would throw.
 * 
 * ERROR:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at array_size.ArraySize.main(ArraySize.java:19)
	
	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] refvar = new String[3];
		refvar[0] = "Naveen";
		refvar[1] = "Praveen";
		refvar[2] = "Samreena";
		//refvar[3] = "Soody";
		
		
		for (int i=0; i<refvar.length; i++) {
		System.out.println(refvar[i]);	
		}
	}

}
