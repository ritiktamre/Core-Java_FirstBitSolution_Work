package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Mobile implements Comparable
{
	int imeiNo;
	String brand;
	double price;
   
	Mobile(int imeiNo, String brand, double price) {
		this.imeiNo = imeiNo;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nMobile [imeiNo=" + imeiNo + ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		Mobile m1 = (Mobile)o;
		return m1.imeiNo-this.imeiNo;
	}

    
}//class Mobile ends here

class Brand implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		return o1.brand.compareTo(o2.brand);
	}

}//

public class Test {

	public static void main(String[] args) {
		
//		TreeSet<Mobile> t1 = new TreeSet<Mobile> ();
		ArrayList<Mobile> t1 = new ArrayList<Mobile>();
		t1.add(new Mobile(1234,"Samsung",10000));
		t1.add(new Mobile(123,"Vivo",18000));
		t1.add(new Mobile (1221,"Oneplus",25000));
		
//		for(Mobile e1 : t1)
//			System.out.println(e1);
//		t1.add(new Mobile(1234,"Samsung",10000));
		
		System.out.println(t1);
		System.out.println();
		
		Collections.sort(t1);
		System.out.println(t1);

		Brand m1 = new Brand();
		Collections.sort(t1,m1);
		System.out.println(t1);
	}

}
