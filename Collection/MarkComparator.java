package Collection;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
	
		return Double.compare(o1.marks, o2.marks);
	}

	

}
