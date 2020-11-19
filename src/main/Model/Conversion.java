package main.Model;

import main.Controller.Controller;

public class Conversion {

  public String priceForEach(String toogleGroupValue, String inputPrice, String selectedItem){
    Double price = Double.parseDouble(inputPrice);
    Integer gramsPerUnitSmall = (Integer) Item.items.get(selectedItem).get(Data.SMALL);
    Integer gramsPerUnitMedium = (Integer) Item.items.get(selectedItem).get(Data.MEDIUM);
    Integer gramsPerUnitLarge =(Integer) Item.items.get(selectedItem).get(Data.LARGE);

    switch (toogleGroupValue) {
      case (Data.SMALL):
        price = gramsPerUnitSmall * price / Data.GRAMSPERLB;
        break;
      case (Data.MEDIUM):
        price = gramsPerUnitMedium * price / Data.GRAMSPERLB;
        break;
      case (Data.LARGE):
        price = gramsPerUnitLarge * price / Data.GRAMSPERLB;
        break;
      default:
        System.out.println("Verify later.");
    }

    String finalPrice = String.format("%.2f", price);


    return finalPrice;
  }

}
