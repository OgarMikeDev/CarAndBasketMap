package org.example.car;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("М555УК93", new Car("М555УК93"));
        cars.put("М555УК93", new Car("М555УК94"));
        cars.put("С555УК93", new Car("С555УК93"));
        cars.put("У555УК93", new Car("У555УК93"));
        cars.put("Р555УК93", new Car("Р555УК93"));
        cars.put("А555УК93", new Car("А555УК93"));


        System.out.println(cars.get("М555УК93"));
    }
}