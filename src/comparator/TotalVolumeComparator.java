package comparator;

import java.util.Comparator;

import entity.GrowthStock;

public class TotalVolumeComparator implements Comparator<GrowthStock> {

	// sắp xếp theo TotalVolume
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		return Double.compare(o1.getTotalVolume(), o2.getTotalVolume());
	}
}
