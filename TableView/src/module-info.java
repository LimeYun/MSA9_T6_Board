module TableView {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.base;
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
