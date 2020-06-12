package table;

import javax.swing.*;

import models.Index;

import java.util.List;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableIndex extends JFrame {

	private JTable jt;

    public TableIndex(List<Index> indexList) {

        String[] column = {"Ngày", "Giá đóng cửa", "Giá cao nhất", "Giá thấp nhất", "KLGD\n(cổ phiếu)", "GTGD(tỷ đồng)"};
        String[][] content = new String[7][6];
        for(int i=0; i<7; i++) {
        	content[i][0] = indexList.get(i).getDay();
            content[i][1] = String.valueOf(indexList.get(i).getClosingPrice());
            content[i][2] = String.valueOf(indexList.get(i).getHighestPrice());
            content[i][3] = String.valueOf(indexList.get(i).getLowestPrice());
            content[i][4] = String.valueOf(indexList.get(i).getTotalVolume());
            content[i][5] = String.valueOf(indexList.get(i).getTotalMarket()/1000);
        }
        getContentPane().setLayout(null);

        jt = new JTable(content, column);
        jt.setEnabled(false);

        JScrollPane js = new JScrollPane(jt);
        js.setBounds(12, 13, 543, 144);
        getContentPane().add(js);
        
        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		setVisible(false);
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(234, 190, 97, 25);
        getContentPane().add(btnNewButton);

        setVisible(true);
        setName("Bảng chỉ số thị trường 7 ngày qua");
        setSize(587, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
