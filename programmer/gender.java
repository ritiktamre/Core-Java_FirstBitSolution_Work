package programmer;

public class gender
{
	int age;
	
	public gender(int age) {
		// TODO Auto-generated constructor stub
	   this.age =age;
	}

	public void allgender()throws AgeException2
	{
		if( age <= 18)
		{
			throw new AgeException2();
		}
		else
		{
		System.out.println("Male is ready to marry");
		}
	}
}
