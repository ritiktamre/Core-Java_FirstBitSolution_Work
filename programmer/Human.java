package programmer;

public class Human {
	int age;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human(int age) {
		super();
		this.age = age;
	}
	
	public void validate() throws age10Exception
	
	{
		if(age <18)
		throw new age10Exception();
	
	else
	{
		System.out.println("Human are allowed ");
	}
	}
}
