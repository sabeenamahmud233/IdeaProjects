package JavaFx03Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CalculatorController {
    @FXML
    private Label resultOutput;
    @FXML
    private Label inputArea;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private String firstValue = "";
    CalculatorModel model = new CalculatorModel();

    @FXML
    public void processNumbers(ActionEvent event) {
        if (start) {
            firstValue = "";
            inputArea.setText("");
            resultOutput.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        inputArea.setText(inputArea.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!value.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = value;
            number1 = Long.parseLong(inputArea.getText());
            resultOutput.setText(inputArea.getText() + " " + value + " ");
            firstValue = inputArea.getText() + " " + value + " ";

            inputArea.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
            long number2 = Long.parseLong(inputArea.getText());
            resultOutput.setText(firstValue + " " + number2 + " " + value + " ");
            float output = model.calculate(number1, number2, operator);
            inputArea.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
}

