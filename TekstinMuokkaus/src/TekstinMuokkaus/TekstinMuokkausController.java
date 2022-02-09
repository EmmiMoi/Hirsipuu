package TekstinMuokkaus;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.net.URL;
import java.util.ResourceBundle;

public class TekstinMuokkausController implements Initializable {
    public TextField txtSize;
    public TextField txtMain;
    public RadioButton radLeft;
    public ToggleGroup Alignment;
    public RadioButton radMiddle;
    public RadioButton radRight;
    public CheckBox chkBold;
    public CheckBox chkItalic;

    String textSize;
    int size;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtMain.setText("Muokkaa minua");
        chkBold.setSelected(false);
        chkItalic.setSelected(false);
        size = 24;

    }

    //Sets the main-text to left
    public void radLeftClicked(ActionEvent actionEvent) {
        txtMain.setAlignment(Pos.CENTER_LEFT);

    }

    //Sets the text to center
    public void radMiddleClicked(ActionEvent actionEvent) {
        txtMain.setAlignment(Pos.CENTER);
    }

    //sets the text to right
    public void radRightClicked(ActionEvent actionEvent) {
        txtMain.setAlignment(Pos.CENTER_RIGHT);
    }

    //Bold
    public void chkBoldClicked(ActionEvent actionEvent) {

        if (chkBold.isSelected() && chkItalic.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, size));
        } else if (chkBold.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontWeight.BOLD, size));
        } else if(chkItalic.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontPosture.ITALIC, size));
        } else {
            txtMain.setFont(Font.font("Arial", FontPosture.REGULAR, size));
        }
    }

    //Italic
    public void chkItalicClicked(ActionEvent actionEvent) {
        if (chkBold.isSelected() && chkItalic.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, size));
        } else if (chkBold.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontWeight.BOLD, size));
        } else if(chkItalic.isSelected()) {
            txtMain.setFont(Font.font("Arial", FontPosture.ITALIC, size));
        } else {
            txtMain.setFont(Font.font("Arial", FontPosture.REGULAR, size));
        }

    }
    //changes txt-size
    public void onSizeEnterPressed(KeyEvent keyEvent) {

        if (keyEvent.getCode() == KeyCode.ENTER) {
            textSize = txtSize.getText();
            size =Integer.parseInt(textSize);
            txtMain.setFont(Font.font(size));
        }


    }



}
