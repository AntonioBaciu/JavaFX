package application.imageview;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ImageView image;

    public void showImage(MouseEvent event) {
        image.setVisible(true);
    }

    public void hideImage(MouseEvent event) {
        image.setVisible(false);
    }
}
