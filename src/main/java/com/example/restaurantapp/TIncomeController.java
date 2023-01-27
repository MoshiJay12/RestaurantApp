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
import javafx.stage.Stage;

import java.io.IOException;

public class TIncomeController {

    @FXML
    Stage stg;
    Scene scene;

    @FXML
    private Button bill;

    @FXML
    private Button exit;

    @FXML
    private Button lcust;

    @FXML
    private Button mOrder;

    @FXML
    private Button tIncome;

    private

    @FXML
    void MaxOrder(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void getList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void getTotal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    public void getbill(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
        System.out.println("Total Income: " + Statistics.totalIncome());
    }

    @FXML
    public void userExit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to exit!");
        alert.setContentText("Are you sure you want to exit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            System.out.println("You succesfully Exit!!");
            stg.close();

        }
    }

 // ------------------------------------------------------------------------------------------------------------------
    // Calculate total daily income

//    public void getTotal(ActionEvent event) throws IOException{
//        System.out.println("Total Income: " + Statistics.totalIncome());
//    }
}
