package table;

import objects.HotStock;
import java.util.List;

public class TableGrowthStockInQuarter {
    public TableGrowthStockInQuarter(List<HotStock> growthList3) {
        String[] column = {"Mã CK","Giá", "Khối lượng", "% giá thay đổi", "Vốn hóa", "GDTB phiên"};
        String[][] content = new String[8][6];
        for(int i=0; i<8; i++) {
            content[i][0] = growthList3.get(i).getName();
            content[i][1] = String.valueOf(growthList3.get(i).getPrice());
            content[i][2] = String.valueOf(growthList3.get(i).getTotalVolume());
            content[i][3] = String.valueOf(growthList3.get(i).getPercentChange());
            content[i][4] = String.valueOf(growthList3.get(i).getTotalAsset());
            content[i][5] = String.valueOf(growthList3.get(i).getAvgTrade());
        }
    }
}
