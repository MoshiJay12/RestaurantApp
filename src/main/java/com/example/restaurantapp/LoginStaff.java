package com.example.restaurantapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginStaff extends Application {

    //create fake stage sbb nak guna variable stg
 //   private static Stage stg;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //stg = primaryStage;
        //user tak blh maximize window
        //primaryStage.setResizable(false);
        Parent parent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        primaryStage.setTitle("LOGIN SYSTEM");
        primaryStage.setScene(new Scene(parent, 600, 400));
        primaryStage.show();
    }

//    public void changeScene(String fxml) throws IOException {
//        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
//        //display stage mgikut drpd uncertain file yg diterima
//        stg.getScene().setRoot(pane);
//        stg.setTitle("LOGIN SYSTEM");
//        stg.setScene(new Scene(pane, 600, 400));
//        stg.show();
//    }

}
