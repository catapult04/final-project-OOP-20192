package crawldata;

import java.util.ArrayList;
import java.util.List;

import models.TopStockInDay;

public class GetTopStockInDay {
	
	public static List <TopStockInDay> crawlData(String updown) {
		
		// mở trang web và khởi tạo list
		Crawler driver = new Crawler("https://s.cafef.vn/TraCuuLichSu2/1/HOSE/" + Crawler.getDay() + ".chn");
		driver.gwait(5);

		int i;
		if (updown == "Down") {
			driver.moveAndClick("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/table[1]/thead[1]/tr[1]/td[1]/a[1]");
			i = 1;
		}
		else {
			i = 0;
		}
		
		List <TopStockInDay> topStockInDayList = new ArrayList <TopStockInDay>();
		
		// lấy dữ liệu từ web và gán cho thuộc tính của đối tượng
		for (int j=1;j<=5;j++) {
			TopStockInDay topday = new TopStockInDay();
			topday.setName(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[1]"));
			topday.setPercentChange(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[4]").substring(6 + i, 10 + i)));
			topday.setChangePrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[4]").substring(0, 5)));
			topday.setOpenPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[7]")));
			topday.setClosePrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[2]")));
			topday.setReferencePrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[6]")));
			
			String key = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr["+ j +"]/td[11]";
			String value = driver.findElement(key);
			if (value.length()<6) topday.setTotalVolume(0);
			else topday.setTotalVolume(driver.changeType(key, 6));
			
			topStockInDayList.add(topday);
		}
		
		driver.close();
		return topStockInDayList;
	}
}

