module scenes.scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens scenes.scenes to javafx.fxml;
    exports scenes.scenes;
}