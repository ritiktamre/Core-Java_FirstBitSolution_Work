package FunctionOverLoading;

class Student {
	int rollno;
	String name;
	double percentage;
}

class Employee {
	int id;
	String name;
	double annualSalary;
}

class Bank
{
	void studentloan(Student s1)
	{
		if (s1.percentage >= 80) 
		{
			System.out.println("Loan approved by 2 lakh");
		}
		else

		if (s1.percentage >= 60)
		
		{
			System.out.println("Loan approved by 1 lakh");
		} 
		else

		if (s1.percentage >= 50)
		{
			System.out.println("Loan approved by 50 k");
		}
		else

		if (s1.percentage <= 40)
		{
			System.out.println("Loan not approved");
		}
	}

	void employeeloan(Employee e1)
	{
		if (e1.annualSalary >= 1200000)
		{
			System.out.println("Loan approved by 700000");
		}
		else

		if (e1.annualSalary >= 10) {
			System.out.println("Loan approved by 600000");
		} 
		else

		if (e1.annualSalary >= 6) 
		{
			System.out.println("Loan approved by 500000");
		}
		else

		if (e1.annualSalary >= 400000)
		{
			System.out.println("Loan approved by 400000");
		} 
		else

		if (e1.annualSalary <= 400000) 
		{
			System.out.println("Loan not approved");
		}

	}
}

public class Que3 
{

	public static void main(String[] args)
	{

		Student s1 = new Student();

		s1.rollno = 120;
		s1.name = "ritik";
		s1.percentage = 77;

		Bank b = new Bank();
		b.studentloan(s1);

		Employee e1 = new Employee();

		e1.id = 100;
		e1.name = "Rahul";
		e1.annualSalary = 700000;

		b.employeeloan(e1);
	}

}
