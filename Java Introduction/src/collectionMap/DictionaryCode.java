package collectionMap;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Dictionary<Object, Object> d = new Hashtable<>();

	        // Adding key-value pairs
	        d.put("A", 25);
	        d.put("B", 30);
	        d.put(67, null);
	        //d.put(null, 78);

	        // Retrieving a value using a key
	        System.out.println(d); 
		
	}

}
