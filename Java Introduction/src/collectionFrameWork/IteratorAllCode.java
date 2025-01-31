package collectionFrameWork;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IteratorAllCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(23);
		al.add("Ravi");
		al.add(true);
		al.add(34.32);
		System.out.println(al);
		
		ListIterator<Object> litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(null);
		hs.add("Ravi");
		hs.add("tiger");
		hs.add(34.32);
		System.out.println(hs);
		
		Iterator<Object> hsitr=hs.iterator();
		while( hsitr.hasNext())
		{
			System.out.println( hsitr.next());
		}
		
		Stack<String> s=new Stack<String>();
		s.push("Ravi");
		s.push("Ranjan");
		s.push("Happy");
		
		Enumeration<String> e =s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
