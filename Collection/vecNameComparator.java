package Collection;

import java.util.Comparator;

public class vecNameComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.vecName.compareTo(o2.vecName);
	}

	

}
