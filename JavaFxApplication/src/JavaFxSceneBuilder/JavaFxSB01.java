package JavaFxSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFxSB01 extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Scene Builder Example");

        FXMLLoader fXMLLoader;
        Parent layout = FXMLLoader.load(getClass().getResource("JavaFxSB01.fxml"));

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }
}
