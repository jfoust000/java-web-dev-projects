package org.launchcode;
import java.util.Scanner;

public class Area {

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String radius;
        double area;

        System.out.println("Enter a radius:");
        radius = input.nextLine();

        while (!isNumeric(radius) || Double.parseDouble(radius) < 0) {

            System.out.println("Enter a valid radius:");
            radius = input.nextLine();

        }

        area = Circle.getArea(Double.parseDouble(radius));

        System.out.println("Area of circle with radius " + radius + " is " + area);

    }

}
