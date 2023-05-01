package org.example.сappuccino;

import java.util.Scanner;

public class UseCinnamon {
    public static void main(String[] args) {
        Cappuccino cappuccinoMisha = new Cappuccino(Sugar.YES, Cinnamon.YES);
        cappuccinoMisha.prepare();
    }
}
