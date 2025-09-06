package Collection;

import java.util.Map;
import java.util.TreeMap;

class Admin implements Comparable<Admin>
{

	int id;
	String name;
	
	
	Admin(int id,String name)
	{
		this.id = id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}

	@Override
	public int compareTo(Admin o) {
	
		return this.id-o.id;
	}
	
	
}
class MyKey implements Comparable {
	
	int key;
	
	public MyKey(int key)
	{
		this.key =key;
	}

	@Override
	public String toString() {
		return "MyKey=" + key;
	}

	@Override
	public int compareTo(Object o) {
	  MyKey m1 = (MyKey)o;
		return this.key-m1.key;
	}
	
	
}
public class HashMap {

	public static void main(String[] args) {
		Admin a1 = new Admin(45,"Rohit");
		Admin a2 = new Admin(18,"Virat");
		Admin a3 = new Admin(1,"Rahul");
		
		Map m1 = new TreeMap<Integer,String>();
         m1.put(a1, 12);
         m1.put(a2, 54);
         m1.put(a3, 12);
         
         System.out.println(m1);
	}

}
