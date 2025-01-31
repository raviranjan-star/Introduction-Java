package collectionFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(89);
		pq.add(81);
		pq.add(99);
		System.out.println(pq);
		
		ArrayDeque<Object> aq=new ArrayDeque<Object>();
		aq.add(89);
		aq.add(81);
		aq.add(99);
		System.out.println(aq);
		
		Deque<Integer> d=new LinkedList<Integer>();
		d.add(89);
		d.add(81);
		d.add(99);
		System.out.println(d);
	}

}
