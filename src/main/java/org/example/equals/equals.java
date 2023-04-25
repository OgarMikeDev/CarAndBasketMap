package org.example.equals;

import org.example.product.Product;

public class equals {
    public static void main(String[] args) {
        String productOne = "milk";

        String productTwo = "milk";

        System.out.println(" == " + (productOne == productTwo) + "\n");
        System.out.println(" equals() " + (productOne.equals(productTwo)));
    }
}
