package NaytaVarit;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class NaytaVaritViewController implements Initializable {
    public Label labelText;
    public Slider sliderRed;
    public Slider sliderBlue;
    public Slider sliderGreen;

    private int txtColor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelText.setTextFill(Color.rgb(0,0,0));
        
    }

    public void redSliderChanged(MouseEvent mouseEvent) {

        txtColor = (int)sliderRed.getValue();
        labelText.setTextFill(Color.rgb(txtColor, (int)sliderGreen.getValue(), (int)sliderBlue.getValue()));
    }

    public void blueSliderChanged(MouseEvent mouseEvent) {
        txtColor = (int)sliderBlue.getValue();
        labelText.setTextFill(Color.rgb((int)(sliderRed.getValue()),(int)sliderGreen.getValue(),txtColor));
    }

    public void greenSliderChanged(MouseEvent mouseEvent) {
        txtColor = (int)sliderGreen.getValue();
        labelText.setTextFill(Color.rgb((int)(sliderRed.getValue()),txtColor,(int)sliderBlue.getValue()));

    }
}
