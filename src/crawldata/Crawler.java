package crawldata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crawler {
	private WebDriver driver;

	public Crawler(String link) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get(link);
	}
	
	public void moveAndClick(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();
	}

	public void close() {
		this.driver.quit();
	}
	
	public void gwait(int time) {
		try {

			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// chuyển đổi kiểu dữ liệu trên web từ String sang long để sử dụng
	public long changeType (String s, int a) {
		s = this.findElement(s).replaceAll(",", "");
		s = s.substring(0, s.length() - (a+1));
		return Long.parseLong(s);
	}

	public String findElement(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	/* Ví dụ link truy cập web ngày 23/04/2020: https://s.cafef.vn/TraCuuLichSu2/1/HOSE/23/04/2020.chn
	 * ta thấy mỗi ngày link để truy cập trang web lại khác nhau
	 * mặt khác vào thứ 7, chủ nhật sàn giao dịch lại không hoạt động
	 * nên khi lấy dữ liệu để xử lí ta cần chọn ngày thứ 6 gần nhất để sử dụng
	 */
	public static String getDay() {
 		Calendar cal = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy");
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int var = 0;
		if (dayOfWeek == 2) var = -2;
		if (dayOfWeek == 1) var = -1;
		cal.roll(Calendar.DATE, var - 1);
		return time.format(cal.getTime());
	}
	
}