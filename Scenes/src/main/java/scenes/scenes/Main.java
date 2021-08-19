package scenes.scenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE); // set the size & color of the scene
        Stage stage = new Stage();

        // #### TEXT ####
        Text text = new Text();
        text.setText("DAMN' BOY!"); // text
        text.setX(50); // position
        text.setY(50); // position
        text.setFont(Font.font("Verdana", 50)); // font & size
        text.setFill(Color.LIMEGREEN); // text color

        // #### LINE ####
        Line line = new Line();
        //start
        line.setStartX(200);
        line.setStartY(200);
        // end
        line.setEndX(500);
        line.setEndY(200);

        line.setStrokeWidth(5); // width
        line.setStroke(Color.RED); // color
        line.setOpacity(0.5); // opacity
        line.setRotate(45); // rotate the line 45 deg

        // #### RECTANGLE ####

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);

        rectangle.setFill(Color.BLUE); // bg color
        rectangle.setStrokeWidth(5); // border width
        rectangle.setStroke(Color.BLACK); // border color

        // #### TRIANGLE ####

        Polygon triangle = new Polygon();

        // position
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0);
        triangle.setFill(Color.YELLOW); // bg color

        // #### CIRCLE ####

        Circle circle = new Circle();
        // set the position for the CENTER of the circle(X,Y)
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50); // radius
        circle.setFill(Color.ORANGE);

        // #### IMAGE ####

        Image image = new Image("file:sticker.png");
        ImageView imageView = new ImageView(image); // pass image to the imageView constructor
        imageView.setX(30);
        imageView.setY(300);
        imageView.setFitWidth(295.0);
        imageView.setFitHeight(295.0);

        // #### Adding changes to the root node ####
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }


}