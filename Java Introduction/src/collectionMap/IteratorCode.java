package collectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Object> tm=new TreeMap<Integer, Object>();
		tm.put(102, "ravi");
		tm.put(101, null);
		//tm.put(null, "happy");
		tm.put(34, 346);
		tm.put(57, true);
		tm.put(85, 36.90);
		tm.put(23, 'a');
		System.out.println(tm);
		
		Iterator<?> itr=tm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		TreeMap<Integer, String> tm1=new TreeMap<Integer, String>();
		tm1.put(102, "ravi");
		tm1.put(101, "ranjan");
		//tm.put(null, "happy");
		tm1.put(34, "happy");
		tm1.put(57, "pankaj");
		tm1.put(85, "ram");
		tm1.put(23, "rajeev");
		
		Iterator<Map.Entry<Integer, String>> itr1=tm1.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, String> entry=itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
