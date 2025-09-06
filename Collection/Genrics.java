package Collection;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable
{
	int id ;
	String name;
	
	
	Person(int id,String name)
	{
		this.id = id;
		this.name=name;
	}
	


	@Override
	public boolean equals(Object obj) {
		Person p1 =(Person)obj;
		if (p1.id == this.id)
			return true;
		
		else
		return false;
		
	}


	public String toString()
	{
		return "Id ="+id + ", Name ="+name;
	}

	@Override
	public int compareTo(Object o) {
		Person p1 = (Person)o;///downcast
		return this.id-p1.id;
	}
}
public class Genrics {

	public static void main(String[] args) {
		
        TreeSet<Person> personlist = new TreeSet<Person> ();
        
        personlist.add(new Person(100,"Rahul"));
        personlist.add(new Person(10,"Ritik"));
        personlist.add(new Person(30,"Ravindra"));
        personlist.add(new Person(400,"Rinku"));
        
        for(Person p1 : personlist)
        {
        	System.out.println(p1);
        }
        
        if(personlist.contains(new Person(100,"Ritik")))
        {
        System.out.println("Found");
        }
        else
        {
        	System.out.println("Not Found");
         }
       }

}
