package application.Controller;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import src.application.Main;
import src.application.Service.BoardServiceImpl;

public class ListController {

    @FXML
    public TableView<Board> boardTableView;

    @FXML
    private TableColumn<Board, Integer> colNo;

    @FXML
    private TableColumn<Board, String> colRegDate;

    @FXML
    private TableColumn<Board, String> colTitle;

    @FXML
    private TableColumn<Board, String> colWriter;

    @FXML
    private TableColumn<Board, Integer> colView;
    
    List<Board> boardList = null;
    private BoardService boardService = new BoardServiceImpl();

    @FXML
    void initialize() {
    	boardList = boardService.list();
    	
    	colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
    	colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
    	colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
    	colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
    	colView.setCellValueFactory(new PropertyValueFactory<>("View"));
    	
    	ObservableList<Board> list = FXCollections.observableArrayList(boardList);
    	boardTableView.setItems(list);
    	
    	boardTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() == 2 && boardTableView.getSelectionModel().getSelectedItem() != null) {
					int boardNo = boardTableView.getSelectionModel().getSelectedItem().getNo();
					
					try {
						String fxml = "UI/Read";
						FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
						Parent root = fxmlLoader.load();
						
						ReadController readController = (ReadController)fxmlLoader.getController();
						readController.passData(boardNo);
						Main.setRoot(root);
					} catch (Exception e) {
						System.err.println("List -> Read error");
					}
				}
			}
		});
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
