package com.example.restaurantapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fortablecust {

    public String phoneCol;
    public String nameCol;

    public String idCol;
    public Double billCol;

    public fortablecust(String phone, String name, String id, Double bill) {
        this.phoneCol = phone;
        this.nameCol = name;
        this.idCol = id;
        this.billCol = bill;
    }

    final String DB_URL = "jdbc:mysql://localhost:3306/staff";
    final String USERNAME = "CatDBuser";
    final String PASSWORD = "CatDBpassword";

    String connectQuery = "SELECT (Cust_Name, Cust_ID) FROM customers";



//        try {
//        Connection conn = null;
//        try {
//           Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//        System.out.println("The bill generated: ");
//        // Connected to database successfully...
//
//        ResultSet rs = null;
//        try {
//            rs = conn.createStatement().executeQuery("select Cust_Bill from customers");
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//        ObservableList data = FXCollections.observableArrayList();
//
//        while (true){
//            try {
//                if (!rs.next()) break;
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//            catch(Exception e){
//                e.printStackTrace();
//            }
//            catch(Exception e){
//                e.printStackTrace();
//            }


    public String getPhone() {
        return null;
    }

    public String getName() {
        return nameCol;
    }

    public String getId() {
        return idCol;
    }

    public Double getAllbill() {
        return billCol;
    }
}
