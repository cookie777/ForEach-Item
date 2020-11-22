package main.Model;

public class Conversion {

  public static String[] priceForEach(String toogleGroupValue, String inputPrice, String selectedItem, Integer quantity){

    Double priceUnit;
    Double priceTotal;
    Integer gramsPerUnitSmall;
    Integer gramsPerUnitMedium;
    Integer gramsPerUnitLarge;
    String[] result = new String[2];
    String finalPriceUnit;
    String finalPriceTotal;

    if (selectedItem.equals(Data.DEFAULT_VALUE)) {
      result[0] = Data.NO_ITEM;
      return result;
    }

    if (inputPrice.isEmpty()) {
      result[0] = Data.NO_PRICE;
      return result;
    }

    try
    {
      priceUnit = Double.parseDouble(inputPrice);
    }
    catch(NumberFormatException e)
    {
      result[0] = Data.NO_VALID_PRICE;
      return result;
    }

    if (priceUnit < Data.MIN_VALUE || priceUnit > Data.MAX_VALUE) {
      result[0] = Data.NO_VALID_PRICE;
      return result;
    }

    gramsPerUnitSmall = (Integer) Item.items.get(selectedItem).get(Data.SMALL);
    gramsPerUnitMedium = (Integer) Item.items.get(selectedItem).get(Data.MEDIUM);
    gramsPerUnitLarge =(Integer) Item.items.get(selectedItem).get(Data.LARGE);

    switch (toogleGroupValue) {
      case (Data.SMALL):
        priceUnit = gramsPerUnitSmall * priceUnit / Data.GRAMS_PER_LB;
        break;
      case (Data.MEDIUM):
        priceUnit = gramsPerUnitMedium * priceUnit / Data.GRAMS_PER_LB;
        break;
      case (Data.LARGE):
        priceUnit = gramsPerUnitLarge * priceUnit / Data.GRAMS_PER_LB;
        break;
    }

    priceTotal = quantity * priceUnit;
    finalPriceUnit = String.format("%.2f", priceUnit);
    finalPriceTotal = String.format("%.2f", priceTotal);
    result[0] = finalPriceUnit;
    result[1] = finalPriceTotal;

    return result;
  }

}
