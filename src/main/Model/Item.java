package main.Model;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class Item {

    public static final Map<String, Integer> GETWEIGHTITEM1;
    static {
        GETWEIGHTITEM1 = new HashMap<>();
        GETWEIGHTITEM1.put(Data.SMALL, Data.WEIGHTITEM1S);
        GETWEIGHTITEM1.put(Data.MEDIUM, Data.WEIGHTITEM1M);
        GETWEIGHTITEM1.put(Data.LARGE, Data.WEIGHTITEM1L);
    }

    public static final Map<String, Integer> GETWEIGHTITEM2;
    static {
        GETWEIGHTITEM2 = new HashMap<>();
        GETWEIGHTITEM2.put(Data.SMALL, Data.WEIGHTITEM2S);
        GETWEIGHTITEM2.put(Data.MEDIUM, Data.WEIGHTITEM2M);
        GETWEIGHTITEM2.put(Data.LARGE, Data.WEIGHTITEM2L);
    }

    public static final Map<String, Integer> GETWEIGHTITEM3;
    static {
        GETWEIGHTITEM3 = new HashMap<>();
        GETWEIGHTITEM3.put(Data.SMALL, Data.WEIGHTITEM3S);
        GETWEIGHTITEM3.put(Data.MEDIUM, Data.WEIGHTITEM3M);
        GETWEIGHTITEM3.put(Data.LARGE, Data.WEIGHTITEM3L);
    }

    public static final Map<String, Integer> GETWEIGHTITEM4;
    static {
        GETWEIGHTITEM4 = new HashMap<>();
        GETWEIGHTITEM4.put(Data.SMALL, Data.WEIGHTITEM4S);
        GETWEIGHTITEM4.put(Data.MEDIUM, Data.WEIGHTITEM4M);
        GETWEIGHTITEM4.put(Data.LARGE, Data.WEIGHTITEM4L);
    }

    public static final Map<String, Integer> GETWEIGHTITEM5;
    static {
        GETWEIGHTITEM5 = new HashMap<>();
        GETWEIGHTITEM5.put(Data.SMALL, Data.WEIGHTITEM5S);
        GETWEIGHTITEM5.put(Data.MEDIUM, Data.WEIGHTITEM5M);
        GETWEIGHTITEM5.put(Data.LARGE, Data.WEIGHTITEM5L);
    }

    public static Map<String,HashMap> Items;
    static {
        Items = new HashMap<>();
        Items.put(Data.ITEMNAME1, (HashMap) GETWEIGHTITEM1);
        Items.put(Data.ITEMNAME2, (HashMap) GETWEIGHTITEM2);
        Items.put(Data.ITEMNAME3, (HashMap) GETWEIGHTITEM3);
        Items.put(Data.ITEMNAME4, (HashMap) GETWEIGHTITEM4);
        Items.put(Data.ITEMNAME5, (HashMap) GETWEIGHTITEM5);
    }


}