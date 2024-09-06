package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateController {

    @FXML
    private TextArea pContent;

    @FXML
    private TextField pTitle;

    @FXML
    private TextField pWriter;

    @FXML
    private Button writeBackToList;

    @FXML
    void toInsert(ActionEvent event) {

    }

    @FXML
    void toList(ActionEvent event) throws IOException {
    	Main.setRoot("List");
    }
}
