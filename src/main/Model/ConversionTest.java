package main.Model;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @org.junit.jupiter.api.Test
    void convertValidDouble() {
        String size = "Small";
        String inputPrice = "2.5";
        String item = "Apple";
        Integer quantity = 1;
        String[] expected = {"0.39", "0.39"};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @org.junit.jupiter.api.Test
    void convertValidDoubleQuantity() {
        String size = "Medium";
        String inputPrice = "3.98";
        String item = "Tomato";
        Integer quantity = 4;
        String[] expected = {"0.73", "2.91"};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @org.junit.jupiter.api.Test
    void convertNegativeValue() {
        String size = "Medium";
        String inputPrice = "-20.5";
        String item = "Orange";
        Integer quantity = 5;
        String[] expected = {Data.NO_VALID_PRICE};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);
    }

    @org.junit.jupiter.api.Test
    void convertInvalidDouble() {
        String size = "Small";
        String inputPrice = "asd";
        String item = "Potato";
        Integer quantity = 12;
        String[] expected = {Data.NO_VALID_PRICE};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);
    }

    @org.junit.jupiter.api.Test
    void convertEmptyItem() {
        String size = "Small";
        String inputPrice = "6.9";
        String item = Data.DEFAULT_VALUE;
        Integer quantity = 3;
        String[] expected = {Data.NO_ITEM};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);
    }

    @org.junit.jupiter.api.Test
    void convertEmptyPrice() {
        String size = "Large";
        String inputPrice = "";
        String item = "Tomato";
        Integer quantity = 1;
        String[] expected = {Data.NO_PRICE};
        String[] result = Conversion.priceForEach(size, inputPrice, item, quantity);

        assertEquals(expected[0], result[0]);

    }


}