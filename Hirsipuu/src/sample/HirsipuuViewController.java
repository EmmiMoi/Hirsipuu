package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;

import java.net.URL;
import java.util.ResourceBundle;

public class HirsipuuViewController implements Initializable {
    public QuadCurve firstWrong;
    public Line secondWrong;
    public Line thirdWrong;
    public Line fourthWrong;
    public Line fifthWrong;
    public Circle sixthWrong;
    public Line seventhWrong;
    public Line eleventhWrong;
    public Line tenthWrong;
    public Line eightWrong;
    public Line ninthWrong;

    public Label letterFour;
    public Label letterThree;
    public Label letterFive;
    public Label letterTwo;
    public Label letterOne;

    //laskuri virheita varten
    public int counter = 0;

    public Label loserEyes;
    public Label loserText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //asetetaan sana kirjaimittain
        letterOne.setText("k");
        letterTwo.setText("o");
        letterThree.setText("i");
        letterFour.setText("r");
        letterFive.setText("a");

        //asetetaan hirsipuun elementit valkoisiksi
        firstWrong.setStroke(Color.WHITE);
        secondWrong.setStroke(Color.WHITE);
        thirdWrong.setStroke(Color.WHITE);
        fourthWrong.setStroke(Color.WHITE);
        fifthWrong.setStroke(Color.WHITE);
        sixthWrong.setStroke(Color.WHITE);
        seventhWrong.setStroke(Color.WHITE);
        eightWrong.setStroke(Color.WHITE);
        ninthWrong.setStroke(Color.WHITE);
        tenthWrong.setStroke(Color.WHITE);
        eleventhWrong.setStroke(Color.WHITE);


        //asetetaan kirjainten väri valkoiseksi
        letterOne.setTextFill(Color.WHITE);
        letterTwo.setTextFill(Color.WHITE);
        letterThree.setTextFill(Color.WHITE);
        letterFour.setTextFill(Color.WHITE);
        letterFive.setTextFill(Color.WHITE);

        loserEyes.setTextFill(Color.WHITE);
        loserText.setTextFill(Color.WHITE);

    }

    public void rightKeyPressed(KeyEvent keyEvent) {

        //System.out.println(counter);
        if (keyEvent.getCode() == KeyCode.K ){
            letterOne.setTextFill(Color.RED);
            return;}
        if (keyEvent.getCode() == KeyCode.O ){
            letterTwo.setTextFill(Color.RED);
            return;}
        if (keyEvent.getCode() == KeyCode.I ){
            letterThree.setTextFill(Color.RED);
            return;}
        if (keyEvent.getCode() == KeyCode.R ){
            letterFour.setTextFill(Color.RED);
            return;}
        if (keyEvent.getCode() == KeyCode.A ){
            letterFive.setTextFill(Color.RED);
            return;}

        //Tanne mennaan vaarissa painalluksissa
        if (counter == 0) {
                firstWrong.setStroke(Color.BLACK);
                counter = counter +1;
            return;}
        if (counter == 1){
                secondWrong.setStroke(Color.BLACK);
                counter++;
            return;}
        if (counter == 2) {
            thirdWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 3) {
            fourthWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 4) {
            fifthWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 5) {
            sixthWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 6) {
            seventhWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 7) {
            eightWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 8) {
            ninthWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 9) {
            tenthWrong.setStroke(Color.BLACK);
            counter = counter +1;
            return;}
        if (counter == 10) {
            eleventhWrong.setStroke(Color.BLACK);
            counter = counter +1;
            loserText.setTextFill(Color.RED);
            loserEyes.setTextFill(Color.BLACK);
            return;}
        }

        //tama olikin turha, jääköön muistoksi
    public void wrongKeyPressed(KeyEvent keyEvent) {

    }
}
