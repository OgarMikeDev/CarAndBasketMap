package org.example.switchForJava;

public class Proba {
    public static void main(String[] args) {
        String productOne = "milk";

        String productTwo = "milk";


        System.out.println(equalsType(1));
    }


    public static String equalsType(Object object) {
        return switch (object) {
            case Integer i -> "Integer!";
            case null -> "Null!";
            case String s -> "String!";
            default -> "Something else!";
        };
    }
}
