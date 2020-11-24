package main.RestApi;

import java.util.HashMap;
import java.util.Map;


public class DataStore {

    //Map of names to Item instances.
    private Map<String, Item> itemMap = new HashMap<>();

    //this class is a singleton and should not be instantiated directly!
    private static DataStore instance = new DataStore();
    public static DataStore getInstance(){
        return instance;
    }

    //private constructor so people know to use the getInstance() function instead
    private DataStore(){
        //dummy data
        itemMap.put("Banana", new Item("Banana", "Small", 118));
        itemMap.put("Apple", new Item("Apple", "Medium", 135));
        itemMap.put("Orange", new Item("Orange", "Large", 145));
    }

    public Item getItem(String name) {
        return itemMap.get(name);
    }

    public void putItem(Item item) {
        itemMap.put(item.getName(), item);
    }
}
