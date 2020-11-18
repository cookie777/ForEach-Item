package main.Model;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class Data {

    static final String ITEMNAME1 = "Banana";
    static final String ITEMNAME2 = "Apple";
    static final String ITEMNAME3 = "Orange";
    static final String ITEMNAME4 = "Potato";
    static final String ITEMNAME5 = "Tomato";

    public static final Map<String, String> GETWEIGHTITEM1;
    static {
        GETWEIGHTITEM1 = new HashMap<>();
        GETWEIGHTITEM1.put("small", "118");
        GETWEIGHTITEM1.put("medium", "129");
        GETWEIGHTITEM1.put("large", "140");
    }

    public static final Map<String, String> GETWEIGHTITEM2;
    static {
        GETWEIGHTITEM2 = new HashMap<>();
        GETWEIGHTITEM2.put("small", "70");
        GETWEIGHTITEM2.put("medium", "85");
        GETWEIGHTITEM2.put("large", "100");
    }

    public static final Map<String, String> GETWEIGHTITEM3;
    static {
        GETWEIGHTITEM3 = new HashMap<>();
        GETWEIGHTITEM3.put("small", "96");
        GETWEIGHTITEM3.put("medium", "131");
        GETWEIGHTITEM3.put("large", "184");
    }

    public static final Map<String, String> GETWEIGHTITEM4;
    static {
        GETWEIGHTITEM4 = new HashMap<>();
        GETWEIGHTITEM4.put("small", "96");
        GETWEIGHTITEM4.put("medium", "174");
        GETWEIGHTITEM4.put("large", "286");
    }

    public static final Map<String, String> GETWEIGHTITEM5;
    static {
        GETWEIGHTITEM5 = new HashMap<>();
        GETWEIGHTITEM5.put("small", "55");
        GETWEIGHTITEM5.put("medium", "83");
        GETWEIGHTITEM5.put("large", "142");
    }


    public static void main(String[] args) {

        System.out.println(ITEMNAME1);
        System.out.println(GETWEIGHTITEM1.get("small"));
        System.out.println(GETWEIGHTITEM1.get("medium"));
        System.out.println(GETWEIGHTITEM1.get("large"));
        System.out.println();
        System.out.println(ITEMNAME2);
        System.out.println(GETWEIGHTITEM2.get("small"));
        System.out.println(GETWEIGHTITEM2.get("medium"));
        System.out.println(GETWEIGHTITEM2.get("large"));
        System.out.println();
        System.out.println(ITEMNAME3);
        System.out.println(GETWEIGHTITEM3.get("small"));
        System.out.println(GETWEIGHTITEM3.get("medium"));
        System.out.println(GETWEIGHTITEM3.get("large"));
        System.out.println();
        System.out.println(ITEMNAME4);
        System.out.println(GETWEIGHTITEM4.get("small"));
        System.out.println(GETWEIGHTITEM4.get("medium"));
        System.out.println(GETWEIGHTITEM4.get("large"));
        System.out.println();
        System.out.println(ITEMNAME5);
        System.out.println(GETWEIGHTITEM5.get("small"));
        System.out.println(GETWEIGHTITEM5.get("medium"));
        System.out.println(GETWEIGHTITEM5.get("large"));
        System.out.println();


    }


}


