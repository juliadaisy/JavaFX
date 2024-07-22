package org.example.javafxnew1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static final int WIDTH = 600;
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), WIDTH, 400);
        stage.setTitle("Arena");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String fxml) {
        try {
            FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource(fxml));
            Scene scene1 = new Scene(fxmlLoader1.load(), WIDTH, 400);
            stg.setScene(scene1);
        }
        catch (IOException exception) {

        }


    }

    public static void main(String[] args) {
        launch();
    }
}