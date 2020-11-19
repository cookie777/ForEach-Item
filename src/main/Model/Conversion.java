package main.Model;

import main.Controller.Controller;

public class Conversion {

  public String priceForEach(String toogleGroupValue, String inputPrice, String selectedItem){

    Double price;
    Integer gramsPerUnitSmall;
    Integer gramsPerUnitMedium;
    Integer gramsPerUnitLarge;

    if (selectedItem.equals(Data.DEFAULT_VALUE)) {
      return Data.NO_ITEM;
    }

    if (inputPrice.isEmpty()) {
      return Data.NO_PRICE;
    }

    try
    {
      price = Double.parseDouble(inputPrice);
    }
    catch(NumberFormatException e)
    {
      return Data.NO_VALID_PRICE;
    }


    gramsPerUnitSmall = (Integer) Item.items.get(selectedItem).get(Data.SMALL);
    gramsPerUnitMedium = (Integer) Item.items.get(selectedItem).get(Data.MEDIUM);
    gramsPerUnitLarge =(Integer) Item.items.get(selectedItem).get(Data.LARGE);

    switch (toogleGroupValue) {
      case (Data.SMALL):
        price = gramsPerUnitSmall * price / Data.GRAMS_PER_LB;
        break;
      case (Data.MEDIUM):
        price = gramsPerUnitMedium * price / Data.GRAMS_PER_LB;
        break;
      case (Data.LARGE):
        price = gramsPerUnitLarge * price / Data.GRAMS_PER_LB;
        break;
    }

    String finalPrice = String.format("%.2f", price);


    return finalPrice;
  }

}
