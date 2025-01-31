package collectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(23);
		al.add("Ravi");
		al.add(true);
		al.add(34.32);
		System.out.println(al);
		
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(49.98);
		ll.addAll(al);
		System.out.println(ll);
		
		Vector<Object> v=new Vector<Object>();
		v.add(47.93);
		v.addAll(ll);
		System.out.println(v);
		
		Stack<Object> s=new Stack<Object>();
		s.push("Ravi");
		s.push("Ranjan");
		s.push("Happy");
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		s.addAll(v);
		System.out.println(s);
	}

}
