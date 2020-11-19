package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent mainView = FXMLLoader.load(getClass().getResource("View/view.fxml"));

        mainView.getStylesheets().add("https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap");
        mainView.getStylesheets().add("main/View/css/styles.css");
        primaryStage.setTitle("Base window");
        primaryStage.setScene(new Scene(mainView, 848, 480));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
