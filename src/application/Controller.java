package application;

import 	java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import crawldata.GetGrowthStockInMonth;
import crawldata.GetGrowthStockInQuarter;
import crawldata.GetGrowthStockInWeek;
import crawldata.GetGrowthStockInYear;
import crawldata.GetIndex;
import crawldata.GetTopStockForeignersLove;
import crawldata.GetTopStockInDay;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import models.GrowthStock;
import models.Index;
import models.TopStockForeignersLove;
import models.TopStockInDay;
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
			List<Index> indexList = GetIndex.crawlData(indexName);
			String passage = SentencesIndex.generateSentences(indexList, indexName).toString();
			new TableIndex(indexList);
			sentencesArea.setText(passage);
		});
		
		buttonTop10.setOnAction(event -> {
			List<TopStockForeignersLove> foreignerList = GetTopStockForeignersLove.crawlData();
			String passage = SentencesForeignerLove.generateSentences(foreignerList);;
            sentencesArea.setText(passage);
            new TableForeignerLove(foreignerList);
		});
		
		buttonTangmanh.setOnAction(event -> {
			List<TopStockInDay> upStockList = GetTopStockInDay.crawlData("Up");
			String passage = SentencesTopStockInDay.upStock(upStockList);
            sentencesArea.setText(passage);
            new TableTopStockInDay(upStockList, "Up");
		});
		
		buttonGiammanh.setOnAction(event -> {
			List<TopStockInDay> downStockList = GetTopStockInDay.crawlData("Down");
			String passage = SentencesTopStockInDay.downStock(downStockList);
            sentencesArea.setText(passage);
            new TableTopStockInDay(downStockList, "Down");
		});
		
		buttonTrongtuan.setOnAction(event -> {
			List<GrowthStock> growthList = GetGrowthStockInWeek.crawlData();
			String passage = SentencesGrowthStockInWeek.generateSentences(growthList);
			sentencesArea.setText(passage);
			new TableGrowthStockInWeek(growthList);
		});
		
		buttonTrongthang.setOnAction(event -> {
			List<GrowthStock> growthList1 = GetGrowthStockInMonth.crawlData();
			String passage = SentencesGrowthStockInMonth.generateSentences(growthList1);
			sentencesArea.setText(passage);
			new TableGrowthStockInMonth(growthList1);
		});
		
		buttonTrongquy.setOnAction(event -> {
			List<GrowthStock> growthList3 = GetGrowthStockInQuarter.crawlData();
			String passage = SentencesGrowthStockInQuarter.generateSentences(growthList3);
			sentencesArea.setText(passage);
			new TableGrowthStockInQuarter(growthList3);
		});
		
		buttonTrongnam.setOnAction(event -> {
			List<GrowthStock> growthList2 = GetGrowthStockInYear.crawlData();
			String passage = SentencesGrowthStockInYear.generateSentences(growthList2);
			sentencesArea.setText(passage);
			new TableGrowthStockInYear(growthList2);
		});
	}
}
