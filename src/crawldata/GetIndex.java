package crawldata;

import java.util.ArrayList;
import java.util.List;

import objects.Index;

public class GetIndex {
    public static List<Index> crawlData(String indexName) {
    	
        Crawler crawler = new Crawler("https://s.cafef.vn/Lich-su-giao-dich-" + indexName + "-1.chn#data");
        crawler.gwait(5);

        List<Index> indexList = new ArrayList<>();

        for (int i = 3; i < 10; i++) {
            Index index = new Index();
            index.setDay(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+ i +"]/td[1]"));
            index.setName(indexName);
            index.setVolume(crawler.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[5]", 0));
            index.setExchangeValue(crawler.changeType("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[6]", 6));
            index.setChangePrice(Double.parseDouble(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[3]").substring(0, 5)));
            index.setOpenPrice(Double.parseDouble(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[9]")));
            index.setClosePrice(Double.parseDouble(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[2]")));
            index.setHighestPrice(Double.parseDouble(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[10]")));
            index.setLowestPrice(Double.parseDouble(crawler.findElement("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[11]")));
            indexList.add(index);
            index.setPercentChange();
        }

        crawler.close();
        return indexList;
    }

}
