package JavaFx03Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFx03Calculator extends Application {
    Stage calculator;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        calculator = primaryStage;
        calculator.setTitle("Calculator");

        try {
            Parent layout = FXMLLoader.load(getClass().getResource("JavaFx03Calculator.fxml"));
            Scene scene = new Scene(layout);
            scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());

            calculator.setScene(scene);
            calculator.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
