package ParameterizedConstractor;

class Admin
{
	int id;
	String name;
	double salary;
	int allowance;
	
	Admin(int id,String name,double salary,int allowance)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.allowance=allowance;
	}
	
	Admin()
	{
		this.id=123;
		this.name="RITIK";
		this.salary=12345.67;
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
