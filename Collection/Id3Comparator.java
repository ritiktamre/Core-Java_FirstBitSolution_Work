package Collection;

import java.util.Comparator;

public class Id3Comparator implements Comparator<SalesManager> {

	@Override
	public int compare(SalesManager o1, SalesManager o2) {
	
		return o1.id-o2.id;
	}



}
