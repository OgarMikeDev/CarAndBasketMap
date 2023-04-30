package org.example.сappuccino;

public enum Sugar {
    YES(true),
    NO(false);

    private final boolean exist;


    Sugar(boolean contains) {
        exist = contains;
    }

    public boolean isExist() {
        return exist;
    }
}
