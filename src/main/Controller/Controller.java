package main.Controller;

import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class Controller {

  @FXML
  private Label itemLabel = new Label();

  @FXML
  private ListView<String> listView =  new ListView();

  private ObservableList<String> itemData = FXCollections.observableArrayList();

  @FXML
  public void initialize(){
    listView.setMinHeight(480);
    itemData.add("apple");
    itemData.add("banana");
    itemData.add("orange");
    listView.setItems(itemData);
  }

  @FXML
  public void handleMouseClick(MouseEvent arg0) {
    String clickedItemName = listView.getSelectionModel().getSelectedItem();
    System.out.println("click on " + clickedItemName);
    changeLabel(clickedItemName);
  }

  public void changeLabel(String newValue){
    itemLabel.setText(newValue);
  }




}
