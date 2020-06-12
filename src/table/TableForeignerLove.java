package table;

import objects.TopForeignersStock;
import java.util.List;

public class TableForeignerLove {
    public TableForeignerLove(List<TopForeignersStock> foreignerList) {
    	String[] column = {"Mã CK","KL mua", "KL bán", "KLGD ròng", "GTGD ròng", "Room còn lại", "Đang sở hữu"};
        String[][] content = new String[10][7];
        for(int i=0; i<10; i++) {
            content[i][0] = String.valueOf(foreignerList.get(i).getName());
            content[i][1] = String.valueOf(foreignerList.get(i).getTotalVolumeBuy());
            content[i][2] = String.valueOf(foreignerList.get(i).getTotalVolumeSell());
            content[i][3] = String.valueOf(foreignerList.get(i).getTotalVolumeNet());
            content[i][4] = String.valueOf(foreignerList.get(i).getTotalValueNet()+"000000");
            content[i][5] = String.valueOf(foreignerList.get(i).getTotalOwned());
            content[i][6] = String.valueOf(foreignerList.get(i).getPercentOwned());
        }
    }
}