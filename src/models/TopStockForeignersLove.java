package models;

import java.util.ArrayList;
import java.util.List;

public class TopStockForeignersLove extends Stock{

	private long totalVolumeSell; // khoi luong ban
    private long totalVolumeBuy; // khoi luong mua
    private long totalVolumeNet; // khoi luong giao dich rong
    private long totalValueNet; // gia tri giao dich rong
    private long totalOwned; // khoi luong so huu
    private double percentOwned; // % so huu
    
	public long getTotalVolumeSell() {
		return totalVolumeSell;
	}
	public void setTotalVolumeSell(long totalVolumeSell) {
		this.totalVolumeSell = totalVolumeSell;
	}
	public long getTotalVolumeBuy() {
		return totalVolumeBuy;
	}
	public void setTotalVolumeBuy(long totalVolumeBuy) {
		this.totalVolumeBuy = totalVolumeBuy;
	}
	public long getTotalVolumeNet() {
		return totalVolumeNet;
	}
	public void setTotalVolumeNet(long totalVolumeNet) {
		this.totalVolumeNet = totalVolumeNet;
	}
	public long getTotalValueNet() {
		return totalValueNet;
	}
	public void setTotalValueNet(long totalValueNet) {
		this.totalValueNet = totalValueNet;
	}
	public long getTotalOwned() {
		return totalOwned;
	}
	public void setTotalOwned(long totalOwned) {
		this.totalOwned = totalOwned;
	}
	public double getPercentOwned() {
		return percentOwned;
	}
	public void setPercentOwned(double percentOwned) {
		this.percentOwned = percentOwned;
	}
    
	public static String overview(List<TopStockForeignersLove> lst) {
		if (topUpper(lst).size() == 0)
			return "khá ảm đạm";
		else if (topUpper(lst).size() < 4) 
			return "có tín hiệu khởi sắc";
		else
			return "rất khởi sắc";
	}
	
	public static List<TopStockForeignersLove> topUpper(List<TopStockForeignersLove> lst) {
		List<TopStockForeignersLove> top = new ArrayList<>();
		for (TopStockForeignersLove i: lst) {
			if (i.getTotalValueNet() >= 10000) top.add(i);
		}
		return top;
	}
	
}



