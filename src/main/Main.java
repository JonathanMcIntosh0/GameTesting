package main;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        controller = new Controller();
        controller.runGame();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
