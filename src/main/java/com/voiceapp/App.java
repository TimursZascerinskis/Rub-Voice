package com.voiceapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

 
public class App extends Application
{
    @Override
    public void start(Stage stage){
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("JavaFX Application");

        Image logo  = new Image(getClass().getResourceAsStream("/logo.png"));
        stage.getIcons().add(logo);

        stage.setScene(scene);
        stage.show();
    }
    public static void main( String[] args )
    {
        launch(args);
    }
}
//mvn javafx:run