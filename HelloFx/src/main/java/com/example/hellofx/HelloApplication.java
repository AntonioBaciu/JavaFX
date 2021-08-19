package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// The basics of stages in JavaFx


public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Setting the stage
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK); // bg color

        Image logo = new Image("file:logo.png"); // getting the logo
        stage.getIcons().add(logo); // apply logo
        stage.setTitle("Stage Demo Program w00t w00t"); // title

        // Set height, width & avoid window resize
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

        // Choose where the stage(the window) is displayed when you run the program
        // By default is in the middle of the screen
//        stage.setX(50);
//        stage.setY(50);

        stage.setFullScreen(true); // stage is full screen
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q"); // change exit full screen message
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q")); // change exit full screen key


        stage.setScene(scene);
        stage.show();
    }
}