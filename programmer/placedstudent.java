package programmer;

public class placedstudent
{
	int salary;
	
	public void placesstudent(int salary)
	{
		this.salary = salary;
	}
	
	public  void studentloan() throws salaryException
	{
		if(salary >= 700000)
		{
			throw new salaryException();
		}
		else
			
		{
			System.out.println("your loan is allowed by 4 lakh");
		}
	}
	
}