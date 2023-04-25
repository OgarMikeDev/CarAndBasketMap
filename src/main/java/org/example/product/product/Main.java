package org.example.product.product;

public class Main {
    public static void main(String[] args) {
        Basket basketOne = new Basket();
        basketOne.addProducts(new Product("milk", 100), 10);
        basketOne.addProducts(new Product("bread", 50), 10);
        basketOne.addProducts(new Product("oil", 200), 5);
        basketOne.addProducts(new Product("milk", 100), 20);
        System.out.println(basketOne);
    }
}