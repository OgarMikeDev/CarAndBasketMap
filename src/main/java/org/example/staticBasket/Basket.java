package org.example.staticBasket;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Basket {
    private String items;

    public static int countItems = 0;


    public Basket(String items) {
        countItems++;
        this.items = items;
    }
}
