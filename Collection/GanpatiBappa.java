package Collection;

import java.util.ArrayList;
import java.util.Collections;

class SM {
	
	int id;
	String name;
	double salary;
	double incentive;
	
	
	public SM() {
		// TODO Auto-generated constructor stub
	}


	public SM(int id, String name, double salary, double incentive) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
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


	public double getIncentive() {
		return incentive;
	}


	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive ;
	}
	
	
}

public class GanpatiBappa {
    
	public static void main(String [] args)
	{
		 ArrayList<SM> a1 = new ArrayList<SM>();
		 a1.add(new SM(1,"Radhe",30000,30));
		 a1.add(new SM(2,"Shyam",35000,35));
		 a1.add(new SM(12,"MahaMai",20000,12));
		 a1.add(new SM(8,"Kahna",15000,23));
		 a1.add(new SM(23,"Bappa",40000,2));
		 
		 System.out.println("--Before Sorting ---");
		 for(SM s :a1)
		 {
			 System.out.println(s);
			
		 }
		 
		 System.out.println();//can be used for next line
		 System.out.println("--- After Sorting By ID ---");
		 Collections.sort(a1,new IdComparable29());
		 for(SM s1 : a1)
		 {
			 System.out.println(s1);
		 }
		 
		 System.out.println();//can be used for next line 
		 System.out.println("--- After Sorting by Name ---");
		 Collections.sort(a1,new NameComparator28());
		 for(SM s2 : a1)
		 {
			 System.out.println(s2);
		 }
		 
		 System.out.println();//cab be used for next line
		 System.out.println("--- After Sorting By Salary ---");
		 Collections.sort(a1,new SalaryComparator28());
		 for(SM  s3 : a1)
		 {
			 System.out.println(s3);
		 }
		 
		 
		 System.out.println();//can be used for next line
		 System.out.println("--- After Sorting By Incentive ---");
		 Collections.sort(a1,new IncentiveComparator28());
		 for(SM s4 : a1)
			 System.out.println(s4);
	}
}
