package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DetailController {

	@FXML
	private Label myLabel;

	@FXML
	private ImageView image;
	
    @FXML
    private Button button;
    
    @FXML
    void button(ActionEvent event) throws IOException {
    	Main.setRoot("Main");
    }

	public void passData(String currentFood) {
		myLabel.setText(currentFood);
		
		String filePath = getClass().getResource("/img/"+currentFood+".jpg").toExternalForm();
		image.setImage(new Image(filePath));
	}

}
