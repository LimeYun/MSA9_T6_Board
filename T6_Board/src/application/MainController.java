package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button btnExit;

    @FXML
    private Button btnList;
    
    Stage stage;

    @FXML
    void exit(ActionEvent event) {
    	
    }	
    
    @FXML
    void toList(ActionEvent event) throws IOException {
    	Main.setRoot("List");

    }
    

}

    
