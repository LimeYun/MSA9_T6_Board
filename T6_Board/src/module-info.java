module T6_Board {
	requires javafx.controls;
	requires javafx.fxml;
<<<<<<< HEAD
	requires java.base;
=======
>>>>>>> refs/remotes/origin/main
	requires lombok;
	requires java.sql;
	
<<<<<<< HEAD
	opens application to javafx.base, javafx.graphics, javafx.fxml,
	lombok, java.sql;
	opens application.Controller to javafx.fxml, favafx.base;
	opens application.DTO to javafx.base;
}
=======
	opens application to javafx.graphics, javafx.fxml, lombok;
}
>>>>>>> refs/remotes/origin/main
