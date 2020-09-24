package JavaFxSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFxSB02 extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Scene BUilder Using CSS");

        try {
            Parent layout = FXMLLoader.load(getClass().getResource("JavaFxSB02.fxml"));
            Scene scene = new Scene(layout);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            window.setScene(scene);
            window.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
