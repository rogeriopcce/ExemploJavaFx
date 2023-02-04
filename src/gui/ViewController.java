package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumero1;
	
	@FXML
	private TextField txtNumero2;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private Button btnSomar;
	
	@FXML
	public void onBtnSomaAction(){
		
		double soma1, soma2, resultado;
		
		soma1 = Double.parseDouble(txtNumero1.getText());
		soma2 = Double.parseDouble(txtNumero2.getText());
		
		resultado = soma1 + soma2;
		
		lblResultado.setText(String.format("%.2f", resultado));
	}
}
