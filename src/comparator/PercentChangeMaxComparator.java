package comparator;

import java.util.Comparator;

import objects.HotStock;

public class PercentChangeMaxComparator implements Comparator<HotStock> {

	// sắp xếp theo PercentChangeMax
	@Override
	public int compare(HotStock o1, HotStock o2) 
	{
		return Double.compare(o1.getPercentChangeMax(), o2.getPercentChangeMax());
	}
}
