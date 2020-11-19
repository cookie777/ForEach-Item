package main.Controller;

import java.io.IOException;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javax.xml.soap.Text;
import main.Model.Conversion;
import main.Model.Data;
import main.Model.Item;

public class Controller {


  @FXML
  private ListView<String> listView =  new ListView();
  private ObservableList<String> itemData = FXCollections.observableArrayList();

  @FXML
  private Label itemLabel = new Label();

  @FXML
  private TextField priceFiled = new TextField();

  @FXML
  private TilePane sizeButton = new TilePane();

  @FXML
  private Button calculateButton = new Button();
  @FXML
  private ToggleGroup group = new ToggleGroup();

  @FXML
  private Label resultValue = new Label();

  @FXML
  public void initialize(){
    listView.setMinHeight(480);
    for (String itemName : Item.items.keySet()) {
      itemData.add(itemName);
    }

    listView.setItems(itemData);

    itemLabel.setText("Defualt value");
    priceFiled.setLayoutX(50);
    priceFiled.setLayoutY(50);


//    Label l = new Label("This is a Radiobutton example ");
    // add label
//    r.getChildren().add(l);
    // create radio buttons

    RadioButton r1 = new RadioButton(Data.SMALL);
    RadioButton r2 = new RadioButton(Data.MEDIUM);
    RadioButton r3 = new RadioButton(Data.LARGE);
    r1.setToggleGroup(group);
    r2.setToggleGroup(group);
    r3.setToggleGroup(group);

    r1.setSelected(true);

    sizeButton.getChildren().add(r1);
    sizeButton.getChildren().add(r2);
    sizeButton.getChildren().add(r3);
//
    sizeButton.setLayoutX(50);
    sizeButton.setLayoutY(100);

    calculateButton.setText("Calculate");
    calculateButton.setPrefSize(80,40);
    calculateButton.setLayoutX(50);
    calculateButton.setLayoutY(150);

    resultValue.setLayoutX(50);
    resultValue.setLayoutY(200);
    resultValue.setText("no result");

  }

  @FXML
  public void itemClick(MouseEvent arg0) {
    String clickedItemName = listView.getSelectionModel().getSelectedItem();
    System.out.println("click on " + clickedItemName);
    itemLabel.setText(clickedItemName);
  }

  @FXML
  public void calculateClick(MouseEvent arg0) {
    String selectedItem =  itemLabel.getText();
    System.out.println(selectedItem);

    RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    System.out.println(toogleGroupValue);

    String inputPrice = priceFiled.getText();
    System.out.println(inputPrice);

    Conversion c = new Conversion();
    String finalPrice = c.priceForEach(toogleGroupValue, inputPrice, selectedItem);

    setResultValue(finalPrice);

  }

  public void setResultValue(String price){
    resultValue.setText(price);
  }


}
