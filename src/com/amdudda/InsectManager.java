package com.amdudda;

public class InsectManager {

    public static void main(String[] args) {
	// write your code here

        Butterfly monarch = new Butterfly("Monarch", 4, "orange and black", "milkweed");
        Butterfly swallowtail = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "milk parsley");

        monarch.printSpeciesData();
        swallowtail.printSpeciesData();

        Bee honeybee = new Bee("Honey Bee", 4, "yellow and black", true,"jasmine");
        Bee bumblebee = new Bee("Bumblebee", 4, "yellow, black, and white", false, "clover");

        honeybee.printSpeciesData();
        bumblebee.printSpeciesData();
    }
}
