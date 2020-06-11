package comparator;

import java.util.Comparator;
import entity.TopStockInDay;

public class ClosePriceComparator implements Comparator<TopStockInDay> {

    @Override
    public int compare(TopStockInDay o1, TopStockInDay o2) {
        double res = o1.getClosePrice() - o2.getClosePrice();
        if (res > 1){
            return -1;// Không đổi chỗ
        } else {
            return 1; // Đổi chỗ
        }
    }
}
