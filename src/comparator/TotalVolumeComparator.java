package comparator;

import java.util.Comparator;

import objects.HotStock;

public class TotalVolumeComparator implements Comparator<HotStock> {

	// sắp xếp theo TotalVolume
	@Override
	public int compare(HotStock o1, HotStock o2) 
	{
		return Double.compare(o1.getTotalVolume(), o2.getTotalVolume());
	}
}
