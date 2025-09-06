package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Admin implements Serializable
{
	int id;
	String name;
	double salary;
	double allowance;
	
	Admin(int id,String name,double salary,double allowance)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.allowance=allowance;
	}
	
	public String toString()
	{
		return "Id =" +id +", Name ="+name + ", Salary =" +salary + ", Allowance =" +allowance ;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("mydata1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Admin a1 = (Admin)ois.readObject();
			System.out.println(a1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		
		Admin a1 = new Admin(100,"Rahul",20000,2500);
		try
		{
			FileOutputStream fis = new FileOutputStream("mydata1.txt");
			ObjectOutputStream oos = new  ObjectOutputStream(fis);
			oos.writeObject(a1);
			
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{	
			e.printStackTrace();
		}
	

	}

}
