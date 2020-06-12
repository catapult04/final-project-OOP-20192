package objects;

public class InDayStock extends Stock {
	private double openPrice;
    private double closePrice;
	private double changePrice;
	private double referencePrice;
    private long volume;
    
    
	public double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}
	public double getChangePrice() {
		return changePrice;
	}
	public void setChangePrice(double changePrice) {
		this.changePrice = changePrice;
	}
	public double getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(double referencePrice) {
		this.referencePrice = referencePrice;
	}
	public long getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
}
