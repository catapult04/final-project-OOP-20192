package models;

public class GrowthStock extends Stock {
	
    private double price;
    private double percentChangeMax;
    private double totalVolume;
     // % thay đổi
    private double totalAsset; // vốn hóa
    private double avgTrade; // giao dịch trung bình phiên

    public GrowthStock() {
        super();
    }
    
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(double totalVolume) {
		this.totalVolume = totalVolume;
	}

	public double getPercentChangeMax() {
		return percentChangeMax;
	}

	public void setPercentChangeMax(double percentChangeMax) {
		this.percentChangeMax = percentChangeMax;
	}

	public double getTotalAsset() {
		return totalAsset;
	}

	public void setTotalAsset(double totalAsset) {
		this.totalAsset = totalAsset;
	}

	public double getAvgTrade() {
		return avgTrade;
	}

	public void setAvgTrade(double avgTrade) {
		this.avgTrade = avgTrade;
	}

}
