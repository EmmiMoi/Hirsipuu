package Liikennevalot;

import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class ValotViewController implements Initializable {
    public RadioButton radRed;
    public RadioButton radYellow;
    public RadioButton radGreen;
    public Circle redLight;
    public Circle YelLight;
    public Circle GreenLight;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void radRedClicked(MouseEvent mouseEvent) {
        redLight.setFill(Color.RED);
        GreenLight.setFill(Color.BLACK);
        YelLight.setFill(Color.BLACK);

    }

    public void radYellowClicked(MouseEvent mouseEvent) {
        YelLight.setFill(Color.YELLOW);
        GreenLight.setFill(Color.BLACK);
        redLight.setFill(Color.BLACK);

    }

    public void radGreenClicked(MouseEvent mouseEvent) {
        GreenLight.setFill(Color.GREEN);
        redLight.setFill(Color.BLACK);
        YelLight.setFill(Color.BLACK);

    }
}
