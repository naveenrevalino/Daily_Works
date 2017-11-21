package Why_to_use_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * Class Name: Test.
 * This class will demonstrate the use of an Interface.
 * check the below Java Doc link to understand it better
 * Link: https://docs.oracle.com/javase/8/docs/api/java/util/List.html?is-external=true
 * 
 * Interface List <E>
 * Superinterfaces/parent classes are : Collection<E>, Iterable<E>
 * Known implementing classes :     AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector
 * 
 * @author Naveen Ravi
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 2: Create an Array List and call the method Sample to iterate it.
		List <String> newvar = new ArrayList <String>();
		newvar.add(0, "Naveen");
		newvar.add(1, "Praveen");
		Sample(newvar);
		
		//Step 3: Create a Linked List and call the same iterating method created below.
		List <String> oldvar = new LinkedList <String>();
		oldvar.add(0, "Soody");
		oldvar.add(1, "Ravi");
		Sample(oldvar);
	}
	/*
	 * Step 1: create this method and pass an argument of type List
	 */
	public static void Sample(List<String> newone) {
		Iterator<String> a = newone.iterator();
		while(a.hasNext()){
		System.out.println(a.next());
		}
	}

}
