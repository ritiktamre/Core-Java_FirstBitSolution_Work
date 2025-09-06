package Collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Sales> {

	@Override
	public int compare(Sales o1, Sales o2) {
		return Double.compare(o1.salary, o2.salary);
	}

	


}
