package Collection;

import java.util.Comparator;

public class SalaryComparator25 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return Double.compare(o1.salary, o2.salary);
	}

	

}
