package org.example.transformationCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green", "Yellow"};
        System.out.println(Arrays.toString(colors).concat("\n"));

        ArrayList<String> colorsList = new ArrayList<>();
        //Sample add color in the List
//        for (String color : colors) {
//            colorsList.add(color);
//        }


        //Two sample add color in the List
        colorsList.addAll(Arrays.asList(colors));
        System.out.println(colorsList.toString().concat("\n"));


        String[] newColors = new String[colorsList.size()];
        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorsList.get(i);
        }
        System.out.println(Arrays.toString(newColors));
    }
}
