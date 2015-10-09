package com.amdudda;

/**
 * Created by amdudda on 10/9/15.
 */
public class Butterfly extends Insect {

    // attributes of Butterfly object
    private String wing_color;
    private String favorite_flower;

    // Constructor
    public Butterfly(String bName, String bColor, int bWings, String bFlower) {
        this.setName(bName);
        this.wing_color = bColor;
        this.setWings(bWings);
        this.favorite_flower = bFlower;
    } // end constructor

    // getter and setters for variables
    public String getWing_color() {
        return wing_color;
    }

    public void setWing_color(String wing_color) {
        this.wing_color = wing_color;
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
        // prints out information about the butterfly
        System.out.printf("The %s has %d %s wings, %d legs, and its favorite flower is %s.\n",
                this.getName(),this.getWings(),this.getWing_color(), this.getLegs(),this.getFavorite_flower());
    }
}
