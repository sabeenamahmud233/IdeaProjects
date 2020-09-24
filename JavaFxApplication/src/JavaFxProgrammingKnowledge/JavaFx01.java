package JavaFxProgrammingKnowledge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.text.Position;

public class JavaFx01 extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label label1 = new Label("Hello World");
        Label label2 = new Label("Hello World");

        Button button1 = new Button("Change Text");
        // Creating action using event handler
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setText("Congratulation for first JavaFx program." +
                        "\nThis is done using Event Handler");
                button1.setVisible(false);
            }
        });


        // Creating action using lambda expression
        Button button2 = new Button("Change Text");
        button2.setOnAction(e -> {
            label2.setText("Congratulation for first JavaFx program." +
                    "\nThis is done using Lambda Expression");
            button2.setVisible(false);
        });

        // Create the layout first
        // Using StackPane for layout
        StackPane layout1 = new StackPane();
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(label1, button1);

        // Using VBox for creating layout
        VBox layout2 = new VBox(10);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(label2, button2);

        Scene scene1 = new Scene(layout1, 300, 200);
        Scene scene2 = new Scene(layout2, 300, 200);

        window.setScene(scene1);
//        window.setScene(scene2);
        window.show();
    }
}
