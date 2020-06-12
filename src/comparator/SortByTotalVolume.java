package comparator;

import java.util.Comparator;

import models.TopStockInDay;

public class SortByTotalVolume implements Comparator<TopStockInDay> {

    // Săp xếp theo thứ tự giảm dần
    @Override
    public int compare(TopStockInDay o1, TopStockInDay o2) {
        double res = o1.getTotalVolume() - o2.getTotalVolume();
        if (res > 1){
            return -1;// Không đổi chỗ
        } else {
            return 1; // Đổi chỗ
        }
    }
}
