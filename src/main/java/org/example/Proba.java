package org.example;

import org.example.product.product.Product;

public class Proba {
    public static void main(String[] args) {
        Product productOne = new Product("milk");

        Product productTwo = new Product("milk");

        if (productOne == productTwo) {
            System.out.println("Equals!");
        } else {
            System.out.println("No equals!");
        }
    }
}
