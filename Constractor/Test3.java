package Constractor;

class Admin
{
	int id;
	String name;
	double salary;
	int allowance;
	
	Admin()
	{
		this.id=67;
		this.name="Ritik";
		this.salary=23456.78;
		this.allowance=3000;
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

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		System.out.println("ID="+getId());
		System.out.println("NAME="+getName());
		System.out.println("SALARY="+getSalary());
		System.out.println("ALLOWANCE="+getAllowance());
	}
}

public class Test3 {

	public static void main(String[] args) {
		Admin a1;
		a1=new Admin();
		
		a1.display();

	}

}
