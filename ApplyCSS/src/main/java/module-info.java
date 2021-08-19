module com.example.applycss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.applycss to javafx.fxml;
    exports com.example.applycss;
}