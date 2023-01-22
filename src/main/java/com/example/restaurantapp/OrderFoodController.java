package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.net.URL;
import java.io.IOException;
import java.util.ResourceBundle;



public class OrderFoodController implements Initializable {
@FXML
    Stage stage;
    Scene scene;

    //    Food quantity order spinner
    @FXML


    private Spinner<Integer> OrderSpinner1, OrderSpinner2, OrderSpinner3, OrderSpinner4, OrderSpinner5,
            OrderSpinner6, OrderSpinner7, OrderSpinner8, OrderSpinner9, OrderSpinner10, OrderSpinner11, OrderSpinner12,
            OrderSpinner13, OrderSpinner14, OrderSpinner15, OrderSpinner16, OrderSpinner17, OrderSpinner18;

    SpinnerValueFactory<Integer> svf1 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf2 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf3 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);

    SpinnerValueFactory<Integer> svf4 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf5 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf6 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf7 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf8 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf9 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf10 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf11 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf12 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf13 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf14 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf15 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf16 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf17 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
    SpinnerValueFactory<Integer> svf18 =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
    public void onExitClick(ActionEvent event) {

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
    public void SubmitOrderClick(ActionEvent event) throws IOException {
//
//        int  qtt;
//        double total1,total2,total3,total4,total5,total6,total7,total8,total9,total10,total11,total12,
//                total13,total14,total15,total16,total17,total18,  totalprice;
//
////              1.  nasi ayam
//        if (OrderSpinner1.getValue() > 0) {
//            qtt = OrderSpinner1.getValue();
//            total1= 8.00* qtt;
//            total1=totalprice;
//        } else {
//            qtt = 0;
//
//        }
//        //             2.  nasi goreng
//        if (OrderSpinner2.getValue() > 0) {
//            qtt = OrderSpinner2.getValue();
//            total2= 7.00* qtt;
//            totalprice+total2 =+ totalprice;
//        } else {
//            qtt = 0;
//            totalprice=total1;
//        }
//
//        //              3.  nasi kerabu
//        if (OrderSpinner3.getValue() > 0) {
//            qtt = OrderSpinner3.getValue();
//            total3= 10.00* qtt;
//            totalprice+total3= new totalprice;
//        } else {
//            qtt = 0;
//            totalprice=new totalprice;
//        }
//        //             4.  nasi kukus
//        if (OrderSpinner4.getValue() > 0) {
//            qtt = OrderSpinner4.getValue();
//            total4= 9.00* qtt;
//            totalprice+total4= new totalprice;
//        } else {
//            qtt = 0;
//            totalprice=new totalprice;
//        }
//        //              5.  nasi dagang
//        if (OrderSpinner5.getValue() > 0) {
//            qtt = OrderSpinner5.getValue();
//            total= 8.50* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
////                  6.Mi goreng
//        if (OrderSpinner6.getValue() > 0) {
//            qtt = OrderSpinner6.getValue();
//            total= 6.50* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//
//        //              7.  nasi kerabu
//        if (OrderSpinner7.getValue() > 0) {
//            qtt = OrderSpinner7.getValue();
//            total= 6.30* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //             8.  nasi kukus
//        if (OrderSpinner8.getValue() > 0) {
//            qtt = OrderSpinner8.getValue();
//            total= 7.00* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//
//        //              9.  nasi ayam
//        if (OrderSpinner9.getValue() > 0) {
//            qtt = OrderSpinner9.getValue();
//            total= 7.50* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //             10.  nasi goreng
//        if (OrderSpinner10.getValue() > 0) {
//            qtt = OrderSpinner10.getValue();
//            total= 6.80* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//
//        //              11.  nasi kerabu
//        if (OrderSpinner11.getValue() > 0) {
//            qtt = OrderSpinner11.getValue();
//            total= 6.00* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //             12.  nasi kukus
//        if (OrderSpinner12.getValue() > 0) {
//            qtt = OrderSpinner12.getValue();
//            total= 7.90* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //              13.  nasi dagang
//        if (OrderSpinner13.getValue() > 0) {
//            qtt = OrderSpinner13.getValue();
//            total= 2.00* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
////                  14.Mi goreng
//        if (OrderSpinner14.getValue() > 0) {
//            qtt = OrderSpinner14.getValue();
//            total= 2.50* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//
//        //              15.  nasi kerabu
//        if (OrderSpinner15.getValue() > 0) {
//            qtt = OrderSpinner15.getValue();
//            total= 3.00* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //             16.  nasi kukus
//        if (OrderSpinner16.getValue() > 0) {
//            qtt = OrderSpinner16.getValue();
//            total= 2.20* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //              17.  nasi kerabu
//        if (OrderSpinner17.getValue() > 0) {
//            qtt = OrderSpinner17.getValue();
//            total= 2.30* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
//        //             18.  nasi kukus
//        if (OrderSpinner18.getValue() > 0) {
//            qtt = OrderSpinner18.getValue();
//            total= 3.50* qtt;
//        } else {
//            qtt = 0;
//            total= 0;
//        }
        System.out.println("The order have been submitted");

    }


    public void ViewBillClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VIEWBILL.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();


    }
}








