package sentences;


import java.util.List;
import comparator.AvgTradeComparator;
import comparator.PercentChangeMaxComparator;
import comparator.PriceComparator;
import comparator.TotalAssetComparator;
import comparator.TotalVolumeComparator;
import entity.GrowthStock;

public class SentencesGrowthStock {

    private static String[] PERCENT_CHANGE = {};

    private static String TOTAL_VOLUME = "";

    private static String[] PRICE = {};

    private static String[] FIRST = {};

    private static String[] MIN_PRICE = {};

    private static String[] MAX_PRICE = {};

    private static String[] MAX_TOTAL_VOLUME = {};

    private static String[] MIN_TOTAL_VOLUME = {};

    private static String[] MAX_PERCENT_CHANGE = {};

    private static String[] MIN_PERCENT_CHANGE = {};

    private static String[] MAX_AVG_TRADE = {};

    private static String[] MIN_AVG_TRADE = {};

    private static String[] MAX_TOTAL_ASSET = {};

    private static String[] MIN_TOTAL_ASSET = {};


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
        return "";
    }
}

