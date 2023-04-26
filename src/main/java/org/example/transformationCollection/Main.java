package org.example.transformationCollection;

import java.util.*;

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
        System.out.println(Arrays.toString(newColors).concat("\n"));


        HashSet<String> colorsHashSet = new HashSet<>(Arrays.asList(newColors));
        System.out.println(colorsHashSet.toString().concat("\n"));


        TreeSet<String> colorsTreeSet = new TreeSet<>(new ColorComparator());
        colorsTreeSet.addAll(Arrays.asList(colors));
        System.out.println(colorsTreeSet);
    }
}
