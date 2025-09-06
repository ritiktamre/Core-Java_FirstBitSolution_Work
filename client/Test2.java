package client;

import programmer.Person;
import programmer.workException;

public class Test2 {

	public static void main(String[] args) {
		
		try
		{
			int a = Integer.parseInt(args[0]);
			
			Person p1 = new Person(a);
			p1.allowed();
			
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		
		catch(workException we)
		{
			System.out.println(we);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
