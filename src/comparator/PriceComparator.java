package comparator;

import java.util.Comparator;

import objects.HotStock;

public class PriceComparator implements Comparator<HotStock> {

	// sắp xếp theo Price
	@Override
	public int compare(HotStock o1, HotStock o2) 
	{
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
}
