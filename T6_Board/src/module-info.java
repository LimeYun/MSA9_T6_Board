module T6_Board {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.base;
	requires lombok;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml, lombok, java.sql;
	opens application.Controller to javafx.fxml, favafx.base;
	opens application.DTO to javafx.base;
}
