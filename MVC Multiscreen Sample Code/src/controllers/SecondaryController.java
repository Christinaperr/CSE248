package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.StringBag;

public class SecondaryController implements Initializable {
	private StringBag theBag;
	@FXML
	private TextArea outputArea;
	
	public void showData(ActionEvent e) {
		int n = theBag.getnElems();
		for(int i =0; i < n; i++) {
			outputArea.appendText(theBag.remove() + "\n");
		}
	}
	
	public void changeView(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/mainFXML.fxml"));
		Scene scene= new Scene(root);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		theBag = App.getBag();
	}
}
