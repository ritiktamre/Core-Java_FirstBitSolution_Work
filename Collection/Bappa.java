package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	
}

public class Bappa {
  
	public static void main(String[] args) {
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(new Employee(12,"Radhe",30000));
		a1.add(new Employee(13,"Shyam",40000));
		a1.add(new Employee(1,"Kahna",25000));
		a1.add(new Employee(5,"MereShyam",35000));
		
		System.out.println("-- Before Sorting --");
		for(Employee e : a1)
		System.out.println(e);
		
		System.out.println();//next line
		System.out.println("--- After Sorting By Id ---");
		Collections.sort(a1,new IdComparator25());
		for(Employee e1 : a1)
		{
			System.out.println(e1);
		}
		
		System.out.println();//next line
		System.out.println("--- After Sorting By Name ---");
		Collections.sort(a1,new NameComparator25());
		for(Employee e2 : a1)
		{
			System.out.println(e2);
		}
		
		System.out.println();//next line
		System.out.println("--- After Sorting By Salary ---");
		Collections.sort(a1,new SalaryComparator25());
		for(Employee e3 : a1)
		{
			System.out.println(e3);
		}
		
		
	}
	
}
