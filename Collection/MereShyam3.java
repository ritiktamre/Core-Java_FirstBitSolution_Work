package Collection;

import java.util.ArrayList;
import java.util.Collections;

class SalesManager {
	
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
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

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive
				+ ", target=" + target + "]";
	}
	
	
}

public class MereShyam3 {

	public static void main(String[] args) {
		
		ArrayList<SalesManager> a1 = new ArrayList<SalesManager>();
		a1.add(new SalesManager(1,"Ram",30000,3000,20));
		a1.add(new SalesManager(34,"Krishna",10000,1345,34));
		a1.add(new SalesManager(3,"MahaMai",50000,400,4));
		a1.add(new SalesManager(4,"Gajanan",60000,134,89));
		a1.add(new SalesManager(54,"Shivji",25000,4321,134));
		
		System.out.println("-- Before sorting --");
		for(SalesManager s : a1)
		{
			System.out.println(s);
		}
		System.out.println();//next line ke liye use kiya h
		
		System.out.println("--After Sorting by Id --");
		Collections.sort(a1,new Id3Comparator());
		for(SalesManager s1 :a1)
		{
			System.out.println(s1);
		}
		System.out.println();//next line ke liye use kiya h
		
		System.out.println("-- After Sorting by Name --");
		Collections.sort(a1,new Name3Comparator());
		for(SalesManager s2 : a1)
		{
			System.out.println(s2);
		}
		System.out.println();//next line ke liye use kiya h
		
		System.out.println("-- After Sorting by Salary --");
		Collections.sort(a1,new Salary3Comparator());
		for(SalesManager s3 : a1)
		{
			System.out.println(s3);
		}
		System.out.println();//next line ke liye use kiya h

	}

}
