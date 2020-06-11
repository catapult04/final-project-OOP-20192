package application;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import crawldata.GetGrowthStockInMonth;
import crawldata.GetGrowthStockInQuarter;
import crawldata.GetGrowthStockInWeek;
import crawldata.GetGrowthStockInYear;
import crawldata.GetIndex;
import crawldata.GetTopStockForeignersLove;
import crawldata.GetTopStockInDay;
import entity.GrowthStock;
import entity.Index;
import entity.TopStockForeignersLove;
import entity.TopStockInDay;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sentences.SentencesForeignerLove;
import sentences.SentencesGrowthStockInMonth;
import sentences.SentencesGrowthStockInQuarter;
import sentences.SentencesGrowthStockInWeek;
import sentences.SentencesGrowthStockInYear;
import sentences.SentencesIndex;
import sentences.SentencesTopStockInDay;
import table.TableForeignerLove;
import table.TableGrowthStockInMonth;
import table.TableGrowthStockInQuarter;
import table.TableGrowthStockInWeek;
import table.TableGrowthStockInYear;
import table.TableIndex;
import table.TableTopStockInDay;

public class Controller implements Initializable{
	@FXML	
	private TextField stockField = new TextField();
	@FXML
	private ComboBox<String> exchangeBox = new ComboBox();
	@FXML
	private Button buttonXem = new Button(),
				   buttonTop10 = new Button(),
				   buttonTangmanh = new Button(),
				   buttonGiammanh = new Button(),
				   buttonTrongtuan = new Button(),
				   buttonTrongthang = new Button(),
				   buttonTrongquy = new Button(),
				   buttonTrongnam = new Button();
	@FXML 
	private TextArea sentencesArea = new TextArea();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		ObservableList<String> exchangeList = FXCollections.observableArrayList("HOSE", "UPCOME", "VN30", "HASTC");
		exchangeBox.setItems(exchangeList);
		
		
		//event handler:
		buttonXem.setOnAction(event ->{
			String indexName = stockField.getText();
			List<Index> indexList = GetIndex.crawlData(indexName); // Lấy dữ liệu
			String str = SentencesIndex.generateSentences(indexList, indexName).toString(); // Sinh câu
			new TableIndex(indexList);
			sentencesArea.setText(str);
		});
		
		buttonTop10.setOnAction(event -> {
			List<TopStockForeignersLove> foreignerList = GetTopStockForeignersLove.crawlData();
			String str = SentencesForeignerLove.generateSentences(foreignerList);;
            sentencesArea.setText(str);
            new TableForeignerLove(foreignerList);
		});
		
		buttonTangmanh.setOnAction(event -> {
			List<TopStockInDay> upStockList = GetTopStockInDay.crawlData("Up");
			String str = SentencesTopStockInDay.upStock(upStockList);
            sentencesArea.setText(str);
            new TableTopStockInDay(upStockList, "Up");
		});
		
		buttonGiammanh.setOnAction(event -> {
			List<TopStockInDay> downStockList = GetTopStockInDay.crawlData("Down");
			String str = SentencesTopStockInDay.downStock(downStockList);
            sentencesArea.setText(str);
            new TableTopStockInDay(downStockList, "Down");
		});
		
		buttonTrongtuan.setOnAction(event -> {
			List<GrowthStock> growthList = GetGrowthStockInWeek.crawlData();
			String str = SentencesGrowthStockInWeek.generateSentences(growthList);
			sentencesArea.setText(str);
			new TableGrowthStockInWeek(growthList);
		});
		
		buttonTrongthang.setOnAction(event -> {
			List<GrowthStock> growthList1 = GetGrowthStockInMonth.crawlData();
			String str = SentencesGrowthStockInMonth.generateSentences(growthList1);
			sentencesArea.setText(str);
			new TableGrowthStockInMonth(growthList1);
		});
		
		buttonTrongquy.setOnAction(event -> {
			List<GrowthStock> growthList3 = GetGrowthStockInQuarter.crawlData();
			String str = SentencesGrowthStockInQuarter.generateSentences(growthList3);
			sentencesArea.setText(str);
			new TableGrowthStockInQuarter(growthList3);
		});
		
		buttonTrongnam.setOnAction(event -> {
			List<GrowthStock> growthList2 = GetGrowthStockInYear.crawlData();
			String str = SentencesGrowthStockInYear.generateSentences(growthList2);
			sentencesArea.setText(str);
			new TableGrowthStockInYear(growthList2);
		});
	}
}
