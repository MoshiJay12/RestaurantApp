package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public LoginController(){

    }

    @FXML
    Stage stg;
    Scene scene;

    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField staffid;
    @FXML
    private PasswordField staffpass;

    public void userLogin (ActionEvent event) throws IOException{
//        checkLogin();
        if (staffid.getText().toString().equals("staff") && staffpass.getText().toString().equals("1234")) {
            wrongLogin.setText("Login Succes!");

            Parent root = FXMLLoader.load(getClass().getResource("StaffView.fxml"));
            stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stg.setScene(scene);
            stg.show();
        }

        else if (staffid.getText().isEmpty() && staffpass.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data");
        }

        else {
            wrongLogin.setText("Wrong staff ID or password!");
        }

    }

//    private void checkLogin() throws IOException{
//        LoginStaff lgn = new LoginStaff();
//        if (staffid.getText().toString().equals("staff") && staffpass.getText().toString().equals("1234")){
//            wrongLogin.setText("Login Succes!");
//
//            //change scene/display staffview lps loginto staff dashboard
//            //lgn.changeScene("StaffView.fxml");
////            lgn.getScene().setRoot(lgn);
//        }
//
//        else if (staffid.getText().isEmpty() && staffpass.getText().isEmpty()) {
//            wrongLogin.setText("Please enter your data");
//        }
//
//        else {
//            wrongLogin.setText("Wrong staff ID or password!");
//        }
//    }
}
