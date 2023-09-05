package org.example;

public class Program {

    public static void main(String[] args) {

        Laptop macBookPro = new Laptop("Internal", "Touch", "Internal", "Disabled", "Closed");
        SmartPhone iphone15 = new SmartPhone("Internal", "Touch", "Internal", "Enabled", "Gel");

        System.out.println(macBookPro.openTopPanel());

        System.out.print("MacBook Pro is "); macBookPro.powerOn();

        System.out.println(macBookPro.enableWifi());

        iphone15.powerOn();

        System.out.println(iphone15.getId());

    }

}
