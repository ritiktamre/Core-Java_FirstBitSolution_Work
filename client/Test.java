package client;

import programmer.*;

public class Test {

	public static void main(String[] args) {
		
		try
		{
			int a = Integer.parseInt(args[0]);
			voter1 v1 = new voter1(a);
			
			v1.validate();
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
			System.out.println("Ye hamesha execute hoga");
		}

	}

}
