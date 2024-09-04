//자바 미션 히든 프로젝트
//아래 기술을 사용하여 프로젝트를 팀원들과 함께 완성합니다
//
//Java FX
//JDBC
//
//
//Java FX 기반 게시판 프로그램을 완성합니다.
// 주요 기능
//
//메인 화면
//게시글 목록 조회
//게시글 상세 조회
//게시글 등록
//게시글 수정
//게시글 삭제
//게시글 조회 시 조회수 증가
//게시글 검색 
//
//팀원들과 주요 기능을 역할 분담하여 한 명당 2~4 개의 기능을 개발합니다,
//
//
//팀원 중 한 명이 Java FX 프로젝트를 구성하고 깃허브 저장소에 올립니다.
//다른 팀원들은 기본으로 구성된 프로젝트를 clone 받아서 담당한 기능을 개발합니다.
//이때 각 팀원 별로 브랜치를 설정하여,  각자의 브랜치에서 개발합니다.
//담당한 기능이 모두 개발되었다면 main 브랜치에 통합합니다.
//완성된 프로젝트를 jar  파일로 배포합니다.

package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		scene = new Scene(loadFXML("Main"));
		stage.setScene(scene);
		stage.show();
		
	}
	
	/**
	 * Scene 의 컨테이너를 불러온 FXML로 지정하는 메소드
	 * @param fxml
	 * @throws IOException
	 */
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	
	/**
	 * FXML 파일 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throws IOException
	 */
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader  fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
	
