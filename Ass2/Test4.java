package Ass2;

class Admin
{
	int id;
	String name;
	double salary;
	int allowance;
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
	int getAllowance() {
		return allowance;
	}
	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	void display()
	{
		System.out.println("This is the Id="+getId());
		System.out.println("This is the Name="+getName());
		System.out.println("This is the Salary="+getSalary());
		System.out.println("This is the Allowance="+getAllowance());
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Admin a1;
		a1=new Admin();
		
		a1.setId(123);
		a1.setName("Rohan");
		a1.setSalary(23456.67);
		a1.setAllowance(2000);

		a1.display();
	}

}

