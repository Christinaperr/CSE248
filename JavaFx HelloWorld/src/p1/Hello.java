package p1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button okButton = new Button("Ok");
		okButton.setPrefSize(80, 50);
		StackPane root = new StackPane();
		root.getChildren().add(okButton);
		Scene scene = new Scene(root, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
