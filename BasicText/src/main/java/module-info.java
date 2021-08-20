module com.example.basictext {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basictext to javafx.fxml;
    exports com.example.basictext;
}