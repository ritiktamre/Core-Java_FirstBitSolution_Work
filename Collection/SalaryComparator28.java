package Collection;

import java.util.Comparator;

public class SalaryComparator28 implements Comparator<SM> {

	@Override
	public int compare(SM o1, SM o2) {
		return Double.compare(o1.salary, o2.salary);
	}

	

}
