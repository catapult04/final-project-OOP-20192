package entity;

public class TopStockInDay extends Stock {
	
    private double changePrice;       // giá thay đổi
    private double openPrice;         // giá mở cửa
    private double closePrice;        // giá đóng cửa
    private long totalVolume;         // khối lượng giao dịch khớp lệnh
    private double referencePrice;    // giá tham chiếu
    
    public double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(double changePrice) {
        this.changePrice = changePrice;
    }

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

	public long getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(long l) {
		this.totalVolume = l;
	}

	public double getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(double referencePrice) {
		this.referencePrice = referencePrice;
	}

	public TopStockInDay() {
    }

}
