package application.Controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WriteController {

    @FXML
    private TextField content;

    @FXML
    private TextField title;

    @FXML
    private TextField writer;

    @FXML
    void back(ActionEvent event) throws IOException {
       	Main.setRoot("UI/List");
    }

    @FXML
    void upload(ActionEvent event) {
    	
    }

}
