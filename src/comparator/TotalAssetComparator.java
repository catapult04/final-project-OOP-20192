package comparator;

import java.util.Comparator;

import models.GrowthStock;

public class TotalAssetComparator implements Comparator<GrowthStock>
{

	// sắp xếp theo TotalAsset
	@Override
	public int compare(GrowthStock o1, GrowthStock o2) 
	{
		return Double.compare(o1.getTotalAsset(), o2.getTotalAsset());
	}

}