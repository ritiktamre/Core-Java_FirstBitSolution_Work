package Collection;

import java.util.*;

public class Collection06 {

	public static void main1(String[] args) {
		List l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(4);
		l1.add(11);
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		

	}
	
	public static void main(String[] args)
	{
		TreeSet a1 = new TreeSet();
		a1.add(5);
		a1.add(10);
		a1.add(1);
		a1.add(22);
		a1.add(06);
		
		System.out.println(a1);
		
	}

}
