package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TableBookingController {

    @FXML
    Stage stage;
    Scene scene;
    @FXML
    private Label TableView;

    //    from Table Booking Back to Menu
    public void BackToRESTAURANT(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RESTAURANT.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // View available table in TableView
    public void GoToTableView(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TableView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void GoToOrderFood(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Warning");
        alert.setContentText("You need to book a table first");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Parent root = FXMLLoader.load(getClass().getResource("ENTER_CUST_ID.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------------
    //Start Booking Table

    //    time slot 1
    public void BookTimeSlot1(ActionEvent event) throws IOException {
        int y = 1;
        if (TableBooking.isAvailable(y)) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {

                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");

            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }
        }
    }


    //    time slot 2
    public void BookTimeSlot2(ActionEvent event) throws IOException {
        int y = 2;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }

        }
    }

    //    time slot 3
    public void BookTimeSlot3(ActionEvent event) throws IOException {
        int y = 3;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }
        }
    }

    //    time slot 4
    public void BookTimeSlot4(ActionEvent event) throws IOException {
        int y = 4;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }
        }

    }


    //    time slot 5
    public void BookTimeSlot5(ActionEvent event) throws IOException {
        int y = 5;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }
        }
    }


    //    time slot 6
    public void BookTimeSlot6(ActionEvent event) throws IOException {
        int y = 6;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
         else {
            System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
            TableBooking.displayTableView();
            System.out.println("Your booking is unsuccessful.");
        }
    }

}

    //    time slot 7
    public void BookTimeSlot7(ActionEvent event) throws IOException {
        int y = 7;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
         else {
            System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
            TableBooking.displayTableView();
            System.out.println("Your booking is unsuccessful.");
        }
    }
    }


    //    time slot 8
    public void BookTimeSlot8(ActionEvent event) throws IOException {
        int y = 8;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
         else {
            System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
            TableBooking.displayTableView();
            System.out.println("Your booking is unsuccessful.");
        }
    }
    }


    //    time slot 9
    public void BookTimeSlot9(ActionEvent event) throws IOException {
        int y = 9;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
        else {
            System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
            TableBooking.displayTableView();
            System.out.println("Your booking is unsuccessful.");
        }
    }
    }

    //    time slot 10
    public void BookTimeSlot10(ActionEvent event) throws IOException {
        int y = 10;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is unsuccessful.");
            }
        }
    }


    //    time slot 11
    public void BookTimeSlot11(ActionEvent event) throws IOException {
        int y = 11;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
         else {
            System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
            TableBooking.displayTableView();
            System.out.println("Your booking is unsuccessful.");
        }
    }
    }

    //    time slot 12
    public void BookTimeSlot12(ActionEvent event) throws IOException {
        int y = 12;
        if (TableBooking.isAvailable(y)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("You're about to book a table! ");
            alert.setContentText("Are you sure you want to proceed?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                Customer c = new Customer();
                c.newCustomer();
                TableBooking t = new TableBooking();
                t.bookTable(y, c);
                System.out.println("Table Booked between " + TableBooking.timeSlots[y - 1]);
                System.out.println("Your Customer ID(Use the ID for ordering food): " + c.id);
                System.out.println("Table No: " + c.table_no);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            } else {
                System.out.println("Table Not Available between " + TableBooking.timeSlots[y - 1]);
                TableBooking.displayTableView();
                System.out.println("Your booking is successful.");
            }
        }
    }


}



