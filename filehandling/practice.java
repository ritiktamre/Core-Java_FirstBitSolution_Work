package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SalesM implements Serializable
{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	public SalesM(int id, String name, double salary, double incentive, int target) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive + ", target="
				+ target ;
	}
		
}
public class practice {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis = new FileInputStream("radhe.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SalesM s1 = (SalesM)ois.readObject();
			System.out.println(s1);
			
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch
		(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		SalesM s1 = new SalesM(10,"Rahul",30000,3000,30);
		try 
		{
			FileOutputStream fos = new FileOutputStream("radhe.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println(s1);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
