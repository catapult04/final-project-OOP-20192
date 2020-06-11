package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class Controller implements Initializable{
	@FXML	
	private ComboBox<String> stockBox = new ComboBox();
	@FXML
	private ComboBox<String> exchangeBox = new ComboBox();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> stockList = FXCollections.observableArrayList("VNINDEX", "abc");
		exchangeBox.setItems(stockList);
		
		ObservableList<String> exchangeList = FXCollections.observableArrayList("HOSE", "UPCOME", "VN30");
		exchangeBox.setItems(exchangeList);
		
		
	}
	
	//event handler:
	private void exchangeBoxChange(ActionEvent event) {
		
	}
}
