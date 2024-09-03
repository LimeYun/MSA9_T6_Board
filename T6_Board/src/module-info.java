module T6_Board {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.base;
	requires lombok;
	requires java.sql;
	opens application to javafx.base, javafx.graphics, javafx.fxml,
	lombok, java.sql;
}
