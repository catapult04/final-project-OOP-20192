package objects;

public class HotStock extends Stock {
	
    private double price;
    private double percentChange;
    private double marketCap;
    private double volume;
    private double avgTrade;

    
    public HotStock() {
        super();
    }

    
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getAvgTrade() {
		return avgTrade;
	}

	public void setAvgTrade(double avgTrade) {
		this.avgTrade = avgTrade;
	}
}
