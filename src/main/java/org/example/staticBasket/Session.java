package org.example.staticBasket;

import lombok.ToString;

public class Session {
    Basket basket;
    public Session() {
        basket = new Basket("Items Misha");
    }

    @Override
    public String toString() {
        return "Session Basket=".concat(String.valueOf(basket));
    }
}
