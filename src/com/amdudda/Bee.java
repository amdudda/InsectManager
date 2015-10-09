package com.amdudda;

/**
 * Created by amdudda on 10/9/15.
 */
public class Bee extends Insect {

    // attributes of Bee
    private String color;
    private boolean collects_honey;
    private String favorite_flower;

    // constructor
    public Bee(String iName, int iWings, String bColor, boolean bHoney, String bFlower) {
        this.setName(iName);
        this.setWings(iWings);
        this.color = bColor;
        this.collects_honey = bHoney;
        this.favorite_flower = bFlower;
    } // end constructor

    // setters and getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCollects_honey() {
        return collects_honey;
    }

    public void setCollects_honey(boolean collects_honey) {
        this.collects_honey = collects_honey;
    }

    public String getFavorite_flower() {
        return favorite_flower;
    }

    public void setFavorite_flower(String favorite_flower) {
        this.favorite_flower = favorite_flower;
    }
    // end setters & getters

    // misc methods
    protected void printSpeciesData() {
        System.out.printf("A %s is %s, has %d wings, %d legs, its favorite flower is %s, " +
                "and it %s collect honey.\n", this.getName(),this.getColor(), this.getWings(),
                this.getLegs(),this.getFavorite_flower(),this.gathersHoney());
    }

    private String gathersHoney() {
        // returns a string based on whether bee does or does not gather honey
        if (this.isCollects_honey()) {
            return "does";
        } else return "does not";
    }
}
