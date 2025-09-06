package Collection;

import java.util.*;

class Sales  {
	int id;
	String name1;
	double salary;
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public Sales(int id, String name1, double salary) {
		super();
		this.id = id;
		this.name1 = name1;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName1() {
		return name1;
	}

	void setName1(String name1) {
		this.name1 = name1;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalesM [id=" + id + ", name1=" + name1 + ", salary=" + salary + "]";
	}


	
	
}

public class RitikExe {
	
	

	public static void main(String[] args) {
		
		ArrayList<Sales> s = new ArrayList<Sales>();
		
		
		s.add(new Sales(1,"Akshay",15000));
		s.add(new Sales(-12,"Yogesh",30000));
		s.add(new Sales(23,"Ritik",50000));
		s.add(new Sales(5,"Omkar",20000));
		s.add(new Sales(-890,"Sahil",5000));
		
		System.out.println("---- Before Sorting ----");
		for(Sales s1 : s)
			System.out.println(s1);
		System.out.println();//next like ke liye use kiya h
		
		
		System.out.println("-- After Sorting By Id --");
		
		Collections.sort(s,new IdComparator());
		for(Sales s2 : s)
			System.out.println(s2);
		System.out.println();//next line ke liye use kiya h
		
		System.out.println("-- After Sorting By Name --");
		Collections.sort(s,new Name1Comparator());
		for(Sales s3 : s)
			System.out.println(s3);
		System.out.println();///next line ke liye use kiya h
		
		
		System.out.println("After Sorting by salary");
		Collections.sort(s,new SalaryComparator());
		for(Sales s4 : s)
			System.out.println(s4);
		
	}
}