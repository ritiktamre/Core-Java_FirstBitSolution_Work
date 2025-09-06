package Collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Sales> {

	@Override
	public int compare(Sales o1, Sales o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}


}
