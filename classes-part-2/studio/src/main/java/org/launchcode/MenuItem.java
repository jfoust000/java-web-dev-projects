package org.launchcode;
import java.text.DecimalFormat;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;

    private String name;
    private boolean isNew;

    public MenuItem(double p, String d, String c, String n, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.name = n;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setName(String aName) {

        this.name = aName;

    }

    public double getPrice() {

        return this.price;

    }

    public String getDescription() {

        return this.description;

    }

    public String getCategory() {

        return this.category;

    }

    public boolean getNew() {

        return this.isNew;

    }

    public String getName() {

        return this.name;

    }

    public String toString() {

        DecimalFormat df = new DecimalFormat("#.00");

        String menuItemToString = "";

        if (this.isNew) {

            menuItemToString += "\nNew!";

            menuItemToString += "\n" + "Name: " + this.name + "\n" + "Description: "
                + this.description + "\n"
                + "Category: " + this.category + "\n" + "Price: $" + df.format(this.price) + "\n";

        } else {

            menuItemToString += "\n" + "Name: " + this.name + "\n" + "Description:" + "\n"
                    + this.description + "\n"
                    + "Category: " + this.category + "\n" + "Price: $" + df.format(this.price) + "\n";

        }

        return menuItemToString;

    }

    public boolean equals(Object menuItemToCheck) {

        if (menuItemToCheck == this) {
            return true;
        }

        if (menuItemToCheck == null) {
            return false;
        }

        if (menuItemToCheck.getClass() != getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) menuItemToCheck;
        return Objects.equals(theMenuItem.getName(), getName());

    }
}

