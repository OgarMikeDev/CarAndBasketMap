package org.example.сappuccino;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cappuccino {
    private final Sugar sugar;

    private final Cinnamon cinnamon;


    public void prepare() {
        System.out.println("Cooking coffee!");
        System.out.println("Add sugar: " + sugar);
        System.out.println("Add cinnamon: " + cinnamon);
    }
}
