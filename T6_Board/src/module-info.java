module T6_Board {
	requires javafx.controls;
	requires javafx.fxml;
	requires lombok;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml, lombok;
}
