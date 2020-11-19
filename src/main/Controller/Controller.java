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
  private Label dollarLabel = new Label();

  @FXML
  private Label lbLabel = new Label();

  @FXML
  private TextField priceFiled = new TextField();

  @FXML
  private TilePane sizeButton = new TilePane();

  @FXML
  private Button calculateButton = new Button();
  @FXML
  private ToggleGroup group = new ToggleGroup();

  @FXML
  private Label resultExplanation = new Label();

  @FXML
  private Label resultDollarLabel = new Label();

  @FXML
  private Label resultValue = new Label();

  @FXML
  private Label resultPerPieceLabel = new Label();


  int marginLL = 32;
  int marginL = 24;
  int marginM = 16;
  int marginS = 8;


  int itemLabelPosX = 64;
  int itemLabelPosY = 24;

  int pricePosX = 64;
  int pricePosY = 84;
  int inputFieldWidth = 120;
  int inputFieldHeight = 40;

  int radiobuttonPosX = 64;
  int radiobuttonPosY = 136;

  int calButtonPosX = 400;
  int calButtonPosY = 200;
  int calButtonWidth = 120;
  int calButtonHeight = 40;

  int resultPosX = 64;
  int resultPosY = 360;
  int resultValueWidth = 160;
  int resultValueHeight = 40;


  @FXML
  public void initialize(){
    listView.setMinHeight(480);
    for (String itemName : Item.items.keySet()) {
      itemData.add(itemName);
    }

    listView.setItems(itemData);

    //Setting the item label
    itemLabel.setText(Data.DEFAULT_VALUE);
    itemLabel.setLayoutX(itemLabelPosX);
    itemLabel.setLayoutY(itemLabelPosY);

    //Setting the $ label
    dollarLabel.setText("$");
    dollarLabel.setLayoutX(pricePosX);
    dollarLabel.setLayoutY(pricePosY);

    //Setting the input field
    priceFiled.setPrefWidth(inputFieldWidth);
    priceFiled.setPrefHeight(inputFieldHeight);
    priceFiled.setLayoutX(pricePosX+marginL);
    priceFiled.setLayoutY(pricePosY-marginS);


    //Setting the input field
    lbLabel.setText("lb");
    lbLabel.setLayoutX(pricePosX+inputFieldWidth+marginL+marginM);
    lbLabel.setLayoutY(pricePosY);



//    Label l = new Label("This is a Radiobutton example ");
//    r.getChildren().add(l);

    //Setting the radio botton
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
    sizeButton.setLayoutX(radiobuttonPosX);
    sizeButton.setLayoutY(radiobuttonPosY);


    //Set the calculation Button
    calculateButton.setText("Calculate");
    calculateButton.setPrefSize(calButtonWidth,calButtonHeight);
    calculateButton.setLayoutX(calButtonPosX);
    calculateButton.setLayoutY(calButtonPosY);

    //Set the result
    resultExplanation.setText("Your item is around");
    resultExplanation.setLayoutX(resultPosX);
    resultExplanation.setLayoutY(resultPosY);

    resultDollarLabel.setText("$");
    resultDollarLabel.setLayoutX(resultPosX);
    resultDollarLabel.setLayoutY(resultPosY+marginL+marginLL);

    resultValue.setText("");
    resultValue.setLayoutX(resultPosX+marginLL);
    resultValue.setLayoutY(resultPosY+18+marginLL);


    resultPerPieceLabel.setText("/ per piece");
    resultPerPieceLabel.setLayoutX(resultPosX+resultValueWidth);
    resultPerPieceLabel.setLayoutY(resultPosY+marginL+marginLL);

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

    RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();

    String inputPrice = priceFiled.getText();

    String finalPrice = new String();
    Conversion c = new Conversion();

    finalPrice = c.priceForEach(toogleGroupValue, inputPrice, selectedItem);

    setResultValue(finalPrice);

  }

  public void setResultValue(String price){
    resultValue.setText(price);
  }


}
