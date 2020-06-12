package comparator;

import java.util.Comparator;

import objects.HotStock;

public class TotalAssetComparator implements Comparator<HotStock>
{

	// sắp xếp theo TotalAsset
	@Override
	public int compare(HotStock o1, HotStock o2) 
	{
		return Double.compare(o1.getTotalAsset(), o2.getTotalAsset());
	}

}