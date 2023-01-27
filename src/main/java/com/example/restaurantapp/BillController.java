package com.example.restaurantapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.sql.*;
import java.text.DecimalFormat;

public class BillController {

    @FXML
    Stage stg;
    Scene scene;

    @FXML
    private Label myLabel1, myLabel2, myLabel3, myLabel4, myLabel5, myLabel6, myLabel7, myLabel8, myLabel9,
            myLabel10, myLabel11, myLabel12, myLabel13, myLabel14, myLabel15, myLabel16, myLabel17,
            myLabel18, myLabel19, custid;

    double tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10, tp11, tp12, tp13, tp14, tp15, tp16, tp17, tp18, totalprice;


    public void displayCustID(String id) {

        custid.setText(id);
    }


    public void displayBills(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5,
                             Integer value6, Integer value7, Integer value8, Integer value9, Integer value10,
                             Integer value11, Integer value12, Integer value13, Integer value14, Integer value15,
                             Integer value16, Integer value17, Integer value18, String id) {


        tp1 = value1 * 8.00;
        myLabel1.setText(Double.toString(tp1));

        tp2 = value2 * 7.00;
        myLabel2.setText(Double.toString(tp2));

        tp3 = value3 * 10.00;
        myLabel3.setText(Double.toString(tp3));

        tp4 = value4 * 9.00;
        myLabel4.setText(Double.toString(tp4));

        tp5 = value5 * 8.50;
        myLabel5.setText(Double.toString(tp5));

        tp6 = value6 * 6.50;
        myLabel6.setText(Double.toString(tp6));

        tp7 = value7 * 6.30;
        myLabel7.setText(Double.toString(tp7));

        tp8 = value8 * 7.00;
        myLabel8.setText(Double.toString(tp8));

        tp9 = value9 * 7.50;
        myLabel9.setText(Double.toString(tp9));

        tp10 = value10 * 6.80;
        myLabel10.setText(Double.toString(tp10));

        tp11 = value11 * 6.00;
        myLabel11.setText(Double.toString(tp11));

        tp12 = value12 * 7.90;
        myLabel12.setText(Double.toString(tp12));

        tp13 = value13 * 2.00;
        myLabel13.setText(Double.toString(tp13));

        tp14 = value14 * 2.50;
        myLabel14.setText(Double.toString(tp14));

        tp15 = value15 * 3.00;
        myLabel15.setText(Double.toString(tp15));

        tp16 = value16 * 2.20;
        myLabel16.setText(Double.toString(tp16));

        tp17 = value17 * 2.30;
        myLabel17.setText(Double.toString(tp17));

        tp18 = value18 * 3.50;
        myLabel18.setText(Double.toString(tp18));

        totalprice = tp1 + tp2 + tp3 + tp4 + tp5 + tp6 + tp7 + tp8 + tp9 +
                tp10 + tp11 + tp12 + tp13 + tp14 + tp15 + tp16 + tp17 + tp18;

        DecimalFormat dFormatter = new DecimalFormat("0.00");
        String formatted = dFormatter.format(totalprice);

        myLabel19.setText(formatted);

//        id = custid.getText();

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Successfully connect");
            System.out.println(id);
            // Connected to database successfully...

//            Statement stmt = conn.createStatement();
            String sql = "UPDATE customers SET Cust_Bill=? WHERE Cust_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDouble(1, totalprice);
            preparedStatement.setString(2, id);

            preparedStatement.execute();

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


//        Statistics.totalIncome(this);

    }


    public void onDoneClick(ActionEvent event) {

//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Food Restaurant");
//        alert.setHeaderText("Your table and orders are secured");
//       alert.setContentText("Thank you and have a nice day !!");
//
//        if (alert.showAndWait().get()== ButtonType.OK) {

//            System.out.println("Thank you and have a nice day !!");
        System.exit(0);
        //      }


    }
}

