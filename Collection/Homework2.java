package Collection;

import java.util.*;

class Student3 
{
	int roll;
	String name;
	double marks;
	
	Student3(int roll,String name,double marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student3 [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


}

public class Homework2 {

	public static void main(String[] args) {
		
		ArrayList<Student3> s1 = new ArrayList<Student3>();
         s1.add(new Student3(1,"Rahul",75));
         s1.add(new Student3(18,"Rohit",70));
         s1.add(new Student3(45,"Virat",90));
         s1.add(new Student3(10,"Sachin",95));
         
         System.out.println("Before sort");
         for(Student3 l1:s1)
         {
        	
        	 System.out.println(l1);
         }
         
         
       Collections.sort(s1,new RollComparator());
       System.out.println("After Sort");
       for(Student3 a1:s1)
       {
    	   System.out.println(a1);
       }
       
       Collections.sort(s1,new NameComparator());
       System.out.println("After Sort");
       for(Student3 a2:s1)
       {
    	   System.out.println(a2);
       }
       
       Collections.sort(s1,new MarkComparator());
       System.out.println("After Sort");
       for(Student3 a3:s1)
       {
    	   System.out.println(a3);
       }
       
     
	}

}
