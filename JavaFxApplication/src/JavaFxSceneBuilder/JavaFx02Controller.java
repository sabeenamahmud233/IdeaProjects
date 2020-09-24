package JavaFxSceneBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.util.Random;

public class JavaFx02Controller {
    @FXML
    Label myLabel;

    public void generateRandomNumber(ActionEvent event) {
        Random number = new Random();
        int i = number.nextInt(50);
        myLabel.setText(Integer.toString(i));
    }
}
