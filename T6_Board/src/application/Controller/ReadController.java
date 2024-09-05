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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReadController {

	int boardNo;
	
    @FXML
    private Label viewContent;

    @FXML
    private Label viewTitle;

    @FXML
    private Label viewWriter;
	
	private BoardService boardService = new BoardServiceImpl();
	
    @FXML
    void back(ActionEvent event) throws IOException {
    	Main.setRoot("UI/List");
    }

    @FXML
    void toChange(ActionEvent event) throws IOException {
		String fxml = "UI/Change";
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		Parent root = fxmlLoader.load();
		ChangeController changeController = (ChangeController)fxmlLoader.getController();
		changeController.passData(boardNo);
		
		Main.setRoot(root);
    }
    
    @FXML
    void Delete(ActionEvent event) throws IOException {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Delete Date");
    	alert.setHeaderText(boardNo + "번의 글을 정말 삭제하시겠습니까?");
    	alert.setContentText("삭제하면 복구할 수 없습니다.");
    	int result = 0;
		if (alert.showAndWait().get() == ButtonType.OK) {
			result = boardService.delete(boardNo);
		} 
		if (result > 0) {
			System.err.println("삭제 완료!");
			Main.setRoot("UI/List");
		}
    }

	public void passData(int boardNo) throws IOException {
		this.boardNo = boardNo;
		Board board = boardService.select(boardNo);
		viewTitle.setText(board.getTitle());
		viewWriter.setText(board.getWriter());
		viewContent.setText(board.getContent());
	}

}
