package ExceptionHandling;

class gender1
{
	int age ;
	
	gender1(int a)
	{
		this.age=a;
		
	}

	@Override
	public String toString() {
		return "Male is ready to eligible";
	}
	
	
}//class gender1 ends here

class AgeException3 extends Exception
{

	@Override
	public String toString() {
		return "Male is not ready to eligible";
	}
	
}//class AgeException3 ends here
public class practice1 {

	public static void main(String[] args) {
	
       try
       {
    	   int a = Integer.parseInt(args[0]);
    	   
    	   if(a< 18)
    	   {
    		   throw new AgeException3();
    	   }
    	   else
    		   
    	   {
    		   gender1 g1 =new gender1(a);
    		   System.out.println(g1);
    	   }
       }   
    	   catch(AgeException3 ae)
    	   {
    		   System.out.println(ae);
    	   }
    	   
    	   catch(Exception e)
    	   {
    		   System.out.println("Something went wrong");
    	   }
        
	}

}
