package main.RestApi;

import java.util.HashMap;

public class Item {

    private String name;
    private String size;
    private Integer weight;
    private HashMap<String, Integer> getWeight = new HashMap<>();

    public Item(String name, String size, Integer weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.getWeight.put(size, weight);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public Integer getWeight() {
        return weight;
    }

    public HashMap<String, Integer> getGetWeight() {
        return getWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setGetWeight(HashMap<String, Integer> getWeight) {
        this.getWeight = getWeight;
    }
}
