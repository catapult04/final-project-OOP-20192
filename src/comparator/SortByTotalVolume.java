package comparator;

import java.util.Comparator;

import objects.InDayStock;

public class SortByTotalVolume implements Comparator<InDayStock> {

    // Săp xếp theo thứ tự giảm dần
    @Override
    public int compare(InDayStock o1, InDayStock o2) {
        double res = o1.getTotalVolume() - o2.getTotalVolume();
        if (res > 1){
            return -1;// Không đổi chỗ
        } else {
            return 1; // Đổi chỗ
        }
    }
}
