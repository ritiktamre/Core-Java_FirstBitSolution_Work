package Ass2;

class Employee
{
	int id;
	String name;
    double salary;
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
	
	void display()
	{
		System.out.println("This is the Id="+getId());
		System.out.println("This is the Name="+getName());
		System.out.println("This is the Salary="+getSalary());
	}
	
    
}

public class Test3 {

	public static void main(String[] args) {
		
		Employee e1;
		e1=new Employee();
		
		e1.setId(123);
		e1.setName("Rahul");
		e1.setSalary(23456.56);
		
		e1.display();
		
		

	}

}

