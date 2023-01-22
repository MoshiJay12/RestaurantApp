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
import java.text.DecimalFormat;

public class BillController {

    @FXML
    private Label myLabel1, myLabel2, myLabel3, myLabel4, myLabel5, myLabel6, myLabel7, myLabel8, myLabel9,
            myLabel10, myLabel11, myLabel12, myLabel13, myLabel14, myLabel15, myLabel16, myLabel17, myLabel18, myLabel19;

    double tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10, tp11, tp12, tp13, tp14, tp15, tp16, tp17, tp18, totalprice=0 ;

    public void displayBills(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5,
                             Integer value6, Integer value7, Integer value8, Integer value9, Integer value10,
                             Integer value11, Integer value12, Integer value13, Integer value14, Integer value15,
                             Integer value16, Integer value17, Integer value18){



        tp1= value1*8.00;
        myLabel1.setText(Double.toString(tp1));

        tp2=value2*7.0;
        myLabel2.setText(Double.toString(tp2));

        tp3=value3*10.0;
        myLabel3.setText(Double.toString(tp3));

        tp4=value4*9.0;
        myLabel4.setText(Double.toString(tp4));

        tp5=value5*8.5;
        myLabel5.setText(Double.toString(tp5));

        tp6=value6*6.5;
        myLabel6.setText(Double.toString(tp6));

        tp7=value7*6.3;
        myLabel7.setText(Double.toString(tp7));

        tp8=value8*7.0;
        myLabel8.setText(Double.toString(tp8));

        tp9=value9*7.5;
        myLabel9.setText(Double.toString(tp9));

        tp10=value10*6.8;
        myLabel10.setText(Double.toString(tp10));

        tp11=value11*6.0;
        myLabel11.setText(Double.toString(tp11));

        tp12=value12*7.9;
        myLabel12.setText(Double.toString(tp12));

        tp13=value13*2.0;
        myLabel13.setText(Double.toString(tp13));

        tp14=value14*2.5;
        myLabel14.setText(Double.toString(tp14));

        tp15=value15*3.0;
        myLabel15.setText(Double.toString(tp15));

        tp16=value16*2.2;
        myLabel16.setText(Double.toString(tp16));

        tp17=value17*2.3;
        myLabel17.setText(Double.toString(tp17));

        tp18=value18*3.5;
        myLabel18.setText(Double.toString(tp18));

        totalprice = tp1 + tp2 + tp3 + tp4 + tp5 + tp6 + tp7 + tp8 + tp9 +
                tp10 + tp11 + tp12 + tp13 + tp14 + tp15 + tp16 + tp17 + tp18;

        DecimalFormat dFormatter = new DecimalFormat("0.00");
        String formatted= dFormatter.format(totalprice);

        myLabel19.setText(formatted);

    }

}
