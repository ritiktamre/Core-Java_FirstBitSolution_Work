package client;

import programmer.*;

public class test3 {

	public static void main(String[] args) {
	
		try
		{
			int a = Integer.parseInt(args[0]);
			placedstudent s1 = new placedstudent();
			
			s1.studentloan();
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		
		catch(salaryException se)
		{
			System.out.println(se);
		}
		
		finally
		{
			System.out.println("All time execute");
		}

	}

}
