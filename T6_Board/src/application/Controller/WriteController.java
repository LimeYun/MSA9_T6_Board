package application.Controller;

import java.io.IOException;

import application.Main;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
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
    
    private BoardService boardService = new BoardServiceImpl();

    @FXML
    void upload(ActionEvent event) throws IOException {
    	Board board = new Board(title.getText(),writer.getText(),content.getText());
    	int result = boardService.insert(board);
    	if ( result > 0 ) {
    		System.out.println("등록 완료");
    		Main.setRoot("UI/List");
    	}
    } 

}
