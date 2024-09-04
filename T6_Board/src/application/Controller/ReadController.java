package application.Controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ReadController {

	int boardNo;
	
    @FXML
    void back(ActionEvent event) throws IOException {
    	Main.setRoot("UI/List");
    }

    @FXML
    void toChange(ActionEvent event) throws IOException {
    	Main.setRoot("UI/Write");
    }

	public void passData(int boardNo) {
		this.boardNo = boardNo;
	}

}
