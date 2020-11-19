package main.Model;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class Item {

    public static final Map<String, Integer> GET_WEIGHT_ITEM_1;
    static {
        GET_WEIGHT_ITEM_1 = new HashMap<>();
        GET_WEIGHT_ITEM_1.put(Data.SMALL, Data.WEIGHT_ITEM_1_S);
        GET_WEIGHT_ITEM_1.put(Data.MEDIUM, Data.WEIGHT_ITEM_1_M);
        GET_WEIGHT_ITEM_1.put(Data.LARGE, Data.WEIGHT_ITEM_1_L);
    }

    public static final Map<String, Integer> GET_WEIGHT_ITEM_2;
    static {
        GET_WEIGHT_ITEM_2 = new HashMap<>();
        GET_WEIGHT_ITEM_2.put(Data.SMALL, Data.WEIGHT_ITEM_2_S);
        GET_WEIGHT_ITEM_2.put(Data.MEDIUM, Data.WEIGHT_ITEM_2_M);
        GET_WEIGHT_ITEM_2.put(Data.LARGE, Data.WEIGHT_ITEM_2_L);
    }

    public static final Map<String, Integer> GET_WEIGHT_ITEM_3;
    static {
        GET_WEIGHT_ITEM_3 = new HashMap<>();
        GET_WEIGHT_ITEM_3.put(Data.SMALL, Data.WEIGHT_ITEM_3_S);
        GET_WEIGHT_ITEM_3.put(Data.MEDIUM, Data.WEIGHT_ITEM_3_M);
        GET_WEIGHT_ITEM_3.put(Data.LARGE, Data.WEIGHT_ITEM_3_L);
    }

    public static final Map<String, Integer> GET_WEIGHT_ITEM_4;
    static {
        GET_WEIGHT_ITEM_4 = new HashMap<>();
        GET_WEIGHT_ITEM_4.put(Data.SMALL, Data.WEIGHT_ITEM_4_S);
        GET_WEIGHT_ITEM_4.put(Data.MEDIUM, Data.WEIGHT_ITEM_4_M);
        GET_WEIGHT_ITEM_4.put(Data.LARGE, Data.WEIGHT_ITEM_4_L);
    }

    public static final Map<String, Integer> GET_WEIGHT_ITEM_5;
    static {
        GET_WEIGHT_ITEM_5 = new HashMap<>();
        GET_WEIGHT_ITEM_5.put(Data.SMALL, Data.WEIGHT_ITEM_5_S);
        GET_WEIGHT_ITEM_5.put(Data.MEDIUM, Data.WEIGHT_ITEM_5_M);
        GET_WEIGHT_ITEM_5.put(Data.LARGE, Data.WEIGHT_ITEM_5_L);
    }

    public static Map<String,HashMap> items;
    static {
        items = new HashMap<>();
        items.put(Data.ITEM_NAME_1, (HashMap) GET_WEIGHT_ITEM_1);
        items.put(Data.ITEM_NAME_2, (HashMap) GET_WEIGHT_ITEM_2);
        items.put(Data.ITEM_NAME_3, (HashMap) GET_WEIGHT_ITEM_3);
        items.put(Data.ITEM_NAME_4, (HashMap) GET_WEIGHT_ITEM_4);
        items.put(Data.ITEM_NAME_5, (HashMap) GET_WEIGHT_ITEM_5);
    }


}