package objects;

public class Index {
    private String name;
    private double openPrice;
    private double closePrice;
    private double changePrice;
    private double highestPrice;
    private double lowestPrice;
    private double percentChange;
    private long volume;
    private long exchangeValue;
    private String day;
    
    
    // giá đóng cửa ngày hôm trước
    public double getReferencePrice() {
        return closePrice - changePrice;
    }

    // mức độ thay đổi của giá đóng cửa so với giá thay đổi
    public String levelChange() {
        if (getPercentChange() >= 1) return "tăng mạnh";
        if (getPercentChange() < 1 && getPercentChange() >= 0) return "tăng nhẹ";
        if (getPercentChange() < 0 && getPercentChange() > -1) return "giảm nhẹ";
        else return "giảm mạnh";
    }

    // thay đổi của giá mở cửa so với tham chiếu
    public double getOpenPriceChange() {
        double result = openPrice - getReferencePrice();
        int round = (int) (result * 100);
        result = round / 100.0;
        return result;
    }

    // thay đổi phần trăm của giá mở cửa so với giá hôm trước
    public double getOpenPercentChange() {
        int result = (int) (getOpenPriceChange() / getReferencePrice() * 100 * 100);
        return result / 100.0;
    }
    
    
    public Index() {
    }

    public void setName(String name) { 
    	this.name = name;
    }

    public String getName() {
        return name;
    }

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
    
    public void setPercentChange() {
        int percentChangeInt = (int) (changePrice/getReferencePrice()*100*100);
        percentChange = percentChangeInt/100.0;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }
    
    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(long exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
