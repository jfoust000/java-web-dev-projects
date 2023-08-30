package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

   public String toString() {

        String menuToString = "\nCurrent Menu:\n";

        for (MenuItem menuItem : items) {

            menuToString += menuItem.toString();

        }

        return menuToString;

   }

    public void addMenuItem(MenuItem aMenuItem) {

        boolean duplicateEntry = false;

        for (MenuItem menuItem : items) {

            if (menuItem.equals(aMenuItem)) {

                duplicateEntry = true;
                break;

            }

        }

        if (duplicateEntry) {

            System.out.println("\nThe MenuItem already exists. MenuItem Not Added.\n");

        } else {

            items.add(aMenuItem);
            System.out.println("\nMenu Item\n" + aMenuItem + "\nAdded Successfully!\n");

        }


    }

    public void removeMenuItem(MenuItem aMenuItem) {

        boolean matchFound = false;

        for (MenuItem menuItem : items) {

            if (Objects.equals(aMenuItem.getName(), menuItem.getName())) {

                matchFound = true;
                items.remove(menuItem);
                System.out.println("\nRemoved MenuItem\n" + aMenuItem + "\nSuccessfully!\n");
                break;
            }
        }

        if(!matchFound) {

            System.out.println("MenuItem Not Found.");

        }
    }

    public String printMenuItem(MenuItem aMenuItem) {

        String mI = "";
        boolean matchFound = false;

        for (MenuItem menuItem : items) {

            if (Objects.equals(aMenuItem.getName(), menuItem.getName())) {

                matchFound = true;
                mI = menuItem.toString();

            }

        }

        if (!matchFound) {

            mI = "MenuItem Not Found";

        }

        return mI;

    }

}


