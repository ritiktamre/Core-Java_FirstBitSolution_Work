package Collection;

import java.util.Comparator;

public class IdComparable29 implements Comparator<SM> {

	@Override
	public int compare(SM o1, SM o2) {
		return o1.id-o2.id;
	}

	

}
