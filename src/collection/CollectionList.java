package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class CollectionList {
	public String a;
	public List<String> newone;
	
	public void creatingArray() {
		List <String> mylist = new ArrayList<String>();//List is being created here.
		mylist.add("Naveen");//Adding objects into the list
		mylist.add("Praveen");
		mylist.add("Samreena");
		mylist.add("Soody");
		mylist.add("Array");
		mylist.add("Base");
		mylist.add("Color");
		newone = mylist;
		
		
		
		//Iterator<String> a = mylist.iterator();
		//while(a.hasNext()){
			 //System.out.println(a.next());
		//}
	
		
	}
	public void iterateList() {
		
		Iterator<String> a = newone.iterator();//Using the Iterator method to print out the List
		
		while(a.hasNext()) {
			String itr = a.next();
			System.out.println(itr);
		}
		
		
	}
	
	public void sorting1() {
		Collections.sort(newone);
		
	}
	
	public void sorting2() {
		Collections.reverse(newone);
	}


}
