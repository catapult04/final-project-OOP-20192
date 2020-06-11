package table;

import entity.GrowthStock;
import javax.swing.*;
import java.util.List;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableGrowthStockInYear extends JFrame {

    private JTable jt;

    public TableGrowthStockInYear(List<GrowthStock> growthList2) {
        setTitle("Bảng chỉ số cổ phiếu tăng trưởng mạnh trong năm");

        String[] column = {"Mã CK","Giá", "Khối lượng", "% giá thay đổi", "Vốn hóa", "GDTB phiên"};
        String[][] content = new String[8][6];
        for(int i=0; i<8; i++) {
            content[i][0] = growthList2.get(i).getName();
            content[i][1] = String.valueOf(growthList2.get(i).getPrice());
            content[i][2] = String.valueOf(growthList2.get(i).getTotalVolume());
            content[i][3] = String.valueOf(growthList2.get(i).getPercentChange());
            content[i][4] = String.valueOf(growthList2.get(i).getTotalAsset());
            content[i][5] = String.valueOf(growthList2.get(i).getAvgTrade());
        }
        getContentPane().setLayout(null);

        jt = new JTable(content, column);
        jt.setEnabled(false);

        JScrollPane js = new JScrollPane(jt);
        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        js.setBounds(12, 13, 600, 158);
        getContentPane().add(js);

        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(267, 184, 97, 25);
        getContentPane().add(btnNewButton);

        setVisible(true);
        setName("");
        setSize(645, 268);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

