package Collection;

import java.util.Comparator;

public class Salary3Comparator implements Comparator<SalesManager> {

	@Override
	public int compare(SalesManager o1, SalesManager o2) {
	
		return Double.compare(o1.salary, o2.salary);
	}

	
}
