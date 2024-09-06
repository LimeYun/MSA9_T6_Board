package application.Controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button btnExit;

    @FXML
    private Button btnList;

    @FXML
    void exit(ActionEvent event) {
    	Main.exit();
    }

    @FXML
    void toList(ActionEvent event) throws IOException {
    	Main.setRoot("UI/List");

    }

}
