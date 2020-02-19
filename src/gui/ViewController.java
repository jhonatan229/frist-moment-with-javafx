package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button testButom;
	
	@FXML
	public void onTestButonAction() {
		System.out.println("click");
	}

}
