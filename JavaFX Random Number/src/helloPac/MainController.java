package helloPac;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	//every xml file has a controller
	@FXML
	private Label myLabel;
	@FXML
	private TextField textField;
	
	
	public void getRandomNumber(ActionEvent e) {
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;
		myLabel.setText(String.valueOf(number));
		textField.setText(String.valueOf(number));
	}
	
	
}
