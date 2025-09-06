package Collection;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.brand -o2.brand;
	}

	
}
