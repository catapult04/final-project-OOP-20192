package sentences;

import java.util.List;
import java.util.Random;
import entity.TopStockForeignersLove;

public class SentencesForeignerLove {
	
	private static final String[] CAU_1 = new String[] {
			"Hôm nay, khối lượng giao dịch ròng của đầu tư nước ngoài trên sàn HOSE cao nhất là các mã [name 0], [name 1], [name 2], [name 3], [name 4].\n",
			"Tại TP.HCM, trong ngày hôm nay các nhà đầu tư nước ngoài tích cực giao dịch với mã cổ phiếu [name 0], [name 1], [name 2], [name 3], [name 4].\n",
			"Trên sàn HOSE, các mã [name 0], [name 1], [name 2], [name 3], [name 4] lần lượt là các mã được đầu tư nước ngoài giao dịch ròng nhiều nhất ngày hôm nay.\n",
			"Các mã cổ phiếu [name 0], [name 1], [name 2], [name 3], [name 4] là các mã có chỉ số khối lượng giao dịch ròng của khối ngoại lớn nhất hôm nay trên sàn HOSE.\n"
	};
	
	private static final String[] CAU_2 = new String[] {
			"Có thể thấy khối lượng mua của các mã này lần lượt là [KL mua 0], [KL mua 1], [KL mua 2], [KL mua 3], [KL mua 4] cổ phiếu.\n",
			"Cụ thể các mã lần lượt có khối lượng mua là [KL mua 0], [KL mua 1], [KL mua 2], [KL mua 3], [KL mua 4] cổ phiếu.\n",
			"Chi tiết các mã có khối lượng mua tương ứng là [KL mua 0], [KL mua 1], [KL mua 2], [KL mua 3], [KL mua 4] cổ phiếu.\n",
			"Các nhà đầu tư nước ngoài đã mua vào [KL mua 0], [KL mua 1], [KL mua 2], [KL mua 3], [KL mua 4] cổ phiếu của các mã này.\n"
	};
	
	private static final String[] CAU_3 = new String[] {
			"Trong khi đó, khối lượng bán tương ứng chỉ là [KL ban 0], [KL ban 1], [KL ban 2], [KL ban 3], [KL ban 4] cổ phiếu.\n",
			"Trái với lượng mua, khối lượng bán của các mã này chỉ là [KL ban 0], [KL ban 1], [KL ban 2], [KL ban 3], [KL ban 4] cổ phiếu.\n",
			"Không như lượng mua, lượng các nhà đầu tư nước ngoài bán ra chỉ là [KL ban 0], [KL ban 1], [KL ban 2], [KL ban 3], [KL ban 4] cổ phiếu.\n",
			"Tuy nhiên, các nhà đầu tư nước ngoài bán đi lượng cổ phiếu lần lượt chỉ là [KL ban 0], [KL ban 1], [KL ban 2], [KL ban 3], [KL ban 4] cổ phiếu.\n"
	};
	
	private static final String[] CAU_4 = new String[] {
			"Vốn hóa các khối lượng giao dịch lần lượt là hơn [GTGD 0], [GTGD 1], [GTGD 2], [GTGD 3], [GTGD 4] tỷ đồng.\n",
			"Giá trị giao dịch lần lượt là hơn [GTGD 0], [GTGD 1], [GTGD 2], [GTGD 3], [GTGD 4] tỷ đồng.\n",
			"Tương ứng với các giá trị giao dịch là hơn [GTGD 0], [GTGD 1], [GTGD 2], [GTGD 3], [GTGD 4] tỷ đồng.\n",
			"Với khối lượng mua và bán như vậy thì giá trị giao dịch tương ứng là hơn [GTGD 0], [GTGD 1], [GTGD 2], [GTGD 3], [GTGD 4] tỷ đồng.\n"
	};
	
	private static final String[] CAU_5 = new String[] {
			"Như vậy, nước ngoài hiện đang nắm giữ tương ứng là [pc 0], [pc 1], [pc 2], [pc 3], [pc 4]% cổ phần công ty ứng với các mã cổ phiếu trên.\n",
			"Sau phiên giao dịch hôm nay thì các nhà đầu tư nước ngoài lần lượt còn [pc 0], [pc 1], [pc 2], [pc 3], [pc 4]% cổ phần công ty của các mã chứng khoán trên.\n",
			"Kết thúc phiên giao dịch hôm nay nước ngoài còn sở hữu lần lượt là [pc 0], [pc 1], [pc 2], [pc 3], [pc 4]% cổ phần của các công ty trên.\n",
			"Vậy chốt phiên giao dịch ngày hôm nay thì các công ty đại diện cho các mã cổ phiếu này lần lượt có [pc 0], [pc 1], [pc 2], [pc 3], [pc 4]% cổ phần công ty thuộc về các nhà đầu tư nước ngoài.\n"
	};
	
	private static final String[] CAU_6 = new String[] {
			"Từ đó có thể thấy các mã cố phiếu [name 0], [name 1], [name 2], [name 3], [name 4] đang nhận được sự quan tâm lớn từ các nhà đầu tư nước ngoài.\n",
			"Qua đây nhận thấy rằng các cổ phiếu [name 0], [name 1], [name 2], [name 3], [name 4] có tiềm năng phát triển lớn khi thu hút được đầu tư nước ngoài.\n",
			"Có thể dự đoán các mã [name 0], [name 1], [name 2], [name 3], [name 4] sẽ tăng giá trong vài ngày tới khi thu hút được các nhà đầu tư nước ngoài.\n"
			
	};
	
	private static final String[] CAU_7 = new String[] {
			"Bên cạnh đó có những mã như [name 5], [name 6], [name 7], [name 8], [name 9] cũng có khối lượng giao dịch ròng khá cao.\n",
			"Những cái tên còn lại trong top 10 khối lượng giao dịch ròng là các mã [name 5], [name 6], [name 7], [name 8], [name 9].\n"
	};
	
	private static final String[] CAU_8 = new String[] {
			"Trong đó có mã [name]có giá trị giao dịch ròng trên 10 tỷ đồng.\n",
			"Tuy nhiên không có mã nào có giá trị giao dịch ròng trên 10 tỷ đồng.\n"
	};
	
	private static final String[] CAU_9 = new String[] {
			"Có thể thấy thị trường đang [overview] về giao dịch đầu tư nước ngoài.\n",
			"Với tình hình như vậy chúng ta nhận thấy thị trường đang [overview] về chỉ số của khối ngoại.\n"
	};
	
	private static final String[] CAU_10_1 = new String[] {
			"Nhìn chung, khối ngoại đang cho thấy dấu hiệu tích cực khi giao dịch trên sàn HOSE.\n",
			"Tổng quan lại, các mã cổ phiếu trên đang đem lại dấu hiệu tích cực ở khối ngoại cho sàn đầu tư TP.HCM.\n"
	};
	
	private static final String[] CAU_10_2 = new String[] {
			"Nhìn chung, khối ngoại vẫn tỏ ra thận trọng khi đầu tư vào sàn chứng khoán HOSE.\n",
			"Tổng quan có thể thấy sàn HOSE vẫn chưa thực sự thu hút được đầu tư lớn của nước ngoài.\n"
	};


	//phương thức random
	public static String getRandom(String[] array) {
	       int rnd = new Random().nextInt(array.length);
	       return array[rnd];
	}
	
	//mô tả dữ liệu
	public static String describeData(List<TopStockForeignersLove> lst) {
		String s = getRandom(CAU_1)+getRandom(CAU_2)+getRandom(CAU_3)+getRandom(CAU_4)+getRandom(CAU_5)+getRandom(CAU_6)+getRandom(CAU_7);
		for (int i = 0; i < 5; ++i) {
			s = s.replace("[name "+i+"]", lst.get(i).getName());
			s = s.replace("[name "+ (i + 5) +"]", lst.get(i+5).getName());
			s = s.replace("[KL mua "+i+"]", Long.toString(lst.get(i).getTotalVolumeBuy()));
			s = s.replace("[KL ban "+i+"]", Long.toString(lst.get(i).getTotalVolumeSell()));
			s = s.replace("[GTGD "+i+"]", Long.toString(Math.abs(lst.get(i).getTotalValueNet()/1000)));
			s = s.replace("[pc "+i+"]", Double.toString(lst.get(i).getPercentOwned()));
		}
		return s;
	}
	
	//nhận xét dữ liệu
	public static String commentData(List<TopStockForeignersLove> lst) {
		String s;
		List<TopStockForeignersLove> topUpper = TopStockForeignersLove.topUpper(lst);
		if (topUpper.size() == 0)
			s = CAU_8[1]+getRandom(CAU_9);
		else
			s = CAU_8[0]+getRandom(CAU_9);
		s = s.replace("[overview]", TopStockForeignersLove.overview(lst));
		if (topUpper.size() > 0) {
			StringBuilder name = new StringBuilder();
			for (TopStockForeignersLove j: topUpper)
				name.append(j.getName()).append(", ");
			s = s.replace("[name]", name.toString());
		}
		if (topUpper.size() < 4) s = s + getRandom(CAU_10_2);
		else s = s + getRandom(CAU_10_1);
		return s;
	}
	
	//sinh đoạn văn
	public static String generateSentences(List<TopStockForeignersLove> lst) {
		return describeData(lst) + commentData(lst);
	}

}