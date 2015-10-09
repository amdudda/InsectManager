package com.amdudda;

/**
 * Created by amdudda on 10/9/15.
 */
public abstract class Insect {

    // attributes of Insect object
    private String name;
    private int wings;
    private final int legs = 6;

    // abstracts of Insect
    public abstract void printSpeciesData();

    // getter and setter for name and wings
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    // getter for wings; protected so it's accessible but not modifiable
    protected int getLegs() {
        return this.legs;
    }
}
