package collectionMap;

import java.util.Hashtable;
import java.util.Properties;

public class HashTableCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Object> ht=new Hashtable<Integer, Object>();
		ht.put(102, "ravi");
		ht.put(104, "ranjan");
		ht.put(94,98);
		ht.put(12, 'a');
		System.out.println(ht);
		
		Properties p=new Properties();
		p.put(38, "happy");
		p.put(23, "happy");
		p.put(67, 84.98);
		p.put(43, "happy");
		System.out.println(p);
	}

}
