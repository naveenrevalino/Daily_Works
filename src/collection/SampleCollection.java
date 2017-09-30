package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleCollection {
	public String a;
	public List<String> newone;
	
	public void creatingArray() {
		List <String> mylist = new ArrayList<String>();//List is being created here.
		mylist.add("Naveen");//Adding objects into the list
		mylist.add("Praveen");
		mylist.add("Samreena");
		mylist.add("Soody");
		newone = mylist;
		
		
		//Iterator<String> a = mylist.iterator();
		//while(a.hasNext()){
			 //System.out.println(a.next());
		//}
	
		
	}
	public void iterate() {
		Iterator<String> a = newone.iterator();
		while(a.hasNext()) {
			String itr = a.next();
			System.out.println(itr);
		}
		
		
	}


}
