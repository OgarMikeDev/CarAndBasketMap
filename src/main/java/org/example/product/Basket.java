package org.example.product;

import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private TreeMap<Product, Integer> products;

    public Basket() {
        this.products = new TreeMap<>(new ProductComparator());
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
