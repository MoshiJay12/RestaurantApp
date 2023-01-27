package com.example.restaurantapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class StaffViewController implements Initializable {

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
    @FXML
    private TableColumn<fortablecust, String> idCol;

    @FXML
    private TableColumn<fortablecust, Double> billCol;

    @FXML
    private TableColumn<fortablecust, String> nameCol;

    @FXML
    private TableColumn<fortablecust, String> phoneCol;

    @FXML
    private TableView<fortablecust> tableCust;

    public ComboBox list;

    public Label showIncome;
    public Label showCustNMaxOrder;
    public Label showCustPMaxOrder;
    public Label showCustIDMaxOrder;
    public Label showCustBMaxOrder;

    String id =" ";
    String nameCustomer = "";
    String phone = " ";
    Double billcustomer = 0.0;


    @FXML
    public Object MaxOrder(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("CustWithMaxOrder.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

        //----------------------------------------------------------------------------------------

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Successfully connect");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT Cust_Bill FROM customers WHERE Cust_Bill>=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDouble(1, billcustomer);

            ResultSet resultSet = preparedStatement.executeQuery();

//            if(resultSet.next()){
//
//                showCustBMaxOrder. billcustomer= resultSet.getDouble("Cust_Bill");
//            }

            stmt.close();
            conn.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


        return null;
    }

    @FXML
    public void getList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("listCustomer.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";

   //     String connectQuery = "SELECT (Cust_Name, Cust_ID) FROM customers";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("The bill generated: ");
            // Connected to database successfully...

            ResultSet rs = conn.createStatement().executeQuery("SELECT Cust_ID FROM customers");
            ObservableList data = FXCollections.observableArrayList();

            while (rs.next()){
                data.add(new String(rs.getString(1)));
                list.setItems(data);

            }
         //   list.setItems(data);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public double getTotal(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("TotIncomeView.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";

 //       String connectQuery = "SELECT Cust_Bill FROM customers";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("The bill generated: ");
            // Connected to database successfully...

            ResultSet rs = conn.createStatement().executeQuery("SELECT Cust_Bill FROM customers");
            ObservableList data = FXCollections.observableArrayList();

            while (rs.next()){
                data.add(new String(rs.getString(1)));
                list.setItems(data);
            }
    //        list.setItems(data);

            }
            catch(Exception e){
                 e.printStackTrace();
            }

        return 0;
    }

    @FXML
    void getbill(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListBill.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

        final String DB_URL = "jdbc:mysql://localhost:3306/staff";
        final String USERNAME = "CatDBuser";
        final String PASSWORD = "CatDBpassword";

   //     String connectQuery = "SELECT Cust_Name, Cust_ID FROM customers";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("The bill generated: ");
            // Connected to database successfully...

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM customers");
            ObservableList data = FXCollections.observableArrayList();

            while (rs.next()){
//                data.add(new String(rs.getString(1)));
//                data.add(new String(rs.getString(2)));
//                data.add(new String(rs.getString(3)));
//                data.add(new Double(rs.getDouble(4)));

                nameCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Name"));
                phoneCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Phone"));
                idCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_ID"));
                billCol.setCellValueFactory(new PropertyValueFactory<fortablecust, Double>("Cust_Bill"));
            }
            tableCust.setItems(data);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

@FXML
    public void userExit(ActionEvent event) {
            System.out.println("You succesfully Exit!!");
    System.exit(0);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Name"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Phone"));
        idCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_ID"));
        billCol.setCellValueFactory(new PropertyValueFactory<fortablecust, Double>("Cust_Bill"));
    }

//    ObservableList<fortablecust> listtable = FXCollections.observableArrayList();
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        loadbill();
//    }
//
//    private void loadbill() {
//
//
//        nameCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Name"));
//        phoneCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_Phone"));
//        idCol.setCellValueFactory(new PropertyValueFactory<fortablecust, String>("Cust_ID"));
//        billCol.setCellValueFactory(new PropertyValueFactory<fortablecust, Double>("Cust_Bill"));
//    }
}
