package table;

import entity.TopStockForeignersLove;
import javax.swing.*;
import java.util.List;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableForeignerLove extends JFrame {

    private JTable jt;

    public TableForeignerLove(List<TopStockForeignersLove> foreignerList) {

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
        getContentPane().setLayout(null);

        jt = new JTable(content, column);
        jt.getColumnModel().getColumn(0).setPreferredWidth(82);
        jt.getColumnModel().getColumn(5).setPreferredWidth(87);
        jt.getColumnModel().getColumn(6).setPreferredWidth(93);
        jt.setEnabled(false);

        JScrollPane js = new JScrollPane(jt);
        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        js.setBounds(12, 46, 674, 191);
        getContentPane().add(js);
        
        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(arg0 -> setVisible(false));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(300, 265, 97, 25);
        getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("Top 10 cố phiếu có khối lượng giao dịch ròng lớn nhất");
        lblNewLabel.setBounds(12, 13, 315, 27);
        getContentPane().add(lblNewLabel);
        
        setVisible(true);
        setTitle("Bảng cổ phiếu được nhà đầu tư nước ngoài quan tâm");
        setSize(716, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}