package table;

import objects.InDayStock;
import java.util.List;

public class TableTopStockInDay {
    public TableTopStockInDay (List<InDayStock> topInDayList, String s) {

        String[] column = {"Mã CK", "Giá mở cửa", "Giá đóng cửa", " Giá tham chiếu", "% thay đổi", "KLGD khớp lệnh"};
        String[][] content = new String[5][6];
        for(int i=0; i<5; i++) {
        	content[i][0] = topInDayList.get(i).getName();
            content[i][1] = String.valueOf(topInDayList.get(i).getOpenPrice());
            content[i][2] = String.valueOf(topInDayList.get(i).getClosePrice());
            content[i][3] = String.valueOf(topInDayList.get(i).getReferencePrice());
            content[i][4] = String.valueOf(topInDayList.get(i).getPercentChange());
            if (topInDayList.get(i).getTotalVolume() == 0) content[i][5] = "0";
            else content[i][5] = String.valueOf(topInDayList.get(i).getTotalVolume())+"000000";
        }
    }
}
