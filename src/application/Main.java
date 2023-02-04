package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import util.Alertas;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			Alertas.showAlerta("Erro", null, e.getMessage(), AlertType.ERROR);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
