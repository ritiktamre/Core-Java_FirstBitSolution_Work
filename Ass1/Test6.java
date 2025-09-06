package Ass1;

class Employee
{
	int empID;
	int age;
	int yearOfExperience;
	
	void display()
	{
		System.out.printf("EMPID=%d AGE=%d EXPERIENCE=%d",this.empID,this.age,this.yearOfExperience);
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Employee e1;
		e1=new Employee();
		
		e1.empID=2004;
		e1.age=27;
		e1.yearOfExperience=3;
		
		e1.display();
		
		
	}

}

