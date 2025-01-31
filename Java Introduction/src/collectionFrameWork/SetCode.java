package collectionFrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(23);
		hs.add("Ravi");
		hs.add(true);
		hs.add(34.32);
		System.out.println(hs);
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add(null);
		lhs.addAll(hs);
		System.out.println(lhs);
		
		TreeSet<Object> ts=new TreeSet<Object>();
		//ts.add(null);
		ts.add(34);
		ts.add(89);
		ts.add(49);
		ts.add(82);
		ts.add(98);
		
		System.out.println(ts);
	}

}
