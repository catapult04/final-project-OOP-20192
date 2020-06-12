package sentences;

import java.util.List;
import comparator.AvgTradeComparator;
import comparator.PercentChangeMaxComparator;
import comparator.PriceComparator;
import comparator.TotalAssetComparator;
import comparator.TotalVolumeComparator;
import objects.HotStock;

public class SentencesHotStock {
	private String time;
	
    private final String[] PRICE;
    private final String[] MIN_PRICE;
    private final String[] MAX_PRICE;
    private final String[] MAX_VOLUME;
    private final String[] MIN_VOLUME;
    private final String[] VOLUME;
    private final String[] PERCENT_CHANGE;
    private final String[] MAX_PERCENT_CHANGE;
    private final String[] MIN_PERCENT_CHANGE;
    private final String[] MAX_AVG_TRADE;
    private final String[] MIN_AVG_TRADE;
    private final String[] MAX_MARKET_CAP;
    private final String[] MIN_MARKET_CAP;

    
    public SentencesHotStock(String time) {
		this.time = time;
		PERCENT_CHANGE = new String[] {
	            " có giá so với " + time + " trước bằng ",
	            " có sự thay đổi về giá so với " + time + " trước là : ",
	            " với giá là so với " + time + " trước bằng "
	    };
		VOLUME = new String[] {
				" trong " + time + " này đạt khối lượng giao dịch ",
				" có khối lượng giao dịch trong " + time + " là "				
		};
		PRICE = new String[] {" có giá: ",	" với giá : ", "đạt mức giá ",  " có giá giao dịch là "};
		MIN_PRICE = new String[] {" có giá thấp nhất là ", " là mã có giá thấp nhất trong " + time + ": ", " cán mốc cuối bảng với giá "};
		MAX_PRICE = new String[] {
	            " có giá cao nhất trong " + time + " là ",
	            " là mã có giá cao nhất trong " + time + ": ",
	            " nằm ở đầu bảng với giá :  ",
	            " đạt mốc đầu bảng với giá "
	    };
		MAX_VOLUME = new String[] {
	            " dù là mã có khối lượng giao dịch nhiều nhất trong hôm nay - ",
	            " dù được giao dịch nhiều nhất trong " + time + " với khối lượng là ",
	            " dù đang rất được quan tâm với khối lượng giao dịch nhiều nhất "
	    };
		MIN_VOLUME = new String[] {
	            " và đang có khối lượng mua bán trong năm nằm ở vị trí cuối bảng ",
	            " đang chững lại với khối lượng giao dịch thấp nhất năm- ",
	            " nhưng là mã được giao dịch thấp nhất " + time + " với "
	    };
		MAX_PERCENT_CHANGE = new String[] {
	            " có sự thay đổi về giá cao nhất so với " + time + " trước, tăng: ",
	            time + " này đã có sự tăng giá nhiều nhất so với các mã còn lại: ",
	            " tăng giá rất mạnh so với " + time + " qua: "
	    };
		MIN_PERCENT_CHANGE = new String[] {
	            " giảm giá vô cùng mạnh, so với " + time + " trước giảm đến: ",
	            " có sự tụt giảm về giá lớn nhất trong " + time + ": ",
	            " đang là mã cố phiếu giảm giá nhiều nhất: "
	    };
		MAX_AVG_TRADE = new String[] {
	            " có khối lượng giao dịch trung bình trong một " + time + " tương đối cao, đứng ở vị trí đầu bảng: ",
	            " là mã cổ phiếu có khối lượng giao dịch lớn nhất " + time + " qua, đạt mức: ",
	            " trong " + time + " là mã có khối lượng giao dịch lớn nhất, có số liệu là: "
	    };
		MIN_AVG_TRADE = new String[] {
	            " có khối lượng giao dịch trung bình trong một " + time + " tương đối thấp, đứng ở vị trí cuối bảng: ",
	            " là mã cổ phiếu có khối lượng giao dịch thấp nhất " + time + " qua, đạt mức: ",
	            " trong " + time + " là mã có khối lượng giao dịch thấp nhất, có số liệu là: "
	    };
		MAX_MARKET_CAP = new String[] {
	            " có vốn hóa lớn nhất: ",
	            " với vốn hóa vô cùng lớn, đứng đầu bảng : ",
	            " với số vốn hóa nằm ở đầu bảng "
	    };
		MIN_MARKET_CAP = new String[] {
	            " có vốn hóa nhỏ nhất: ",
	            " có vốn hóa đứng cuối bảng, chỉ ",
	            " có vốn hóa nằm ở vị trí dưới cùng trong bảng: "
	    };
	}
    
    
    public String generateEvaluationOfMinPrice(List<HotStock> list) {
        String Sentence ;
        list.sort(new PriceComparator());
        int ran1= (int)(Math.random()*10)%3;
        int ran2= (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(0).getName()+" "+ MIN_PRICE[ran2] +list.get(0).getPrice()+ PERCENT_CHANGE[ran1]+" "+list.get(0).getPercentChange()+"%";
        return Sentence;
    }

    public String generateEvaluationOfMaxPrice(List<HotStock> list) {
        String Sentence ;
        list.sort(new PriceComparator());
        int ran1= (int)(Math.random()*10)%3;
        int ran2= (int)(Math.random()*10)%3;
        Sentence = "Mã "+ list.get(list.size()-1).getName()+" "+ PERCENT_CHANGE[ran1]+ list.get(list.size()-1).getPercentChange()+"%, "+ MAX_PRICE[ran2] +list.get(list.size()-1).getPrice();
        return Sentence;
    }

    public String generateEvaluationOfMinTotalVolume(List<HotStock> list) {
        String Sentence ;
        list.sort(new TotalVolumeComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã "+ list.get(0).getName()+ PERCENT_CHANGE[ran3]+ list.get(0).getPercentChange()+"%"+ MIN_VOLUME[ran2] +list.get(0).getTotalVolume();
        return Sentence;
    }

    public String generateEvaluationOfMaxTotalVolume(List<HotStock> list) {
        String Sentence ;
        list.sort(new TotalVolumeComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(list.size()-1).getName() + MAX_VOLUME[ran2] +
                list.get(list.size()-1).getTotalVolume() + PERCENT_CHANGE[ran3] + list.get(list.size()-1).getPercentChange() + "%";
        return Sentence;
    }

    public String generateEvaluationOfMaxPercentChange(List<HotStock>list) {
        String Sentence ;
        list.sort(new PercentChangeMaxComparator());
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        int ran1 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(list.size()-1).getName() + PRICE[ran3] + list.get(list.size()-1).getPrice() +
                MAX_PERCENT_CHANGE[ran2] + list.get(list.size()-1).getPercentChangeMax() + "% và " + VOLUME[ran1]
                + list.get(list.size()-1).getTotalVolume();
        return Sentence;
    }

    public String generateEvaluationOfMinPercentChange(List<HotStock>list) {
        String Sentence ;
        list.sort(new PercentChangeMaxComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(0).getName()+ MIN_PERCENT_CHANGE[ran2]+list.get(0).getPercentChangeMax()+"%";
        return Sentence;
    }

    public String generateEvaluationOfMaxAvgTrage(List<HotStock>list) {
        String Sentence ;
        list.sort(new AvgTradeComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(list.size()-1).getName() + PERCENT_CHANGE[ran3] +
                list.get(list.size()-1).getPercentChange()+ "% " + MAX_AVG_TRADE[ran2] + list.get(list.size()-1).getAvgTrade();
        return Sentence;
    }

    public String generateEvaluationOfMinAvgTrage(List<HotStock>list) {
        String Sentence ;
        list.sort(new AvgTradeComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã "+list.get(0).getName()+ MIN_AVG_TRADE[ran2]+list.get(0).getAvgTrade()+ PRICE[ran3]+list.get(0).getPrice() + " và " + PERCENT_CHANGE[ran1]+list.get(0).getPercentChange()+"%";
        return Sentence;
    }

    public String generateEvaluationOfMaxTotalAsset (List<HotStock>list) {
        String Sentence ;
        list.sort(new TotalAssetComparator());
        int ran1 = (int)(Math.random()*10)%3;
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(list.size()-1).getName() + MAX_MARKET_CAP[ran2] +
                list.get(list.size()-1).getTotalAsset() + PERCENT_CHANGE[ran3] + list.get(list.size()-1).getPercentChange() + "%" ;
        return Sentence;
    }

    public String generateEvaluationOfMinTotalAsset (List<HotStock>list) {
        String Sentence ;
        list.sort(new TotalAssetComparator());
        
        int ran2 = (int)(Math.random()*10)%3;
        int ran3 = (int)(Math.random()*10)%3;
        Sentence = "Mã " + list.get(0).getName() + PERCENT_CHANGE[ran3] +
                list.get(0).getPercentChange()+"%"+ MIN_MARKET_CAP[ran2]+list.get(0).getAvgTrade();
        return Sentence;
    }

    public String generateSentences(List <HotStock> list) {
        return  "Như vậy trong " + time + " này, " + generateEvaluationOfMinPrice(list)
                + "\nĐối lập lại, " + generateEvaluationOfMaxPrice(list)
                + "\nTrong khi đó," + generateEvaluationOfMinTotalVolume(list)
                + "\nNgược lại, " + generateEvaluationOfMaxTotalVolume(list)
                + "\nTiếp theo, " + generateEvaluationOfMaxAvgTrage(list)
                + "\nBên phía ngược lại, " + generateEvaluationOfMinAvgTrage(list)
                + "\nCũng không bất ngờ khi " + generateEvaluationOfMaxPercentChange(list)
                + "\nBên cạnh đó " + generateEvaluationOfMinPercentChange(list)
                + "\nCuối cùng, " + generateEvaluationOfMaxTotalAsset(list)
                + "\nVà " + generateEvaluationOfMinTotalAsset(list) + ".";
    }
}