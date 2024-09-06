package src.application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WriteController {

    @FXML
    private TextArea pContent;

    @FXML
    private TextField pTitle;

    @FXML
    private TextField pWriter;

    @FXML
    void toInsert(ActionEvent event) {

    }

    @FXML
    void toList(ActionEvent event) throws IOException {
    	Main.setRoot("List");
    }

}
