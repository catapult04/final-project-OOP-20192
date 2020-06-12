package comparator;

import java.util.Comparator;

import models.GrowthStock;

public class PriceComparator implements Comparator<GrowthStock> {

	// sắp xếp theo Price
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
}
