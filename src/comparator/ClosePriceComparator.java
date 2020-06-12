package comparator;

import java.util.Comparator;

import objects.InDayStock;

public class ClosePriceComparator implements Comparator<InDayStock> {

    @Override
    public int compare(InDayStock o1, InDayStock o2) {
        double res = o1.getClosePrice() - o2.getClosePrice();
        if (res > 1){
            return -1;// Không đổi chỗ
        } else {
            return 1; // Đổi chỗ
        }
    }
}
