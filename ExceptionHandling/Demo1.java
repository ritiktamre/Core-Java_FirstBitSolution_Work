package ExceptionHandling;

class Voter
{
   int age;
   
   
   Voter(int a)
   {
	  this.age=a;
   }
@Override
public String toString() {
	return "your age is:"+age;
}
   
   
}///class Voter ends here

class AgeException1 extends Exception
{

	@Override
	public String toString() {
		return"You are not eligible to ready for voting";
	}
	
}///class AgeException1 ends here

public class Demo1 {

	public static void main(String[] args) {
    
		try
		{
			int a = Integer.parseInt(args [0]);
			
			if(a < 19)
			{
				throw new AgeException1();
			}
			else
			{
				Voter v1 = new Voter(a);
				System.out.println(v1);
			}
		}
		catch(AgeException1 ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			System.out.println("Some thing went wrong");
		}
 
	}
}
