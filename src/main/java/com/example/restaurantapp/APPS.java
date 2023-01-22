package com.example.restaurantapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class APPS extends Application {


    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(APPS.class.getResource("RESTAURANT.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("RESTAURANT.fxml"));
        Scene scene = new Scene(root, 1315, 810);
        stage.setTitle("Hello! Welcome To Our Restaurant!!");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            onExitClick(stage);
        });
    }

    public static void main(String[] args) {
        launch();

    }

    public void onExitClick(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to exit!");
        alert.setContentText("Are you sure you want to exit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            System.out.println("You succesfully Exit!!");
            stage.close();

        }

    }
}

