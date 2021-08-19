module com.example.objectmovement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.objectmovement to javafx.fxml;
    exports com.example.objectmovement;
}