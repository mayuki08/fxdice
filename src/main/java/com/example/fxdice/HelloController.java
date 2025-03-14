package com.example.fxdice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Dice dice = new Dice();
        dice.rollDice();
        welcomeText.setText( String.valueOf("サイコロの目は" + dice.getNumber())  );

        System.out.println();
    }
}