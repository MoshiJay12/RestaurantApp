package com.example.restaurantapp;

//<<<<<<< HEAD
//=======
import javafx.application.Application;
//>>>>>>> origin/main
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//=======
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
//>>>>>>> origin/main
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
//<<<<<<< HEAD

public class LoginController {

//    public class LoginController(){
//
//    }

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

    @FXML
    public User user;
    private User getAuthenticatedUser(String id, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Successfully connect");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM staffaccount WHERE name=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.id = resultSet.getString("name");
                user.password = resultSet.getString("password");
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public static void main(String[] args) {
        LoginController loginForm = new LoginController();
        User user = loginForm.user;
//        launch();
        if (user != null) {
            System.out.println("Successful Authentication of: " + user.id);
        }
        else {
            System.out.println("Authentication canceled");
        }
    }

    public void userLogin (ActionEvent event) throws IOException{

        String id = staffid.getText();
        String password =staffpass.getText();
        user= getAuthenticatedUser(id,password);
//        checkLogin();
//        if (staffid.getText().toString().equals("staff") && staffpass.getText().toString().equals("1234"))
        if (user!=null){
            wrongLogin.setText("Login Success!");

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

