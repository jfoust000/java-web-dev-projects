package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        Date currentDate = new Date();
        MenuItem coffee = new MenuItem(1.00, "Freshly brewed from Columbian coffee beans",
                "beverages", "coffee", false  );
        MenuItem southWesternOmelette = new MenuItem(10.95,
                "Delicious omelette with 6 eggs, onions, jalapeno pepper, bacon, tomato, " +
                        "avocado, salsa, and shredded Monterey Jack cheese",
                "Eggs", "South Western Omelette", true);

        ArrayList<MenuItem> breakfastMenuItems = new ArrayList<>();
        breakfastMenuItems.add(coffee);
        breakfastMenuItems.add(southWesternOmelette);


        Menu breakfastMenu = new Menu(currentDate, breakfastMenuItems);

        ArrayList<MenuItem> dinnerMenuItems = new ArrayList<>();

        Menu dinnerMenu = new Menu(currentDate, dinnerMenuItems);

        MenuItem cheesecake = new MenuItem(4.50, "Creamy homemade Cheesecake!",
                "desserts", "Cheesecake", true);
        MenuItem lobsterPasta = new MenuItem(32.00,"Fresh Lobster with pasta and a creamy lobster sauce",
                "Entrees", "Lobster Pasta", true);

        dinnerMenu.addMenuItem(lobsterPasta);
        dinnerMenu.addMenuItem(cheesecake);

        System.out.println("\nBreakfast Menu To String: \n" + breakfastMenu + "\n");
        System.out.println("Single Menu Item Coffee To String: \n" + coffee);


        System.out.println("Removing Coffee from the Breakfast Menu:");

        breakfastMenu.removeMenuItem(coffee);

        System.out.println("\nBreakfast Menu To String: \n" + breakfastMenu + "\n");

        System.out.println("Adding Coffee back to the Breakfast Menu:");

        breakfastMenu.addMenuItem(coffee);

        System.out.println("Adding Coffee again as a duplicate:");
        breakfastMenu.addMenuItem(coffee);

        System.out.println("\nBreakfast Menu To String: \n" + breakfastMenu + "\n");

        System.out.println("Dinner Menu To String:");

        System.out.println(dinnerMenu);

        System.out.println("Printing menu item Cheesecake with Menu printMenuItem:");

        System.out.println(dinnerMenu.printMenuItem(cheesecake));

        Scanner input = new Scanner(System.in);

        double price;
        String description;
        String category;
        String name;
        boolean isNewItem;
        MenuItem newDinnerMenuItem;

        System.out.println("Add a new Dinner Menu Item Below.");

        System.out.print("Please enter price:");
        price = Double.parseDouble(input.nextLine());

        System.out.print("Please enter description:");
        description = input.nextLine();

        System.out.print("Please enter category:");
        category = input.nextLine();

        System.out.print("Please enter name:");
        name = input.nextLine();

        System.out.print("Is this a new Menu Item? (Enter true or false):");
        isNewItem = Boolean.parseBoolean(input.nextLine());

        newDinnerMenuItem = new MenuItem(price, description, category, name, isNewItem);
        dinnerMenu.addMenuItem(newDinnerMenuItem);

        System.out.println("Add a new Dinner Menu Item Below.");

        System.out.print("Please enter price:");
        price = Double.parseDouble(input.nextLine());

        System.out.print("Please enter description:");
        description = input.nextLine();

        System.out.print("Please enter category:");
        category = input.nextLine();

        System.out.print("Please enter name:");
        name = input.nextLine();

        System.out.print("Is this a new Menu Item? (Enter true or false):");
        isNewItem = Boolean.parseBoolean(input.nextLine());

        MenuItem anotherDinnerMenuItem = new MenuItem(price, description, category, name, isNewItem);
        dinnerMenu.addMenuItem(anotherDinnerMenuItem);

        System.out.println(dinnerMenu);

    }

}
