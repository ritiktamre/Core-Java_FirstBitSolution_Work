package filehandling;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Employee implements Serializable
{
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "\n ID =" +id + ", Name =" +name + ", Salary =" +salary; 
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File f1 = new File("Ritik.txt");
		ArrayList<Employee> emplist = new ArrayList<Employee>();
//		FileInputStream fis = new FileInputStream(f1);
//		ObjectInputStream ois = new ObjectInputStream(fis);
		
//        emplist = (ArrayList<Employee>) ois.readObject();
        
		int a;
//		File f1 = new File("Ritik.txt");
		
		
		do {
			System.out.println("Enter choice \n 1 . Add Data \n 2. Read Data");
			
			a= sc.nextInt();
			switch(a)
			{
			case 1:
            System.out.println("Enter Roll No :");
            int roll=sc.nextInt();
            
            System.out.println("Enter Name :");
            String name = sc.next();
            
            System.out.println("Enter Marks :");
            double marks = sc.nextDouble();
			
            emplist.add(new Employee(roll,name,marks));
                  try
                  {
                   FileOutputStream fos = new FileOutputStream(f1);
                   ObjectOutputStream oos = new ObjectOutputStream(fos);
                   oos.writeObject(emplist);
                  }
                  catch(IOException e)
                  {
                	  e.printStackTrace();
                  }
				break;
				
			case 2:
                   
				try
				{
					FileInputStream fis = new FileInputStream(f1);
					ObjectInputStream ois = new ObjectInputStream(fis);
//					Employee e1 =(Employee)ois.readObject();
//				    System.out.println(e1);
					{

			            emplist = (ArrayList<Employee>) ois.readObject();

			            System.out.println("Employee List:");
			            for (Employee emp : emplist) {
			                System.out.println(emp);
			            }
				}
			}	
				catch(ClassNotFoundException e)
				{
				    e.printStackTrace();
				}
				
				catch(IOException e)
				{
					e.printStackTrace();
				}

			   }
			
		 }
		while( a !=0);
	 }

}


