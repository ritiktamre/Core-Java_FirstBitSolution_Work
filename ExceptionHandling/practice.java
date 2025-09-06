package ExceptionHandling;

import java.util.*;

public class practice {

	public static void main1(String[] args) {
	
		ArrayList l1 = new ArrayList();
		System.out.println(" -- ArrayList Details --");
		l1.add(12);
		l1.add(23);
		l1.add(1);
		l1.add(13);
		
		for( int i =0 ; i< l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
				
		
	}
	
	public static void main2(String[] args) {
		
		LinkedList l1 = new LinkedList();
		System.out.println("-- Linked List Details --");
		l1.add(12);
		l1.add(34);
		l1.add(2);
		l1.add(0);
		l1.add(76);
		
		for( int i =0 ; i < l1.size() ;i++)
		{
			System.out.println(l1.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		TreeSet t1 = new TreeSet();
		System.out.println(" --TreeSet Details -- ");
		t1.add(12);
		t1.add(1);
		t1.add(32);
		t1.add(8);
		t1.add(-23);
		
		System.out.println(t1);
	}

}
