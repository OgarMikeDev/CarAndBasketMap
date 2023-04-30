package org.example.сappuccino;

public enum Cinnamon {
    YES(true),
    NO(false);

    private final boolean exist;


    Cinnamon(boolean contains) {
        exist = contains;
    }

    public boolean isExist() {
        return exist;
    }
}
