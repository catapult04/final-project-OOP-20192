package crawldata;

import java.util.ArrayList;
import java.util.List;

import objects.HotStock;

public class GetGrowthStockInQuarter {

    public static List<HotStock> crawlData() {

        // mở trang web và khởi tạo list
        Crawler driver = new Crawler("https://s.cafef.vn/thong-ke/timeline-3-thang/san-all.chn");
        driver.gwait(5);
        List <HotStock> growthStockList3 = new ArrayList<>();

        // lấy dữ liệu từ web và gán cho thuộc tính của đối tượng
        try {
            for (int i=1;i<=8;i++) {
                HotStock growthstock3 = new HotStock();
                growthstock3.setName(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[1]"));
                growthstock3.setPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[3]").substring(0, 4)));
                growthstock3.setPercentChange(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[5]/em[1]").replaceAll("%", "" )));
                growthstock3.setMarketCap(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[2]").replaceAll(" Tỷ", "").replace(",", "")));
                growthstock3.setPercentChange(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[3]/span[1]").replaceAll(" %", "")));

                // Khối lượng giao dịch trung bình 1 tuần của 1 số mã không có giá trị thì được gán bằng 0
                String avg = driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[7]");
                if (avg.length()<2) growthstock3.setAvgTrade(0);
                else growthstock3.setAvgTrade(Double.parseDouble(avg));

                // Khối lượng của giao dịch của 1 số mã không có giá trị thì được gán bằng 0
                String volume = driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[4]").replaceAll(",", "");
                if (volume.length()<2) growthstock3.setVolume(0);
                else growthstock3.setVolume(Long.parseLong(volume));
                growthStockList3.add(growthstock3);
            }
        } finally {
            driver.close();
        }
        return growthStockList3;
    }
}


