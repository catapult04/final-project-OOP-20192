package comparator;

import java.util.Comparator;

import objects.InDayStock;

public class PercentChangeComparator implements Comparator<InDayStock> {

	// sắp xếp theo % thay đổi
    @Override
    public int compare(InDayStock o1, InDayStock o2) {
        double res = o1.getPercentChange() - o2.getPercentChange();
        if (res > 1){
            return -1;
        } else {
            return 1;
        }
    }
}
