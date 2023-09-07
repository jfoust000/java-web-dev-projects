package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        ArrayList<String> cdContents = new ArrayList<>();
        ArrayList<String> dvdContents = new ArrayList<>();

        cdContents.add("Mamma said knock you out");
        cdContents.add("Jingling Baby");

        dvdContents.add("Avengers 4k Movie");
        dvdContents.add("Avengers Special Bonus Content");

        CD cd = new CD("CD","LL Cool J", 700, 50, cdContents);
        DVD dvd = new DVD("DVD","Avengers", 4700, 2800, dvdContents);

        cd.spinDisc();
        dvd.spinDisc();

        System.out.println("Available Storage on CD: " + (int)cd.getRemainingStorageCapacity());
        System.out.println("Available Storage on DVD: " + (int)dvd.getRemainingStorageCapacity());

        System.out.println(cd.getDiscInfo());

    }
}