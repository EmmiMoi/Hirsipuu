package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class KilometritViewController implements Initializable {


    @FXML
    private TextField kmText;
    @FXML
    private TextField mileText;
    private double kmToMile;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void kmEnterPressed(KeyEvent keyEvent) {

        //if Enter-pressed
        if (keyEvent.getCode() == KeyCode.ENTER) {

            //otetaan talteen syötetty teksti
            String km = kmText.getText();

            //muunnetaan desimaaliksi
            kmToMile = Double.parseDouble(km);

            kmToMile = kmToMile*0.6214; //muunnetaan maileiksi
            mileText.setText(Double.toString(kmToMile)); //tyyppimuunnos tekstiksi

        }
    }


}
