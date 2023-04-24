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
        //Sample one
//        StringBuilder builder = new StringBuilder();
//        for (Product product : products.keySet()) {
//            builder.append(products + " - ");
//            builder.append(products.get(product) + "\n");
//        }
//        return builder.toString();

        //Sample two
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            builder.append(products + " - ");
            builder.append(entry.getValue() + "\n");
        }
        return builder.toString();
    }
}
