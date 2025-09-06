package Collection;
import java.util.*;

class Student 
{
	int rollNo;
	String name;
	
	Student(int rollNo, String name) {
	
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString()
	{
		return "Roll NO ="+rollNo + ", Name =" +name;
	}
	
}
public class ClassHomework {

	public static void main1(String[] args) {
		
		List<Integer> namelist = new ArrayList<Integer> ();
		namelist.add(11);
		namelist.add(13);
		namelist.add(00);
		namelist.add(-12);
		
		for(Integer i : namelist)
			System.out.print(" "+i);
	}
	
	
	public static void main(String[] args) {
		
	List<String> namelist = new ArrayList<String>();
		namelist.add("Rahul");
		namelist.add("Ram");
		namelist.add("Raju");
		
		for( String i : namelist)
		{
			System.out.println(i);
		}
	}

}
