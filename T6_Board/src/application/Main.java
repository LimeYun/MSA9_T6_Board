package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		scene = new Scene(loadFXML("UI/Main"), 930, 650);
		stage.setScene(scene);
		
//		Image icon = new Image("icon.png");
//		stage.getIcons().add(icon);
		stage.setTitle("T6_Board");
		stage.setResizable(false);
		stage.show();
		
	}
	
	/**
	 * Scene 의 컨테이너를 불러온 FXML로 지정하는 메소드
	 * @param fxml
	 * @throws IOException
	 */
	public static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	public static void setRoot(Parent root) throws IOException {
		scene.setRoot(root);
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
	
