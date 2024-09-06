package application.Controller;

import java.io.IOException;

import application.Main;
import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class ChangeController {

    @FXML
    private TextField chgContent;

    @FXML
    private TextField chgTitle;

    @FXML
    private TextField chgWriter;
    
    int boardNo;
    
    private BoardService boardService = new BoardServiceImpl();

    @FXML
    void back(ActionEvent event) throws IOException {
		String fxml = "UI/Read";
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		Parent root = fxmlLoader.load();
		ReadController changeController = (ReadController)fxmlLoader.getController();
		changeController.passData(boardNo);
		
		Main.setRoot(root);
    }

    @FXML
    void upload(ActionEvent event) throws Exception {
    	Board board = new Board(chgTitle.getText(),chgWriter.getText(),chgContent.getText());
    	board.setNo(boardNo);
    	int result = boardService.update(board);
    	if ( result > 0 ) {
    		System.out.println("수정 완료!");
		}
    	Main.setRoot("UI/List");
	}

	public void passData(int boardNo) {
		this.boardNo = boardNo;
		Board board = boardService.select(boardNo);
		chgTitle.setText(board.getTitle());
		chgWriter.setText(board.getWriter());
		chgContent.setText(board.getContent());
	}
}
