package application;

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

    @FXML
    void toInsert(ActionEvent event) {

    }

}
