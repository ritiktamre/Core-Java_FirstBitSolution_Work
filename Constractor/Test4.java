package Constractor;

class HR
{
	int id;
	String name;
	double salary;
	int commision;
	
	HR()
	{
		this.id=54;
		this.name="Santanu";
		this.salary=34567.89;
		this.commision=5000;
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

	int getCommision() {
		return commision;
	}

	void setCommision(int commision) {
		this.commision = commision;
	}
	
	void display()
	{
		System.out.println("ID="+getId());
		System.out.println("NAME="+getName());
		System.out.println("SALARY="+getSalary());
		System.out.println("COMMISION="+getCommision());
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		HR h1;
		h1=new HR();
		
		h1.display();

	}

}
