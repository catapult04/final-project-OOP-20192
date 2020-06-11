package sentences;

import java.util.List;
import java.util.Random;

import comparator.ClosePriceComparator;
import comparator.PercentChangeComparator;
import comparator.SortByTotalVolume;
import entity.TopStockInDay;

public class SentencesTopStockInDay {

    private String[] stringUp = new String[5];
    private String[] stringDown = new String[5];

    public String createUpSentences(TopStockInDay ts) {

        stringUp[0] = ("Mã cổ phiếu tăng trưởng manh mẽ nhất là: " + ts.getName() + " tăng " +
                ts.getPercentChange() + "% tức " + ts.getChangePrice() + " điểm.\n" +
                "Đây là tín hiệu rất lạc quan trong bối cảnh hiện nay khi mà rất nhiều \n" +
                "cổ phiếu đang rớt giá thảm hại. Rất mong cổ phiếu này duy trì được đà tăng \n" +
                "ấn tượng như trên thúc đẩy nền kinh tế phát triển.");
        
        stringUp[1] = ("Trong số đó, cổ phiếu " + ts.getName() + " tăng trưởng ấn tượng nhất khi đã tăng "
                + ts.getPercentChange() + "% tương ứng với: " + ts.getChangePrice() + " điểm. \n" +
                "Đây là tín hiệu rất lạc quan trong bối cảnh hiện nay khi mà rất nhiều \n" +
                "cổ phiếu đang trên đà lao dốc. Rất mong cổ phiếu này duy trì được đà  \n" +
                "tăng ấn tượng như trên thúc đẩy nền kinh tế phát triển.");
        
        stringUp[2] = ("Tín hiêu tích cực nhất trong ngày hôm nay là mã " + ts.getName() + " khi đã tăng "
                + ts.getPercentChange() + "% ứng với " + ts.getChangePrice() + " điểm.\n" +
                "Đây là một trong những cú hích thúc đẩy thị trường đi lên trong bối cảnh nhiều mã \n" +
                "tụt giá rất sâu. Rất mong cổ phiếu này duy trì được đà tăng ấn tượng như trên thúc \n" +
                "đẩy nền kinh tế phát triển.");

        stringUp[3] = ("Nổi bật nhất là mã " + ts.getName() + " khi đã tăng " + ts.getPercentChange()
                + "% tương đương " + ts.getChangePrice() + " điểm. Đây là điều rất tích \n" +
                "cực trong bối cảnh chung hiện nay.  Rất mong cổ phiếu này duy trì được đà tăng ấn \n" +
                "tượng như trên thúc đẩy nền kinh tế phát triển.");
        
        stringUp[4] = ("Thị trường đóng cửa với tín hiệu lạc quan nhất thuộc về mã " + ts.getName()
                + " khi đã tăng " + ts.getPercentChange() + "% ứng với sô điểm: " + ts.getChangePrice() +
                "\nĐây được coi như là điều tích cực hiếm hoi xua đi không khí ảm đạm của \n" +
                "thị trường ngày hôm nay. Rất mong cổ phiếu này duy trì được đà tăng ấn tượng \n" +
                "như trên thúc đẩy nền kinh tế phát triển.");

        Random random = new Random();
        int x = random.nextInt(4);

        return stringUp[x];
    }

    public String createDownSentences(TopStockInDay ts) {

        stringDown[0] = ("Mã cổ phiếu giảm sâu nhất là: " + ts.getName() + " đã giảm"
                + -ts.getPercentChange() + "% tức " + -ts.getChangePrice() + " điểm. Đây được \n" +
                "coi như sự mất mát rất lớn của ngày giao dịch hôm nay. Sau phiên giao  \n" +
                "dịch ngày hôm nay mã cổ phiếu này sẽ tăng điểm trở lại.");
        stringDown[1] = ("Trong số đó, cổ phiếu " + ts.getName() + " gây thất vọng nhất khi đã giảm "
                + -ts.getPercentChange() + "% với số điểm đã mất là: " + -ts.getChangePrice() + "\nĐiều này đã " +
                "gây ra tâm lý hoang mang không chỉ cho nhà đầu tư mà còn ảnh hưởng tới rất nhiều\n" +
                "mã cổ phiếu khác. Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ " +
                "tăng điểm trở lại.");
        stringDown[2] = ("Không mấy vui vẻ nhất là mã " + ts.getName() + " khi đã giảm " + -ts.getPercentChange()
                + "% ứng với " + -ts.getChangePrice() + " điểm. \nĐây sẽ là cú đấm mạnh kìm hãm sự phát " +
                "triển của mã cổ phiếu này. \nSau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu" +
                " này sẽ tăng điểm trở lại.");
        stringDown[3] = ("Thị trường đóng cửa với tín hiệu bi quan nhất thuộc về mã " + ts.getName()
                + " khi đã giảm " + -ts.getPercentChange() + "% với số điểm: " + -ts.getChangePrice() +
                "\nĐiều này sẽ khiến cho tâm lý rất nhiều nhà đầu tư đi xuống kéo theo nhiều hệ lũy.\n" +
                "Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ tăng điểm trở lại.");
        stringDown[4] = ("Mã cổ phiếu buồn nhất trong ngày hôm nay là " + ts.getName() + " khi đã giảm " +
                -ts.getPercentChange() + "% và đã mất " + -ts.getChangePrice() + " điểm.\n" +
                "Đây là có một mã chứng khoán lớn có ý nghĩa quan trọng đối với thị trường.\n" +
                "Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ tăng điểm trở lại.");

        Random random = new Random();
        int x = random.nextInt(4);

        return stringDown[x];
    }

    public String comment(List<TopStockInDay> list) {
        String strShow5, strShow6, strShow7;
        double total = 0;
        for (TopStockInDay topStockInDay : list) {
            total += topStockInDay.getTotalVolume();
        }
        strShow5 = ("\nDựa vào bảng trên ta có những thông tin tổng quan sau:\nCác mã thay đổi một lượng " +
                "dao động trong khoảng " + list.get(0).getPercentChange() + "%"
                + "\nTổng khối lượng giao dịch khớp lệnh của các mã trên là: " + total);

        list.sort(new ClosePriceComparator());
        strShow6 = ("\nTa nhận thấy trong các cổ phiếu trên thì giá đóng cửa cao nhất là mã " + list.get(0).getName()
                + "\nvới " + list.get(0).getClosePrice() + " điểm. Còn thấp nhất dó chính là "
                + list.get(list.size() - 1).getName() + " đạt " + list.get(list.size() - 1).getClosePrice() + " điểm.");

        list.sort(new SortByTotalVolume());
        strShow7 = ("\nCòn đối với khối lượng giao dịch khớp lệnh, cổ phiêu giao dịch nhiều nhất đó\nlà: "
                + list.get(0).getName() + " thấp nhất là " + list.get(list.size() - 1).getName() + ", dao động từ "
                + list.get(0).getTotalVolume() + " đến " + list.get(list.size() - 1).getTotalVolume() + "\n");

        return strShow5 + strShow6 + strShow7;
    }
    
    //Sinh câu với mã tăng
    public static String upStock(List<TopStockInDay> upList) {
        upList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strUp;


        if (upList.size() > 0) {
            strUp = ("\nTổng kết lại đây là những mã cổ phiếu mới nổi,còn nhỏ nhưng đã tăng " +
                    "trưởng rất tốt và rất nhiều tiềm năng.");
            strUp = cr.comment(upList) +
                    cr.createUpSentences(upList.get(0)) + strUp;
        } else {
            strUp = ("Hôm nay thị trường đi xuống, không có mã cổ phiếu nào tăng điểm.");
        }
        return strUp;
    }

    // Sinh câu với mã giảm
    public static String downStock(List<TopStockInDay> downList) {
        downList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strDown;

        if (downList.size() > 0) {
            strDown = ("\nNói chung đây là các mã không quá lớn nên chưa ảnh hưởng nhiều tới toàn bộ thị trường,\n" +
                    "các nhà đầu xin hãy bình tĩnh cân nhắc đầu tư trong thời điểm này.");
            strDown = cr.comment(downList) +
                      cr.createDownSentences(downList.get(0)) + strDown;
        } else {
            strDown = ("Hôm nay quả thật là ngày rất vui khi không có mã cổ phiếu nào giảm điểm.");
        }
        return strDown;
    }
}
