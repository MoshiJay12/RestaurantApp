package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class StaffViewController {

    // stage represent a window.
    // Scene represent content in the stage

    Stage stg;
    Scene scene;
    @FXML
    public Button bill;
    @FXML
    public Button lcust;
    @FXML
    public Button mOrder;
    @FXML
    public Button tIncome;
    @FXML
    public Button exit;

    final String DB_URL = "jdbc:mysql://localhost:3306/staff";
    final String USERNAME = "CatDBuser";
    final String PASSWORD = "CatDBpassword";
        try {
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        System.out.println("Successfully connect");
        // Connected to database successfully...
        }
        catch(Exception e){
        e.printStackTrace();
        }

    @FXML
    public void MaxOrder(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ORDERFOOD.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    public void getList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BOOKTABLE.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    public void getTotal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TotIncomeView.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    void getbill(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VIEWBILL.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }

@FXML
    public void userExit(ActionEvent event) {
            System.out.println("You succesfully Exit!!");
    System.exit(0);

    }


}
