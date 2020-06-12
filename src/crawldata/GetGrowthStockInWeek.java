package crawldata;

import java.util.ArrayList;
import java.util.List;

import models.GrowthStock;

public class GetGrowthStockInWeek {
	
	public static List <GrowthStock> crawlData() {
		
		// mở trang web và khởi tạo list
		Crawler driver = new Crawler("https://s.cafef.vn/thong-ke/san-all.chn");
		driver.gwait(5);
		List <GrowthStock> growthStockList = new ArrayList<>();

		// lấy dữ liệu từ web và gán cho thuộc tính của đối tượng
		try {
			for (int i=1;i<=8;i++) {
				GrowthStock growthstock = new GrowthStock();
				growthstock.setName(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[1]"));
				growthstock.setPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[3]").substring(0, 4)));
				growthstock.setPercentChangeMax(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[5]/em[1]").replaceAll("%", "" )));
				growthstock.setTotalAsset(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[2]").replaceAll(" Tỷ", "").replace(",", "")));
				growthstock.setPercentChange(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[3]/span[1]").replaceAll(" %", "")));
			
				// Khối lượng giao dịch trung bình 1 tuần của 1 số mã không có giá trị thì được gán bằng 0
				String avg = driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[7]");
				if (avg.length()<2) growthstock.setAvgTrade(0);
				else growthstock.setAvgTrade(Double.parseDouble(avg));
			
				// Khối lượng của giao dịch của 1 số mã không có giá trị thì được gán bằng 0
				String totalVolume = driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[4]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[4]").replaceAll(",", "");
				if (totalVolume.length()<2) growthstock.setTotalVolume(0);
				else growthstock.setTotalVolume(Long.parseLong(totalVolume));
				growthStockList.add(growthstock);
			}
		} finally {
			driver.close();
		}
		return growthStockList;
	}
}