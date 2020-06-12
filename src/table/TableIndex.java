package table;

import objects.Index;
import java.util.List;

public class TableIndex {
    public TableIndex(List<Index> indexList) {
        String[] column = {"Ngày", "Giá đóng cửa", "Giá cao nhất", "Giá thấp nhất", "KLGD\n(cổ phiếu)", "GTGD(tỷ đồng)"};
        String[][] content = new String[7][6];
        for(int i=0; i<7; i++) {
        	content[i][0] = indexList.get(i).getDay();
            content[i][1] = String.valueOf(indexList.get(i).getClosePrice());
            content[i][2] = String.valueOf(indexList.get(i).getHighestPrice());
            content[i][3] = String.valueOf(indexList.get(i).getLowestPrice());
            content[i][4] = String.valueOf(indexList.get(i).getVolume());
            content[i][5] = String.valueOf(indexList.get(i).getExchangeValue()/1000);
        }
    }
}
