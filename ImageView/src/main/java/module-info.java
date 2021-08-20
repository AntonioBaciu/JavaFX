module application.imageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.imageview to javafx.fxml;
    exports application.imageview;
}