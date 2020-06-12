package comparator;

import java.util.Comparator;

import models.GrowthStock;

public class AvgTradeComparator implements Comparator<GrowthStock> {
	
	// sắp xếp theo AvgTrade
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) {
		return Double.compare(o1.getAvgTrade(), o2.getAvgTrade());
	}
	
}
