package collectionMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class CollectionCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Object> hm=new HashMap<Integer, Object>();
		hm.put(102, "ravi");
		hm.put(101, "ranjan");
		hm.put(201, "happy");
		hm.put(34, 346);
		hm.put(57, true);
		hm.put(85, 36.90);
		hm.put(null, 'a');
		
		System.out.println(hm);
		
		LinkedHashMap<Integer, Object> lhm=new LinkedHashMap<Integer, Object>();
		lhm.put(null, "ravi");
		lhm.put(101, "ranjan");
		lhm.put(201, "happy");
		lhm.put(34, 346);
		lhm.put(57, true);
		lhm.put(85, 36.90);
		lhm.put(23, 'a');
		
		System.out.println(lhm);
		
		IdentityHashMap<Integer, Object> ihm=new IdentityHashMap<Integer, Object>();
		ihm.put(102, "ravi");
		ihm.put(101, "ranjan");
		ihm.put(201, null);
		ihm.put(34, 346);
		ihm.put(57, true);
		ihm.put(85, 36.90);
		ihm.put(null, 'a');
		
		System.out.println(ihm);
		
		TreeMap<Integer, Object> tm=new TreeMap<Integer, Object>();
		tm.put(102, "ravi");
		tm.put(101, null);
		//tm.put(null, "happy");
		tm.put(34, 346);
		tm.put(57, true);
		tm.put(85, 36.90);
		tm.put(23, 'a');
		System.out.println(tm);
		
		WeakHashMap<Integer, Object> whm=new WeakHashMap<Integer, Object>();
		whm.put(102, "ravi");
		whm.put(101, "ranjan");
		whm.put(201, "happy");
		whm.put(34, 346);
		whm.put(57, true);
		whm.put(null, 36.90);
		whm.put(23, 'a');
		
		System.out.println(whm);
		
	}

}
