package crawldata;

import java.util.ArrayList;
import java.util.List;
import entity.TopStockForeignersLove;

public class GetTopStockForeignersLove {
	
	public static List <TopStockForeignersLove> crawlData() {
		
		// mở trang web và khởi tạo list
		Crawler driver = new Crawler("https://s.cafef.vn/TraCuuLichSu2/3/HOSE/" + Crawler.getDay() + ".chn");
		driver.gwait(5);

		List <TopStockForeignersLove> topfllist = new ArrayList <>();

		// lấy dữ liệu từ web và gán cho thuộc tính của đối tượng
		for (int i=1;i<=10;i++) {
			TopStockForeignersLove topforeign = new TopStockForeignersLove(); 
			topforeign.setName(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[1]"));
			topforeign.setTotalVolumeSell(driver.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[4]", 0));
			topforeign.setTotalVolumeBuy(driver.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[2]", 0));
			topforeign.setTotalVolumeNet(driver.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[6]", 0));
			
			// Một số CK có TotalValueNet khá lớn (khoảng vài tỷ đến vài chục tỷ) nên cần bỏ bớt 6 chữ số cuối để gán giá trị 
			String s1 = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[7]";
			if (driver.findElement(s1).replaceAll(",", "").length() < 6) topforeign.setTotalValueNet(0);
			else topforeign.setTotalValueNet(driver.changeType(s1, 6));
			
			// Một số CK không có chỉ số Room còn lại thì được gán bằng 0
			String s2 = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[8]";
			if (driver.findElement(s2).length()<2) topforeign.setTotalOwned(0);
			else topforeign.setTotalOwned(driver.changeType(s2, 0));
			
			// Một số CK không có chỉ số Đang sở hữu thì được gán bằng 0
			String s3 = driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr["+ i +"]/td[9]");
			if (s3.length()<2) topforeign.setPercentOwned(0);
			else topforeign.setPercentOwned(Double.parseDouble(s3.replace("%", "")));
			
			topfllist.add(topforeign);
		}
		
		driver.close();
		return topfllist;
	}
}