package sentences;

import entity.Index;
import java.util.List;
import java.util.Random;

public class SentencesIndex {

    // chot phien giao dich
    private static final String[] TANG = {
            "Đóng cửa phiên giao dịch, [name] tăng [change] điểm tức [percentChange]%, lên [point] điểm" ,
            "Chốt phiên hôm nay, [name] đạt [point] điểm, tăng [change] điểm ứng với [percentChange]%. ",
            "Chốt phiên hôm nay, [name] thẻ hiện tín hiệu tích cực khi tăng [change] điểm ([percentChange]%), lên [point] điểm",
    };

    private static final String[] GIAM = {
            "Đóng cửa phiên giao dịch, [name] giảm [change] điểm tức [percentChange]%, đạt [point] điểm",
            "Kết thúc phiên giao dịch, [name] đóng cửa tại [point] điểm, tức là đã \"bốc hơi\" [change] điểm, tương đương [percentChange]%",
            "Chốt phiên hôm nay, [name] thẻ hiện tín hiệu thiếu lạc quan khi giảm [change] điểm ([percentChange]%), xuống còn [point] điểm"
    };


    // do thi cay nen
    private static final String[] NEN_XANH = {
            "Giao dịch hôm nay tạo thành cây nến màu xanh.",
            "Giao dịch hôm nay tạo thành cây nến màu xanh với giá đóng cửa cũng gần với giá cao nhât trong ngày.",
            "Giao dịch hôm nay tạo thành cây nến màu xanh với giá đóng cửa là giá cao nhât trong ngày."
    };

    private static final String[] NEN_DO = {
            "Giao dịch hôm nay tạo thành cây nến màu đỏ.",
            "Giao dịch hôm nay tạo thành cây nến màu đỏ với giá đóng cửa cũng gần với giá thấp nhât trong ngày.",
            "Giao dịch hôm nay tạo thành cây nến màu đỏ với giá đóng cửa là giá thấp nhât trong ngày."
    };


    // khoi luong giao dich

    public static final String[] FORM = {
            "[name] hôm nay chuyển nhượng hơn [totalVolume] triệu cổ phiếu, đạt giá trị hơn [totalMarket] tỷ đồng.",
            "[name] hôm nay sang tay hơn [totalVolume] triệu cổ phiếu, đạt giá trị hơn [totalMarket] tỷ đồng.",
            "[name] hôm nay giao dịch hơn [totalVolume] triệu cổ phiếu, đạt giá trị hơn [totalMarket] tỷ đồng.",
            "[name] hôm nay mua bán hơn [totalVolume] triệu cổ phiếu, đạt giá trị hơn [totalMarket] tỷ đồng."
    };


    // lien tiep
    public static final String[] TANG_LIEN_TIEP = {
            "Như vậy đây đã là ngày thứ [soNgayLienTiep] liên tiếp chỉ số [name] tăng điểm. " +
                    "Tổng cộng trong [soNgayLienTiep] ngày tăng được [totalPoint] điểm."
    };

    public static final String[] GIAM_LIEN_TIEP = {
            "Như vậy đây đã là ngày thứ [soNgayLienTiep] liên tiếp chỉ số [name] giảm điểm. " +
                    "Tổng cộng trong [soNgayLienTiep] ngày đã bị mất [totalPoint] điểm."
    };


    // mo cua giao dich
    private static final String[] GIA_TANG = {
            "[name] khởi đầu phiên giao dịch trong không khí hứng khởi, " +
                    "tăng [openingChange] điểm, tương đương [openingChangePercent]%, đạt [openingPrice] điểm.",

            "[name] có khởi đầu thuận lợi trong phiên hôm nay khi tăng [openingChange] điểm, tương đương [openingChangePercent]%" +
                    ", lên [openingPrice] điểm",
    };
    private static final String[] TIEP_TUC_TANG = {
            "Tiếp tục tín hiệu khởi sắc từ hôm qua, bước vào đầu phiên giao dịch, [name] tăng [openingChange] điểm, " +
                    "tương đương [openingChangePercent]%, dừng ở [openingPrice] điểm.",

            "Mở cửa hôm nay, [name] tiếp tục tín hiệu lạc quan khi nhích thêm [openingChange] điểm " +
                    "(tương đương [openingChangePercent]%)"
    };

    private static final String[] GIA_GIAM = {
            "Mở đầu phiên với sắc đỏ, [name] giảm [openingChange] điểm, tương đương [openingChangePercent]%, xuống còn [openingPrice] điểm."
    };

    public static final String[] TIEP_TUC_GIAM = {
            "Tiếp tục không khí ảm đạm như hôm qua, mở cửa hôm nay, [name] giảm còn [openingChange], tương đương [openingPerCentChange]%" +
                    "đạt [openingPrice] điểm"
    };

    // so voi phien truoc
    public static final String[] SENTENCE_FORM = {
            "Tiếp đà tăng hôm qua, [name] hôm nay tiếp tục [levelChange]. ",
            "Tiếp đà giảm hôm qua, [name] hôm nay tiếp tục [levelChange]. ",
            "Trái với hôm qua, [name] hôm nay [levelChange]. "
    };


    // số ngày liên tiếp cùng tăng/ cùng giảm tính từ hôm nay
    // lấy từ danh sách index cho trước
    public static int daysContinuously(List<Index> indexList) {
        int day = 1;
        // Index today = indexList.get(0);
        for(int i = 0; i < indexList.size() - 1; i++) {
            if(indexList.get(i).getPercentChange() * indexList.get(i+1).getPercentChange() > 0) {
                day++;
            }
            else break;
        }
        return day;
    }
    // nếu có day>3 ngày liên tiếp cùng tăng/giảm, tính tổng sự thay đổi giá

    public static double getSumOfChange(List<Index> indexList) {
        double sum = 0;
        int day = daysContinuously(indexList);
        if (day < 3) {
            return sum;
        } else {
            // Index index = indexList.get(0);
            for(int i = 0; i < day; i++) {
                sum += indexList.get(i).getChangePrice();
            }
        }

        // round the result
        int intSum = (int) (sum*100);
        sum = intSum/100.0;
        return sum;
    }
    public static String lienTiep(List<Index> indexList) {
        String sentence = "";
        if(getSumOfChange(indexList) > 0)
            sentence = getRandomForm(TANG_LIEN_TIEP);
        else if(getSumOfChange(indexList) < 0)
            sentence = getRandomForm(GIAM_LIEN_TIEP);

        sentence = sentence.replace("[soNgayLienTiep]", Integer.toString(daysContinuously(indexList)));
        sentence = sentence.replace("[totalPoint]", Double.toString(Math.abs(getSumOfChange(indexList))));

        sentence = insertData(sentence, indexList.get(0));

        return sentence;
    }

    public static String moCuaGiaoDich(List<Index> indexList) {
        String sentence;

        Index today = indexList.get(0);
        Index previous = indexList.get(1);

        if(today.getOpeningChange() > 0) {
            if(previous.getChangePrice() > 0) {
                sentence = getRandomForm(TIEP_TUC_TANG);
            }
            else sentence = getRandomForm(GIA_TANG);
        }
        else {
            if(previous.getChangePrice() < 0 ) {
                sentence = getRandomForm(TIEP_TUC_GIAM);
            }
            else sentence = getRandomForm(GIA_GIAM);
        }

        sentence = sentence.replace("[openingChange]", Double.toString(Math.abs(today.getOpeningChange())));
        sentence = sentence.replace("[openingPrice]", Double.toString(today.getOpeningPrice()));
        sentence = sentence.replace("[openingChangePercent]", Double.toString(Math.abs(today.getOpeningChangePercent())));

        sentence = insertData(sentence, today);

        return sentence;
    }





    public static String soVoiPhienTruoc(List<Index> indexList) {
        String sentence;

        Index today = indexList.get(0);
        Index previous = indexList.get(1);
        // select form
        if (today.getChangePrice() > 0 && previous.getChangePrice() > 0) {
            sentence = SENTENCE_FORM[0].replace("[name]", today.getName());
            sentence = sentence.replace("[levelChange]", today.levelChange());
        }
        else if (today.getChangePrice() < 0 && previous.getChangePrice() < 0) {
            sentence = SENTENCE_FORM[1].replace("[name]", today.getName());
            sentence = sentence.replace("[levelChange]", today.levelChange());
        } else {
            sentence = SENTENCE_FORM[2].replace("[name]", today.getName());
            sentence = sentence.replace("[levelChange]", today.levelChange());
        }

        // complete sentence
        sentence = sentence.replace("[levelChange]", today.levelChange());

        sentence = insertData(sentence, today);

        return sentence;
    }


    public static String doThiCayNen(Index index) {
        String sentence = "";

        if(index.getOpeningPrice() < index.getClosingPrice()) {
            if(index.getClosingPrice() == index.getHighestPrice())
                sentence = NEN_XANH[2];
            else if(index.getHighestPrice() - index.getClosingPrice() <= 1)
                sentence = NEN_XANH[1];
            else sentence = NEN_XANH[0];
        }

        if(index.getOpeningPrice() > index.getClosingPrice()) {
            if(index.getClosingPrice() == index.getLowestPrice())
                sentence = NEN_DO[2];
            else if(index.getClosingPrice() - index.getLowestPrice() <= 1)
                sentence = NEN_DO[1];
            else sentence = NEN_DO[0];
        }

        return sentence;
    }

    public static String chotPhienGiaoDich(Index index) {

        String sentence = "";

        if(index.getChangePrice() > 0) sentence = getRandomForm(TANG);
        else if(index.getChangePrice() < 0) sentence = getRandomForm(GIAM);

        sentence = insertData(sentence, index);

        return sentence;
    }

    public static String khoiLuongGiaoDich(Index index) {

        String sentence = getRandomForm(FORM);

        sentence = insertData(sentence, index);

        return sentence;
    }

    // complete sentence
    public static String insertData(String sample, Index index) {

        sample = sample.replace("[name]" , index.getName());
        sample = sample.replace("[change]", Double.toString(Math.abs(index.getChangePrice())) );
        sample = sample.replace("[percentChange]", Double.toString(Math.abs(index.getPercentChange())) );
        sample = sample.replace("[point]", Double.toString(index.getClosingPrice()) );
        sample = sample.replace("[closingPrice]", Double.toString(index.getOpeningPrice()) );
        sample = sample.replace("[totalVolume]",Long.toString(index.getTotalVolume()/1000000) );
        sample = sample.replace("[totalMarket]", Long.toString(index.getTotalMarket()/1000) );

        return sample;
    }

    public static String getRandomForm(String[] sentenceForm) {
        Random rd = new Random();
        int form = rd.nextInt(sentenceForm.length);
        return sentenceForm[form];
    }
    
    //minhstart
    public static String generateSentences(List<Index> indexList, String indexName) {

        return  "Cập nhật chỉ số " + indexName + " cuối ngày " + indexList.get(0).getDay() + " : " +
                "\n" + moCuaGiaoDich(indexList) +
                "\n" + chotPhienGiaoDich(indexList.get(0)) +
                "\n" + soVoiPhienTruoc(indexList) +
                "\n" + khoiLuongGiaoDich(indexList.get(0)) +
                "\n" + doThiCayNen(indexList.get(0)) +
                "\n" + lienTiep(indexList);
    }

}
