package org.launchcode;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final static String color = "red";
    private double storageCapacity;

    public DVD(String discType, String name, double storageCapacity, double capacityUsed, ArrayList<String> contents) {

        super(discType,name, storageCapacity, capacityUsed, contents);

    }

    @Override
    public void spinDisc() {

        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void readData() {

        System.out.println("Reading data from DVD");

    }

    @Override
    public void destroyMicrowave() {

        System.out.println("Destroying microwave and smoke color is " + color);

    }



}
