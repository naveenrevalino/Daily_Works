package arraylist;

import java.util.ListIterator;
import java.util.ArrayList;
public class ArrayListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> refvar = new ArrayList <String>();
		refvar.add(0,"Praveen");
		refvar.add(1, "Soody");
		refvar.add(2, "Naveen");
		refvar.add(3, "Samreena");
		
		ListIterator<String> itr =  refvar.listIterator();
		
		while (itr.hasNext()) {// Traversing Element's in forward direction.
			System.out.println(itr.next());
		}
		
		System.out.println("**********");
		System.out.println(refvar.get(2));
		System.out.println("**********");
				
		while (itr.hasPrevious()) {// Traversing Element's in reverse direction.
			System.out.println(itr.previous());
		}
		

	}

}
