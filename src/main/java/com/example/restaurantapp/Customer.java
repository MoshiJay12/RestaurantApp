package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Customer {
    static int idCt = 100;
    int id, table_no;
    double order_amt;
    String name, date, time_slot;
    long phone;
    int items;
    Menu[] orders = new Menu[300];

    Stage stg;
    Scene scene;
    @FXML
    private TextField custid;
    private TextField custname;
    private TextField custphone;

    @FXML
    private Label logcust ;

    @FXML
    public User user;

    void newCustomer() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        this.name = s.nextLine();
        System.out.print("Enter Your Phone Number: ");
        this.phone = s.nextLong();
        idCt += 1;
        id = idCt;
        items = 0;
        this.date = "30/08/22";
    }

//        -------------------------------------------------------------------------------------
        private User getCustomerDetails(String name, String phone, Integer id){
            User user = null;

            final String DB_URL = "jdbc:mysql://localhost:3306/catrestaurat";
            final String USERNAME = "CatDBuser";
            final String PASSWORD = "CatDBpassword";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                System.out.println("Successfully connect");
                // Connected to database successfully...

//            Statement stmt = conn.createStatement();
                String sql = "insert into customer (Cust_Name, Cust_Phone, Cust_ID) " + "values (?,?,?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, String.valueOf(phone));
                preparedStatement.setInt(3, id);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    user = new User();

                    user.name = resultSet.getString("Cust_Name");
                    user.phone = resultSet.getString("Cust_Phone");
                    user.id = String.valueOf(resultSet.getInt("Cust_ID"));
                }

//            stmt.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }


            Statistics.addCustomer(this);
        }


    public static void main(String[] args) {
        Customer customer = new Customer();
        User user = customer.user;
//        launch();
        if (user != null) {
            System.out.println("Customer id: " + user.id);
        }
        else {
            System.out.println("Invalid");
        }
    }

    public void CustomerInfo (ActionEvent event) throws IOException {

        int Cust_ID = Integer.parseInt(custid.getText());
        String Cust_Name = custname.getText();
        String Cust_Phone = custphone.getText();

        user = getCustomerDetails(name, String.valueOf(phone), id);

        if (user!=null){
            logcust.setText("Login Success!");

            Parent root = FXMLLoader.load(getClass().getResource("Customer.fxml"));
            stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stg.setScene(scene);
            stg.show();
        }

        else if (custname.getText().isEmpty() && custphone.getText().isEmpty()) {
            logcust.setText("Please enter your data");
        }

        else {
            logcust.setText("Wrong staff ID or password!");
        }

    }

  void updateOrderDetails(int option,int Total) {
        String foodItem =  Menu.items[option - 1];
        double foodPrice = Total * Menu.prices[option - 1];
        Menu m = new Menu(foodItem, foodPrice);
        orders[items] = m;
        order_amt += foodPrice;
        items += 1;
    }

    void displayOrderDetails() {
        if (items == 0) {
            System.out.println("No Orders Yet!: ");
            return;
        }
        System.out.println("All Orders: ");
        for (int i = 0; i < items; i++) {
            System.out.println(i + 1 + ". " + orders[i].foodItem + " --------------------- RM" + orders[i].price);
        }
    }

    void displayCustomerDetails() {
        System.out.println("********************CUSTOMER DETAILS********************\n");
        System.out.println("Customer ID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Date: " + date);
        System.out.println("Table No: " + table_no);
        System.out.println("Time: " + time_slot);
        // System.out.println("Total Amount: " + order_amt);
        this.displayOrderDetails();
        System.out.println();
        System.out.println("Total Amount: RM" + order_amt);
        System.out.println("\n********************************************************");
    }
}