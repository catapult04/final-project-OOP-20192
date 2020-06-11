package crawldata;

import java.util.ArrayList;
import java.util.List;

import entity.Index;

public class GetIndex {
    public static List<Index> crawlData(String indexName) {
    	
        Crawler driver = new Crawler("https://s.cafef.vn/Lich-su-giao-dich-" + indexName + "-1.chn#data");
        driver.gwait(5);

        List<Index> indexList = new ArrayList<>();

        for (int i = 3; i < 10; i++) {
            Index index = new Index();
            index.setDay(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[1]"));
            index.setName(indexName);
            index.setTotalVolume(driver.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[5]", 0));
            index.setTotalMarket(driver.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[6]", 6));
            index.setChangePrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[3]").substring(0, 5)));
            index.setOpeningPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[9]")));
            index.setClosingPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[2]")));
            index.setHighestPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[10]")));
            index.setLowestPrice(Double.parseDouble(driver.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[11]")));
            indexList.add(index);
            index.setPercentChange();
        }

        driver.close();
        return indexList;
    }

}
