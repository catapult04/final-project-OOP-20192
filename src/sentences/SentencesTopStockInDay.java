package sentences;

import java.util.List;
import java.util.Random;

import comparator.ClosePriceComparator;
import comparator.PercentChangeComparator;
import comparator.SortByTotalVolume;
import objects.InDayStock;

public class SentencesTopStockInDay {
    private String[] upPassage = new String[5];
    private String[] downPassage = new String[5];

    public String createUpPassage (InDayStock stock) {
        upPassage[0] = "Cổ phiếu " + stock.getName() + " đã có bước nhảy vọt với mức tăng " +
                stock.getPercentChange() + "%, hay " + stock.getChangePrice() + " điểm.\n" +
                "Những sự tăng trưởng như vậy đã mang đến màu sắc tích cực cho thị trường chứng khoán, "
                + "và chúng ta hoàn toàn có lí do để tin tưởng vào điều tương tự ở những phiên giao dịch tiếp theo.";
        
        upPassage[1] = "Tín hiệu tích cực nhất trong ngày hôm nay phải kể đến cổ phiếu " 
        		+ stock.getName() + ", với mức tăng trưởng lên tới "
                + stock.getPercentChange() + "% , tức " + stock.getChangePrice() + " điểm. \n" +
                "Chúng ta có thể thấy rõ tín hiệu lạc quan của " + stock.getName() 
                + " khi mà hiện tại không phải cổ phiếu nào cũng đạt được mức tăng trưởng ấn tượng như vậy, "
                + "thậm chí còn rớt giá";
        
        upPassage[2] = "Trong số đó, cổ phiếu" + stock.getName() + " đã mang đến sự bất ngờ lớn khi đã tăng "
                + stock.getPercentChange() + "% ứng với " + stock.getChangePrice() + " điểm.\n" +
                "Đây là một trong những cú hích quan trọng thúc đẩy thị trường chứng khoán nói riêng và "
                + "nền kinh tế nói chung trong giai đoạn khá ảm đạm hiện nay";

        upPassage[3] = "Nổi bật nhất là mã " + stock.getName() + " khi đã tăng " + stock.getPercentChange()
                + "% tương đương " + stock.getChangePrice() + " điểm. Đây là điều rất tích \n" +
                "cực trong bối cảnh chung hiện nay.  Rất mong cổ phiếu này duy trì được đà tăng ấn \n" +
                "tượng như trên thúc đẩy nền kinh tế phát triển.";
        
        upPassage[4] = "Thị trường đóng cửa với tín hiệu lạc quan nhất thuộc về mã " + stock.getName()
                + " khi đã tăng " + stock.getPercentChange() + "% ứng với sô điểm: " + stock.getChangePrice() +
                "\nĐây được coi như là điều tích cực hiếm hoi xua đi không khí ảm đạm của \n" +
                "thị trường ngày hôm nay. Rất mong cổ phiếu này duy trì được đà tăng ấn tượng \n" +
                "như trên thúc đẩy nền kinh tế phát triển.";

        Random random = new Random();
        return upPassage[random.nextInt(4)];
    }

    public String createDownPassage (InDayStock stock) {

        downPassage[0] = "Mã cổ phiếu giảm sâu nhất là: " + stock.getName() + " đã giảm"
                + -stock.getPercentChange() + "% tức " + -stock.getChangePrice() + " điểm. Đây được \n" +
                "coi như sự mất mát rất lớn của ngày giao dịch hôm nay. Sau phiên giao  \n" +
                "dịch ngày hôm nay mã cổ phiếu này sẽ tăng điểm trở lại.";
        downPassage[1] = "Trong số đó, cổ phiếu " + stock.getName() + " gây thất vọng nhất khi đã giảm "
                + -stock.getPercentChange() + "% với số điểm đã mất là: " + -stock.getChangePrice() + "\nĐiều này đã " +
                "gây ra tâm lý hoang mang không chỉ cho nhà đầu tư mà còn ảnh hưởng tới rất nhiều\n" +
                "mã cổ phiếu khác. Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ " +
                "tăng điểm trở lại.";
        downPassage[2] = "Không mấy vui vẻ nhất là mã " + stock.getName() + " khi đã giảm " + -stock.getPercentChange()
                + "% ứng với " + -stock.getChangePrice() + " điểm. \nĐây sẽ là cú đấm mạnh kìm hãm sự phát " +
                "triển của mã cổ phiếu này. \nSau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu" +
                " này sẽ tăng điểm trở lại.";
        downPassage[3] = "Thị trường đóng cửa với tín hiệu bi quan nhất thuộc về mã " + stock.getName()
                + " khi đã giảm " + -stock.getPercentChange() + "% với số điểm: " + -stock.getChangePrice() +
                "\nĐiều này sẽ khiến cho tâm lý rất nhiều nhà đầu tư đi xuống kéo theo nhiều hệ lũy.\n" +
                "Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ tăng điểm trở lại.";
        downPassage[4] = "Mã cổ phiếu buồn nhất trong ngày hôm nay là " + stock.getName() + " khi đã giảm " +
                -stock.getPercentChange() + "% và đã mất " + -stock.getChangePrice() + " điểm.\n" +
                "Đây là có một mã chứng khoán lớn có ý nghĩa quan trọng đối với thị trường.\n" +
                "Sau phiên giao dịch ngày hôm nay hi vọng mã cổ phiếu này sẽ tăng điểm trở lại.";

        Random random = new Random();
        return downPassage[random.nextInt(4)];
    }

    public String comment(List<InDayStock> list) {
        String strShow5, strShow6, strShow7;
        double total = 0;
        for (InDayStock topStockInDay : list) {
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
    public static String upStock(List<InDayStock> upList) {
        upList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strUp;


        if (upList.size() > 0) {
            strUp = ("\nTổng kết lại đây là những mã cổ phiếu mới nổi,còn nhỏ nhưng đã tăng " +
                    "trưởng rất tốt và rất nhiều tiềm năng.");
            strUp = cr.comment(upList) +
                    cr.createUpPassage (upList.get(0)) + strUp;
        } else {
            strUp = ("Hôm nay thị trường đi xuống, không có mã cổ phiếu nào tăng điểm.");
        }
        return strUp;
    }

    // Sinh câu với mã giảm
    public static String downStock(List<InDayStock> downList) {
        downList.sort(new PercentChangeComparator());
        SentencesTopStockInDay cr = new SentencesTopStockInDay();
        String strDown;

        if (downList.size() > 0) {
            strDown = ("\nNói chung đây là các mã không quá lớn nên chưa ảnh hưởng nhiều tới toàn bộ thị trường,\n" +
                    "các nhà đầu xin hãy bình tĩnh cân nhắc đầu tư trong thời điểm này.");
            strDown = cr.comment(downList) +
                      cr.createDownPassage(downList.get(0)) + strDown;
        } else {
            strDown = ("Hôm nay quả thật là ngày rất vui khi không có mã cổ phiếu nào giảm điểm.");
        }
        return strDown;
    }
}
