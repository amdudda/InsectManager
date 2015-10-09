package com.amdudda;

public class InsectManager {

    public static void main(String[] args) {
	// write your code here

        Butterfly monarch = new Butterfly("Monarch", "orange and black", 4, "milkweed");
        Butterfly swallowtail = new Butterfly("Common Yellow Swallowtail", "yellow and black", 4, "milk parsley");

        monarch.printSpeciesData();
        swallowtail.printSpeciesData();
    }
}
