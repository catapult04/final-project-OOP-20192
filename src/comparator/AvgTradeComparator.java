package comparator;

import java.util.Comparator;

import objects.HotStock;

public class AvgTradeComparator implements Comparator<HotStock> {
	
	// sắp xếp theo AvgTrade
	@Override
	public int compare(HotStock o1, HotStock o2) {
		return Double.compare(o1.getAvgTrade(), o2.getAvgTrade());
	}
	
}
