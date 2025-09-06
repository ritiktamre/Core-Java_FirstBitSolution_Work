package Constractor;

class SalesManager
{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
	
	SalesManager()
	{
		this.id=1234;
		this.name="Ritik";
		this.salary=12345.67;
		this.incentive=2000;
		this.target=5;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	int getIncentive() {
		return incentive;
	}

	void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{
		System.out.println("ID="+getId());
		System.out.println("NAME="+getName());
		System.out.println("SALARY="+getSalary());
		System.out.println("INCENTIVE="+getIncentive());
		System.out.println("TARGET="+getTarget());
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		SalesManager s1;
		
		s1=new SalesManager();
		s1.display();

	}

}
