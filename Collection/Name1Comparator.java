package Collection;

import java.util.Comparator;

public class Name1Comparator implements Comparator<Sales>{

	@Override
	public int compare(Sales o1, Sales o2) {
		// TODO Auto-generated method stub
	 return o1.name1.compareTo(o2.name1);
	}



}
