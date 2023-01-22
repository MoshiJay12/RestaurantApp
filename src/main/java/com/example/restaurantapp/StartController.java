package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    @FXML
    private Label POPUP;


    @FXML
    private Button Exit;
    @FXML
    private AnchorPane ScenePane;

    Stage stage;

    public void onExitClick (ActionEvent event) {

//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Logout");
//        alert.setHeaderText("You're about to exit!");
//        alert.setContentText("Are you sure you want to exit?");
//
//        if (alert.showAndWait().get()== ButtonType.OK) {
//            stage=(Stage) ScenePane.getScene().getWindow();
        System.out.println("You succesfully Exit!!");
        System.exit(0);


    }
    Scene scene;
    private Parent root;

    public void StaffClick(ActionEvent event) throws IOException
    {
        Parent root= FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void CustomerClick(ActionEvent event) throws IOException
    {
        Parent root= FXMLLoader.load(getClass().getResource("RESTAURANT.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}

