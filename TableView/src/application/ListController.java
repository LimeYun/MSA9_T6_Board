package application;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController {

    @FXML
    private TableView<Board> boardTableView;

    @FXML
    private TableColumn<Board, Integer> colNo;

    @FXML
    private TableColumn<Board, String> colTitle;
    
    @FXML
    private TableColumn<Board, String> colWriter;
    
    @FXML
    private TableColumn<Board, String> colRegDate;

    @FXML
    private TableColumn<Board, Integer> colView;
    
    List<Board> boardList = null;
    
    @FXML
    public void initialize() {
    	boardList = new ArrayList<Board>();
    	boardList.add(new Board(1,"제목1","작성자1","내용1",10));
    	boardList.add(new Board(2,"제목2","작성자2","내용2",20));
    	boardList.add(new Board(3,"제목3","작성자3","내용3",30));
    	
    	//* TableColumn에 Board 객체의 속성 매핑하기
    	colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
    	colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
    	colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
    	colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
    	colView.setCellValueFactory(new PropertyValueFactory<>("View"));
    	// (코드 설명)
    	//* PropertyValueFactory<>("게터이름")		:값으로 들어갈 객체의 게터 이름을 지정
    	//ex) PropertyValueFactory<>("View") --> getView()게터 메소드의 get을 제외한 "View"와 일치
    	//* setCellValueFactory()
    	//** module-info.java에 java.base 모듈 추가해야 사용 가능
    	
    	// 테이블 뷰에 데이터 추가하기
    	ObservableList<Board> list = FXCollections.observableArrayList(boardList);
    	boardTableView.setItems(list);
    }

    @FXML
    void toInsert(ActionEvent event) {

    }

}
