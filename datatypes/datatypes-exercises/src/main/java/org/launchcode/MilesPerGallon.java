package org.launchcode;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MilesPerGallon {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static double calculateMilesPerGallon(double miles, double gal) {

        return miles / gal;

    }
    public static void main(String[] args) {

        double miles, gallons;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles traveled:");
        miles = input.nextDouble();

        System.out.println("Enter gallons of gas used:");
        gallons = input.nextDouble();

        System.out.println("Miles Per Gallon Is: " + df.format(calculateMilesPerGallon(miles, gallons)));

    }

}
