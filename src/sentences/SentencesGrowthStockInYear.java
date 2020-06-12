

package sentences;


import java.util.List;

import javax.swing.text.JTextComponent;

import comparator.AvgTradeComparator;
import comparator.PercentChangeMaxComparator;
import comparator.PriceComparator;
import comparator.TotalAssetComparator;
import comparator.TotalVolumeComparator;
import models.GrowthStock;

public class SentencesGrowthStockInYear {

    private static final String[] PERCENT_CHANGE = {
            " có giá so với năm trước bằng ",
            " có sự thay đổi về giá so với năm trước là : ",
            " với giá là so với năm trước bằng "
    };

    private static final String TOTAL_VOLUME = "có khối lượng giao dịch trong năm là: ";

    private static final String[] PRICE = {" với giá: ", " có giá : "," hôm nay có giá giao dịch"};

    private static final String[] FIRST = {"","Mã ",""};

    private static final String[] MIN_PRICE = {" có giá thấp nhất là ", " là mã có giá thấp nhất trong tuần : ", " cán mốc cuối bảng với giá "};

    private static final String[] MAX_PRICE = {
            " có giá cao nhất trong năm là ",
            " là mã có giá cao nhất trong năm : ",
            " nằm ở đầu bảng với giá :  ",
            " đạt mốc đầu bảng với giá "
    };

    private static final String[] MAX_TOTAL_VOLUME = {
            " dù là mã có khối lượng giao dịch nhiều nhất trong hôm nay - ",
            " dù được giao dịch nhiều nhất trong năm với khối lượng là ",
            " dù đang rất được quan tâm với khối lượng giao dịch nhiều nhất "
    };

    private static final String[] MIN_TOTAL_VOLUME = {
            " và đang có khối lượng mua bán trong năm nằm ở vị trí cuối bảng ",
            " đang chững lại với khối lượng giao dịch thấp nhất năm- ",
            " nhưng là mã được giao dịch thấp nhất năm với "
    };

    private static final String[] MAX_PERCENT_CHANGE = {
            " có sự thay đổi về giá cao nhất so với năm trước, tăng: ",
            " năm này đã có sự tăng giá nhiều nhất so với các mã còn lại: ",
            " tăng giá rất mạnh so với năm qua: "
    };

    private static final String[] MIN_PERCENT_CHANGE = {
            " giảm giá vô cùng mạnh, so với năm trước giảm đến: ",
            " có sự tụt giảm về giá lớn nhất trong năm: ",
            " đang là mã cố phiếu giảm giá nhiều nhất: "
    };

    private static final String[] MAX_AVG_TRADE = {
            " có khối lượng giao dịch trung bình trong một năm tương đối cao, đứng ở vị trí đầu bảng: ",
            " là mã cổ phiếu có khối lượng giao dịch lớn nhất năm qua, đạt mức: ",
            " trong năm là mã có khối lượng giao dịch lớn nhất, có số liệu là: "
    };

    private static final String[] MIN_AVG_TRADE = {
            " có khối lượng giao dịch trung bình trong một năm tương đối thấp, đứng ở vị trí cuối bảng: ",
            " là mã cổ phiếu có khối lượng giao dịch thấp nhất năm qua, đạt mức: ",
            " trong năm là mã có khối lượng giao dịch thấp nhất, có số liệu là: "
    };

    private static final String[] MAX_TOTAL_ASSET = {
            " có vốn hóa lớn nhất: ",
            " với vốn hóa vô cùng lớn, đứng đầu bảng : ",
            " với số vốn hóa nằm ở đầu bảng "
    };

    private static final String[] MIN_TOTAL_ASSET = {
            " có vốn hóa nhỏ nhất: ",
            " có vốn hóa đứng cuối bảng, chỉ ",
            " có vốn hóa nằm ở vị trí dưới cùng trong bảng: "};

    public static String generateEvaluationOfMinPrice(List<GrowthStock> list) {

        String Sentence ;
        list.sort(new PriceComparator());
        int Nums= (int)(Math.random()*10)%3;
        int Numt= (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums] + list.get(0).getName()+" "+ MIN_PRICE[Numt] +list.get(0).getPrice()+ PERCENT_CHANGE[Nums]+" "+list.get(0).getPercentChange()+"%";
        return Sentence;

    }

    public static String generateEvaluationOfMaxPrice(List<GrowthStock> list) {

        String Sentence ;
        list.sort(new PriceComparator());
        int Nums= (int)(Math.random()*10)%3;
        int Numt= (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums]+ list.get(list.size()-1).getName()+" "+ PERCENT_CHANGE[Nums]+ list.get(list.size()-1).getPercentChange()+"%, "+ MAX_PRICE[Numt] +list.get(list.size()-1).getPrice();
        return Sentence;
    }

    public static String generateEvaluationOfMinTotalVolume(List<GrowthStock> list) {

        String Sentence ;
        list.sort(new TotalVolumeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums]+list.get(0).getName()+ PERCENT_CHANGE[Numf]+ list.get(0).getPercentChange()+"%"+ MIN_TOTAL_VOLUME[Numt] +list.get(0).getTotalVolume();
        return Sentence;
    }

    public static String generateEvaluationOfMaxTotalVolume(List<GrowthStock> list) {

        String Sentence ;
        list.sort(new TotalVolumeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums] + list.get(list.size()-1).getName() + MAX_TOTAL_VOLUME[Numt] +
                list.get(list.size()-1).getTotalVolume() + PERCENT_CHANGE[Numf] + list.get(list.size()-1).getPercentChange() + "%";
        return Sentence;
    }

    public static String generateEvaluationOfMaxPercentChange(List<GrowthStock>list) {

        String Sentence ;
        list.sort(new PercentChangeMaxComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = "1" + FIRST[Nums] + list.get(list.size()-1).getName() + PRICE[Numf] + list.get(list.size()-1).getPrice() +
                MAX_PERCENT_CHANGE[Numt] + list.get(list.size()-1).getPercentChangeMax() + "% và " + TOTAL_VOLUME
                + list.get(list.size()-1).getTotalVolume();
        return Sentence;
    }

    public static String generateEvaluationOfMinPercentChange(List<GrowthStock>list) {

        String Sentence ;
        list.sort(new PercentChangeMaxComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums]+list.get(0).getName()+ MIN_PERCENT_CHANGE[Numt]+list.get(0).getPercentChangeMax()+"%";
        return Sentence;
    }

    public static String generateEvaluationOfMaxAvgTrage(List<GrowthStock>list) {

        String Sentence ;
        list.sort(new AvgTradeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums] + list.get(list.size()-1).getName() + PERCENT_CHANGE[Numf] +
                list.get(list.size()-1).getPercentChange()+ "% " + MAX_AVG_TRADE[Numt] + list.get(list.size()-1).getAvgTrade();
        return Sentence;
    }

    public static String generateEvaluationOfMinAvgTrage(List<GrowthStock>list) {

        String Sentence ;
        list.sort(new AvgTradeComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums]+list.get(0).getName()+ MIN_AVG_TRADE[Numt]+list.get(0).getAvgTrade()+ PRICE[Numf]+list.get(0).getPrice() + " và " + PERCENT_CHANGE[Nums]+list.get(0).getPercentChange()+"%";
        return Sentence;
    }

    public static String generateEvaluationOfMaxTotalAsset (List<GrowthStock>list) {

        String Sentence ;
        list.sort(new TotalAssetComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums] + list.get(list.size()-1).getName() + MAX_TOTAL_ASSET[Numt] +
                list.get(list.size()-1).getTotalAsset() + PERCENT_CHANGE[Numf] + list.get(list.size()-1).getPercentChange() + "%" ;
        return Sentence;
    }

    public static String generateEvaluationOfMinTotalAsset (List<GrowthStock>list) {

        String Sentence ;
        list.sort(new TotalAssetComparator());
        int Nums = (int)(Math.random()*10)%3;
        int Numt = (int)(Math.random()*10)%3;
        int Numf = (int)(Math.random()*10)%3;
        Sentence = FIRST[Nums] + list.get(0).getName() + PERCENT_CHANGE[Numf] +
                list.get(0).getPercentChange()+"%"+ MIN_TOTAL_ASSET[Numt]+list.get(0).getAvgTrade();
        return Sentence;
    }

    public static String generateSentences(List <GrowthStock> list) {
    	    	
        return "Như vậy, thống kê biến động giá có một số đặc biệt : "
                + "\n Trong năm nay, " + SentencesGrowthStockInYear.generateEvaluationOfMinPrice(list)
                + "\n Đối lập lại, " + SentencesGrowthStockInYear.generateEvaluationOfMaxPrice(list)
                + "\n Trong khi đó," + SentencesGrowthStockInYear.generateEvaluationOfMinTotalVolume(list)
                + "\n Ngược lại, " + SentencesGrowthStockInYear.generateEvaluationOfMaxTotalVolume(list)
                + "\n Tiếp theo, " + SentencesGrowthStockInYear.generateEvaluationOfMaxAvgTrage(list)
                + "\n Bên phía ngược lại, " + SentencesGrowthStockInYear.generateEvaluationOfMinAvgTrage(list)
                + "\n Cũng không bất ngờ khi " + SentencesGrowthStockInYear.generateEvaluationOfMaxPercentChange(list)
                + "\n Bên cạnh đó " + SentencesGrowthStockInYear.generateEvaluationOfMinPercentChange(list)
                + "\n Cuối cùng, " + SentencesGrowthStockInYear.generateEvaluationOfMaxTotalAsset(list)
                + "\n Và " + SentencesGrowthStockInYear.generateEvaluationOfMinTotalAsset(list)
                + "\n Để biết thêm thông tin chi tiết, vui lòng truy cập: https://s.cafef.vn/thong-ke/san-all.chn";
    }
}


