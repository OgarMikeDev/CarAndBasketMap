package org.example.transformationCollection;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> basketHashMap = new HashMap<>();
        basketHashMap.put("Milk", 5);
        basketHashMap.put("Cottage cheese", 4);
        basketHashMap.put("Coffee", 1);


        TreeMap<String, Integer> basketTreeMap = new TreeMap<>(new ProductComparator());
        basketTreeMap.putAll(basketHashMap);
        for (java.util.Map.Entry entry : basketHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
