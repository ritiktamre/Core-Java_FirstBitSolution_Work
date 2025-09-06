package client;

import programmer.Human;
import programmer.age10Exception;

public class Test4 {

	public static void main(String[] args) {
		try
		{
			int a = Integer.parseInt(args[0]);
			Human h1 = new Human(a);
			h1.validate();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		
		catch(age10Exception a)
		{
			System.out.println(a);
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}

	}

}
