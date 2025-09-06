package Collection;

import java.util.Comparator;

public class Name3Comparator implements Comparator<SalesManager> {

	@Override
	public int compare(SalesManager o1, SalesManager o2) {
		
		return o1.name.compareTo(o2.name);
	}

	
	

}
