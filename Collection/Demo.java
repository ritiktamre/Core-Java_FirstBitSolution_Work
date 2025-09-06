package Collection;

import java.util.*;

public class Demo {

	public static void main1(String[] args) {
		
		List r1 = new ArrayList();
		System.out.println("-- Array List--");
		r1.add(12);
	   r1.add(10);
	   r1.add(20);
	   r1.add(36);
	   r1.add(9);
	   
	   System.out.println(r1);
	   for( int i =0 ; i < r1.size() ; i++)
	   {
		   System.out.println(r1.get(i));
	   }
	}
	
	public static void main2(String[] args) {
		
		List a1 = new ArrayList();
		System.out.println("--Linked List--");
		a1.add(5);
		a1.add(16);
		a1.add(2);
		a1.add(0);
		
		System.out.println((a1));
		for( int i=0 ; i < a1.size() ;i++)
		{
			System.out.println(a1.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeSet r1 = new TreeSet();
		System.out.println("Tree set");
		r1.add(12);
		r1.add(0);
		r1.add(-23);
		r1.add(56);
		r1.add(47);
		
		System.out.println(r1);
//		for( int i = 0 ; i < r1.size() ;i++)
//		{
//			System.out.println(r1.get(i));
//		}
	}

}
