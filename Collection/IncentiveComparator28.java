package Collection;

import java.util.Comparator;

public class IncentiveComparator28 implements Comparator<SM> {

	@Override
	public int compare(SM o1, SM o2) {
		
		return Double.compare(o1.incentive, o2.incentive);
	}

	

}
