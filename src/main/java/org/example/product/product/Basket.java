package org.example.product.product;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private HashMap<Product, Integer> products;

    public Basket() {
        this.products = new HashMap<>();
    }


    public void addProducts(Product product, int count) {
        if (!products.containsKey(product)) {
            products.put(product, 0);
        }
        products.put(product, products.get(product) + count);
    }


    public void addProduct(Product product) {
        addProducts(product, 1);
    }


    @Override
    public String toString() {
        //Sample two
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            builder.append(product + " - ");
            builder.append(entry.getValue() + "\n");
        }
        return builder.toString();
    }
}
