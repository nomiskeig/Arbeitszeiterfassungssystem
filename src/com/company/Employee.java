package com.company;

import java.util.ArrayList;

public class Employee {
    static IDGen idGen = new IDGen();

    final int id = idGen.getNext();
    String firstName;
    String lastName;
    String birthday; // isn't a string just for now
    public Employee(String firstName, String lastName, String birthday) {
        //final int this.id = idGen.getNext();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public int getID() {
        return this.id;
    }
}
