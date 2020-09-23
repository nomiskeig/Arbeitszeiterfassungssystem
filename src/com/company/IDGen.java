package com.company;

public class IDGen {
    static int id = 0;

    IDGen() {

    }

    public int getNext() {
        id++;
        return id;
    }
}
