package programmer;

public class voter1 {
    
	int age ;
	
	public voter1(int a)
	{
		this.age = a;
    }
	
	public void validate() throws AgeException2
	{
		if(age < 18)
		{
			throw new AgeException2();
		}
		
		else
		{
			System.out.println("your age is :"+age);
		}
	}
}
