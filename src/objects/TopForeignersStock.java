package objects;

import java.util.ArrayList;
import java.util.List;

public class TopForeignersStock extends Stock{
	private long sellVolume;
    private long buyVolume;
    private long ownedVolume;
    private long netVolume;
    private long netValue;
    private double ownedPercent;
    

	public static String overview(List<TopForeignersStock> lst) {
		if (topUpper(lst).size() == 0)
			return "khá ảm đạm";
		else if (topUpper(lst).size() < 4) 
			return "có tín hiệu khởi sắc";
		else
			return "rất khởi sắc";
	}
	
	public static List<TopForeignersStock> topUpper(List<TopForeignersStock> lst) {
		List<TopForeignersStock> top = new ArrayList<>();
		for (TopForeignersStock i: lst) {
			if (i.getNetValue() >= 10000) top.add(i);
		}
		return top;
	}	
	
	
	public long getSellVolume() {
		return sellVolume;
	}

	public void setSellVolume(long sellVolume) {
		this.sellVolume = sellVolume;
	}

	public long getBuyVolume() {
		return buyVolume;
	}

	public void setBuyVolume(long buyVolume) {
		this.buyVolume = buyVolume;
	}

	public long getOwnedVolume() {
		return ownedVolume;
	}

	public void setOwnedVolume(long ownedVolume) {
		this.ownedVolume = ownedVolume;
	}

	public long getNetVolume() {
		return netVolume;
	}

	public void setNetVolume(long netVolume) {
		this.netVolume = netVolume;
	}

	public long getNetValue() {
		return netValue;
	}

	public void setNetValue(long netValue) {
		this.netValue = netValue;
	}

	public double getOwnedPercent() {
		return ownedPercent;
	}

	public void setOwnedPercent(double ownedPercent) {
		this.ownedPercent = ownedPercent;
	}
}



