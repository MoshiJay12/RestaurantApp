package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.input.*;
import java.net.URL;

import java.io.IOException;
import java.util.ResourceBundle;


public class OrderFoodController implements Initializable {

//    Food quantity order spinner
    @FXML
    private Spinner<Integer> OrderSpinner1,OrderSpinner2,OrderSpinner3,OrderSpinner4,OrderSpinner5,
            OrderSpinner6,OrderSpinner7,OrderSpinner8,OrderSpinner9,OrderSpinner10,OrderSpinner11,OrderSpinner12,
            OrderSpinner13,OrderSpinner14,OrderSpinner15,OrderSpinner16,OrderSpinner17,OrderSpinner18;
    SpinnerValueFactory<Integer>svf1=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf2=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf3=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);

    SpinnerValueFactory<Integer>svf4=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf5=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf6=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf7=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf8=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf9=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf10=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf11=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf12=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf13=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf14=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf15=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf16=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf17=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    SpinnerValueFactory<Integer>svf18=
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);

    @Override
    public void initialize (URL url,ResourceBundle resourceBundle){
        OrderSpinner1.setValueFactory(svf1);
        OrderSpinner2.setValueFactory(svf2);
        OrderSpinner3.setValueFactory(svf3);
        OrderSpinner4.setValueFactory(svf4);
        OrderSpinner5.setValueFactory(svf5);
        OrderSpinner6.setValueFactory(svf6);
        OrderSpinner7.setValueFactory(svf7);
        OrderSpinner8.setValueFactory(svf8);
        OrderSpinner9.setValueFactory(svf9);
        OrderSpinner10.setValueFactory(svf10);
        OrderSpinner11.setValueFactory(svf11);
        OrderSpinner12.setValueFactory(svf12);
        OrderSpinner13.setValueFactory(svf13);
        OrderSpinner14.setValueFactory(svf14);
        OrderSpinner15.setValueFactory(svf15);
        OrderSpinner16.setValueFactory(svf16);
        OrderSpinner17.setValueFactory(svf17);
        OrderSpinner18.setValueFactory(svf18);
    }
//--------------------------------------------------------------------------------------------------------------
//    tekan button exit terus tutup apps
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

//    Click submit order Button
    public void SubmitOrderClick(ActionEvent event){


    }





}
