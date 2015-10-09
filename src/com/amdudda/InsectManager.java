package com.amdudda;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        // write your code here

        // create two butterflies
        Butterfly monarch = new Butterfly("Monarch", 4, "orange and black", "milkweed");
        Butterfly swallowtail = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "milk parsley");

        /*
        monarch.printSpeciesData();
        swallowtail.printSpeciesData();
        */

        // create two bees
        Bee honeybee = new Bee("Honey Bee", 4, "yellow and black", true, "jasmine");
        Bee bumblebee = new Bee("Bumblebee", 4, "yellow, black, and white", false, "clover");

        /*
        honeybee.printSpeciesData();
        bumblebee.printSpeciesData();
        */

        // store my insects in a LinkedList
        LinkedList<Insect> insects = new LinkedList<Insect>();
        insects.add(monarch);
        insects.add(swallowtail);
        insects.add(honeybee);
        insects.add(bumblebee);
        // and print out information about them
        for (Insect i : insects) {
            i.printSpeciesData();
        } // end for-each

    } // end main

} // end InsectManager
