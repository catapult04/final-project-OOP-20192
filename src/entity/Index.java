package entity;

public class Index {

    private String name;
    private long totalVolume;
    private long totalMarket;
    private double changePrice;
    private double openingPrice;
    private double closingPrice;
    private double highestPrice;
    private double lowestPrice;
    private double percentChange;
    private String day;

    public Index() {
    }

    public long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public long getTotalMarket() {
        return totalMarket;
    }

    public void setTotalMarket(long totalMarket) {
        this.totalMarket = totalMarket;
    }

    public double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(double changePrice) {
        this.changePrice = changePrice;
    }

    public double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(double openingPrice) {
        this.openingPrice = openingPrice;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setPercentChange() {

        int percentChangeInt = (int) (changePrice/getReferencePrice()*100*100);
        percentChange = percentChangeInt/100.0;

    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }
    // lấy giá tham chiếu : giá đóng cửa ngày hôm trước
    public double getReferencePrice() {
        return closingPrice - changePrice;
    }

    // mức độ thay đổi của giá đóng cửa so với tham chiếu
    public String levelChange() {
        if (getPercentChange() >= 1) return "tăng mạnh";
        if (getPercentChange() < 1 && getPercentChange() >= 0) return "tăng nhẹ";
        if (getPercentChange() < 0 && getPercentChange() > -1) return "giảm nhẹ";
        else return "giảm mạnh";
    }

    // thay đổi của giá mở cửa so với tham chiếu
    public double getOpeningChange() {
        double result = openingPrice - getReferencePrice();
        int round = (int) (result * 100);
        result = round / 100.0;
        return result;
    }

    // thay đổi phần trăm của giá mở cửa so với tham chiếu
    public double getOpeningChangePercent() {
        int result = (int) (getOpeningChange() / getReferencePrice() * 100 * 100);
        return result / 100.0;
    }


}
