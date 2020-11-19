package main;

import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent itemList = FXMLLoader.load(getClass().getResource("View/itemList.fxml"));
        Parent priceConversion = FXMLLoader.load(getClass().getResource("View/itemConversion.fxml"));

//        StackPane itemListSP = new StackPane();
//        ListView listView = new ListView();
//        listView.getItems().add("Item 1");
//        listView.getItems().add("Item 2");
//        listView.getItems().add("Item 3");
//        itemListSP.getChildren().add(listView);


        HBox hbox = new HBox(itemList, priceConversion);
        hbox.getStylesheets().add("main/View/css/styles.css");
        primaryStage.setTitle("Base window");
        primaryStage.setScene(new Scene(hbox, 848, 480));
        primaryStage.show();

//        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
//            }
//        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
