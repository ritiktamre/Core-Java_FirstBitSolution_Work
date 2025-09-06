package Collection;

import java.util.Comparator;

public class RollComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student3 s1 = (Student3)o1;
		Student3 s2 =(Student3)o2;
		return  s1.roll-s2.roll;
	}

}
