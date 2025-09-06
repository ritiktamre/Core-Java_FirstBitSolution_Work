package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Vehicle
{
	int brand;
	String vecName;
	
	public Vehicle(int brand, String vecName) {
		
		this.brand = brand;
		this.vecName = vecName;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ",  Vec Name=" + vecName;
	}
	
	
}
public class MereShyam {

	public static void main(String[] args) {
		ArrayList<Vehicle> veclist=new ArrayList<Vehicle>();
		veclist.add(new Vehicle(2003,"Swift i10"));
		veclist.add(new Vehicle(2018,"Wagnar"));
		veclist.add(new Vehicle(2008,"Scorpio"));
		veclist.add(new Vehicle(2020,"Nissan Magnate "));
		veclist.add(new Vehicle(2023,"Punch Ev"));
       System.out.println("Before Sorting");
		for(Vehicle v : veclist)
		{
			System.out.println(v);
		}
		System.out.println();//new Line ke liye use kiya h
		
		System.out.println("After Sorting by Brand");
		Collections.sort(veclist,new BrandComparator());
		for(Vehicle v1 : veclist) {
			System.out.println(v1);
		}
		System.out.println();//new Line ke liye use kiya h
		
		System.out.println("After Sorting by Vehicle Name");
		Collections.sort(veclist,new vecNameComparator());
		for(Vehicle v2 : veclist) {
			System.out.println(v2);
		}

	}

}
