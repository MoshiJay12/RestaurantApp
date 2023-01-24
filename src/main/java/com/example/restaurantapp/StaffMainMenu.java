package com.example.restaurantapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StaffMainMenu extends Application {

    private static Stage stg;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("StaffView.fxml"));
        primaryStage.setTitle("WELCOME TO OUR RESTAURANT MANAGEMENT SYSTEM.");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
}
