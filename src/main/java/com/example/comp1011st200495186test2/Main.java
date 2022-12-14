package com.example.comp1011st200495186test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("songs-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Billboard Christmas!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Response apiResponse[] = APIUtility.getSongsFromFile();
        launch();
    }
}