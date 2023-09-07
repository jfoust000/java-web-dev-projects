package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
     private String color = "blue";
     private double storageCapacity;

     public CD(String discType, String name, double storageCapacity, double capacityUsed, ArrayList<String> contents) {

         super(discType,name, storageCapacity, capacityUsed, contents);

     }

    @Override
    public void spinDisc() {

        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void readData() {

        System.out.println("Reading data from CD");

    }

    @Override
    public void destroyMicrowave() {

        System.out.println("Destroying microwave and smoke color is " + color);

    }

}
