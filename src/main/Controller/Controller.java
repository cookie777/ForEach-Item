package main.Controller;

import java.io.IOException;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
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
  private Spinner<Integer> quantitySpinner = new Spinner<Integer>();

  @FXML
  private Label productLabel = new Label();

  @FXML
  private Label quantityLabel = new Label();


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

  @FXML
  private Label resultTotalExplanation = new Label();

  @FXML
  private Label resultTotalDollarLabel = new Label();

  @FXML
  private Label resultTotalValue = new Label();


  @FXML
  private Label errorAnnotation = new Label();

  int marginLL = 32;
  int marginL = 24;
  int marginM = 16;
  int marginS = 8;

  int marginLeft = 64;
  //
  int itemLabelPosX = marginLeft;
  int itemLabelPosY = 24;
  //
  int pricePosX = itemLabelPosX;
  int pricePosY = itemLabelPosY+88;
  int inputFieldWidth = 120;
  int inputFieldHeight = 40;

  int lbLabelPosX = pricePosX+inputFieldWidth+marginL+marginM;
  int lbLabelPosY = pricePosY;

  int productLabelPosX = lbLabelPosX + 48 + marginL;
  int productLabelPosY = pricePosY;

  int quantitySpinnerPosX = pricePosX + 300;
  int quantitySpinnerPosY = pricePosY - 8;
  int quantitySpinnerWidth = 80;

  int quantityLabelPosX = quantitySpinnerPosX + quantitySpinnerWidth + marginM;
  int quantityLabelPosY = pricePosY;

  //
  int radiobuttonPosX = pricePosX;
  int radiobuttonPosY = pricePosY + 64;

  //
  int calButtonPosX = 440;
  int calButtonPosY = 200;
  int calButtonWidth = 120;
  int calButtonHeight = 40;


  //
  int resultPosX = itemLabelPosX;
  int resultPosY = 0;
  int resultValueWidth = 160;
  int resultValueHeight = 40;
  //
  int resultTotalPosX = resultPosX;
  int resultTotalPosY = resultPosY + 88;
  int resultTotalValueWidth = 160;
  int resultTotalValueHeight = 40;


  @FXML
  public void initialize(){
    listView.setMinHeight(480);
    for (String itemName : Item.items.keySet()) {
      itemData.add(itemName);
    }

    listView.setItems(itemData);
    listView.setFixedCellSize(80);


    //Setting the item label
    itemLabel.setText(Data.DEFAULT_VALUE);
    itemLabel.setLayoutX(itemLabelPosX);
    itemLabel.setLayoutY(itemLabelPosY);

    //Setting the $ label
    dollarLabel.setText("$");
    dollarLabel.setLayoutX(pricePosX);
    dollarLabel.setLayoutY(pricePosY);

    //Setting the input field
    priceFiled.setText("0");
    priceFiled.setPrefWidth(inputFieldWidth);
    priceFiled.setPrefHeight(inputFieldHeight);
    priceFiled.setLayoutX(pricePosX+marginL);
    priceFiled.setLayoutY(pricePosY-marginS);


    //Setting the input field
    lbLabel.setText("lb");
    lbLabel.setLayoutX(lbLabelPosX);
    lbLabel.setLayoutY(lbLabelPosY);


    productLabel.setText("x");
    productLabel.setLayoutX(productLabelPosX);
    productLabel.setLayoutY(productLabelPosY);

    SpinnerValueFactory<Integer> valueFactory = //
            new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
    quantitySpinner.setValueFactory(valueFactory);
    quantitySpinner.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL);
    quantitySpinner.setPrefSize(quantitySpinnerWidth,inputFieldHeight);
    quantitySpinner.setLayoutX(quantitySpinnerPosX);
    quantitySpinner.setLayoutY(quantitySpinnerPosY);

    quantityLabel.setText("quantity");
    quantityLabel.setLayoutX(quantityLabelPosX);
    quantityLabel.setLayoutY(quantityLabelPosY);


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
    r1.setPadding(new Insets(0,24,0,0));
    r2.setPadding(new Insets(0,24,0,0));
    r3.setPadding(new Insets(0,24,0,0));
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
    resultExplanation.setText("If you buy one, it will cost");
    resultExplanation.setLayoutX(resultPosX);
    resultExplanation.setLayoutY(resultPosY);

    resultDollarLabel.setText("$");
    resultDollarLabel.setLayoutX(resultPosX);
    resultDollarLabel.setLayoutY(resultPosY+36);

    resultValue.setText("");
    resultValue.setLayoutX(resultPosX+marginLL);
    resultValue.setLayoutY(resultPosY+26);


    resultPerPieceLabel.setText("/ per piece");
    resultPerPieceLabel.setLayoutX(resultPosX+resultValueWidth);
    resultPerPieceLabel.setLayoutY(resultPosY+36);

    //Set the total result
    resultTotalExplanation.setText("Your total price is");
    resultTotalExplanation.setLayoutX(resultTotalPosX);
    resultTotalExplanation.setLayoutY(resultTotalPosY);

    resultTotalDollarLabel.setText("$");
    resultTotalDollarLabel.setLayoutX(resultTotalPosX);
    resultTotalDollarLabel.setLayoutY(resultTotalPosY+36);

    resultTotalValue.setText("");
    resultTotalValue.setLayoutX(resultTotalPosX+marginLL);
    resultTotalValue.setLayoutY(resultTotalPosY+26);


  }

  @FXML
  public void itemClick(MouseEvent arg0) {
    String clickedItemName = listView.getSelectionModel().getSelectedItem();
    itemLabel.setText(clickedItemName);
  }

  @FXML
  public void calculateClick(MouseEvent arg0) {
    errorAnnotation.setText("");
    String selectedItem =  itemLabel.getText();

    RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();

    String inputPrice = priceFiled.getText();

    Integer quantity = quantitySpinner.getValue();

    String[] finalPrices;
    String finalPrice;
    String totalPrice;

    finalPrices = Conversion.priceForEach(toogleGroupValue, inputPrice, selectedItem, quantity);
    finalPrice = finalPrices[0];
    totalPrice = finalPrices[1];
    ValidateResult(finalPrice, totalPrice);

  }

  public void ValidateResult(String finalPrice, String totalPrice){
    if ((finalPrice.equals(Data.NO_ITEM) || finalPrice.equals(Data.NO_PRICE) || finalPrice.equals(Data.NO_VALID_PRICE))){
      setErrorMessage(finalPrice);
    }else {
      setResultValue(finalPrice, totalPrice);
    }

  }

  public void setResultValue(String priceUnit, String priceTotal){
    resultValue.setText(priceUnit);
    resultTotalValue.setText(priceTotal);
  }

  public void setErrorMessage(String finalPrice){
    switch(finalPrice) {
      case Data.NO_ITEM:
        errorAnnotation.setText(Data.NO_ITEM);
        errorAnnotation.setLayoutX(pricePosX);
        errorAnnotation.setLayoutY(pricePosY -32);
        break;
      case Data.NO_PRICE:
        errorAnnotation.setText(Data.NO_PRICE);
        errorAnnotation.setLayoutX(pricePosX+24);
        errorAnnotation.setLayoutY(pricePosY+32);
        break;
      case Data.NO_VALID_PRICE:
        errorAnnotation.setText(Data.NO_VALID_PRICE);
        errorAnnotation.setLayoutX(pricePosX+24);
        errorAnnotation.setLayoutY(pricePosY+32);
        break;
      default:

    }
  }


}
