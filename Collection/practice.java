package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

//import filehandling.Employee;

class Student10 implements Comparable<Student10>
{
	int roll;
	String name;
	double salary;
	
	Student10(int roll,String name,double salary)
	{
		this.roll=roll;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return " roll=" + roll + ", name=" + name + ", salary=" + salary ;
	}

	@Override
	public int compareTo(Student10 o) {
		
		return o.roll-this.roll;
	}

	

	@Override
	public boolean equals(Object obj) {
		Student10 s1 = (Student10)obj;
		if (this.roll == s1.roll)
			return true;
		else
			return false;
		
	}
	

}

public class practice {
public static void main(String[] args) {
	HashSet<Student10> studentlist = new HashSet<Student10>();
	  studentlist.add(new Student10(10,"Ritik",78));
      studentlist.add(new Student10(2,"Akshay",74));
      studentlist.add(new Student10(4,"Omkar",66));
      studentlist.add(new Student10(14,"Pradip",68));
      studentlist.add(new Student10(5,"Yogesh",83));
	
      for(Student10 s1 : studentlist)
    	  System.out.println(s1);
      
      if(studentlist.contains(new Student10(10,"Ririk",12)))
      System.out.println("Found");
      else
    	  System.out.println("Not Found");
}

}
