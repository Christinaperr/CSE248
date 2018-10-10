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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.StringBag;

public class MainController implements Initializable {
	
	private StringBag theBag;
	@FXML
	private TextField inputField;
	
	public void getData(ActionEvent e) {
		theBag.insert(inputField.getText());
		inputField.clear();
	}
	
	public void changeView(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/secondaryFXML.fxml"));
		Scene scene= new Scene(root);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {	//get bag once then every method can have it
		theBag = App.getBag();
	}
}
