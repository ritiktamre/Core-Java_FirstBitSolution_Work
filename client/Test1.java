package client;

import programmer.*;
public class Test1 {

	public static void main(String[] args) {
		
		try
		{
			int a = Integer.parseInt(args[0]);
			
			gender g1 = new gender(a);
			g1.allgender();
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		
		catch(AgeException2 ae)
		{
			System.out.println(ae);
		}
		
		finally
		{
			System.out.println("Always execute");
		}
	

	}

}
