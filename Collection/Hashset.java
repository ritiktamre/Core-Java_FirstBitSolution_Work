package Collection;

import java.util.HashSet;
import java.util.Objects;

class SalesM implements Comparable {
	int id;
	String name;
	
	SalesM(int id,String name)
	{
		this.id = id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		SalesM s1 = (SalesM)obj;
		if (this.id == s1.id)
			return true;
		else
			return false;
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	public String toString()
	{
		return "Id ="+id + ",Name ="+name;
	}

	@Override
	public int compareTo(Object o) {
		SalesM s1 = (SalesM)o;
		return s1.id-this.id;
	}

}

public class Hashset {

	public static void main(String[] args) {
	
		HashSet<SalesM> smhashset = new HashSet<SalesM>();
		
		smhashset.add(new SalesM(100,"Ritik"));
		smhashset.add(new SalesM(10,"Omkar"));
		smhashset.add(new SalesM(200,"Akshay"));
		smhashset.add(new SalesM(21,"Pratik"));
		smhashset.add(new SalesM(1,"Sahil"));
		
		for(SalesM s1 :smhashset)
		{
			System.out.println(s1);
		}

	}

}
