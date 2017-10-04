package collection;
import java.util.*;

public class CollectionMap {
	//public static void main(String[] args) {
	public Map<Integer, String> newmap;
public void createMap() {
	
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Naveen");
		map.put(2,"Praveen");
		map.put(3,"Gowri");
		map.put(4,"Samreena");
		map.put(5,"Soody");
		map.put(6,"Ravi");
		newmap = map;
		
		}
public void iterateMap() {
	for(Map.Entry m:newmap.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());
	}
}
	
}

