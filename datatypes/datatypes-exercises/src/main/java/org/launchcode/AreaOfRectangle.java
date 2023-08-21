package org.launchcode;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AreaOfRectangle {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static double calculateRectangleArea(double w, double l) {

        return w * l;

    }
    public static void main(String[] args) {

        double width, length;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Rectangle Width:");
        width = input.nextDouble();

        System.out.println("Enter Rectangle Length:");
        length = input.nextDouble();


        System.out.println("The area of the rectangle is: " + df.format(calculateRectangleArea(width, length)));


    }

}
