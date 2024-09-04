package application.Controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import application.Main;
import application.DTO.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListController {

    @FXML
    private TableView<?> boardTableView;

    @FXML
    private TableColumn<?, ?> colNo;

    @FXML
    private TableColumn<?, ?> colRegDate;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableColumn<?, ?> colView;

    @FXML
    private TableColumn<?, ?> colWriter;

    void initialize() {
    	List<Board> boardList = Arrays.asList(new Board ("d","d","d"));
    	
    }
    
    @FXML
    void back(ActionEvent event) throws IOException  {
    	Main.setRoot("UI/Main");
    }
    
    @FXML
    void toInsert(ActionEvent event) throws IOException  {
    	
    	Main.setRoot("UI/Write");

    }

}
