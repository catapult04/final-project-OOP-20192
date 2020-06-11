package comparator;

import java.util.Comparator;

import entity.TopStockInDay;

public class PercentChangeComparator implements Comparator<TopStockInDay> {

	// sắp xếp theo % thay đổi
    @Override
    public int compare(TopStockInDay o1, TopStockInDay o2) {
        double res = o1.getPercentChange() - o2.getPercentChange();
        if (res > 1){
            return -1;
        } else {
            return 1;
        }
    }
}
