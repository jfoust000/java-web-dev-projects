package org.launchcode;
import java.util.Scanner;

public class SearchStringExtended {

    private static Boolean searchParagraph(String paragraph, String searchTerm) {

        String pg = paragraph.toUpperCase();
        String st = searchTerm.toUpperCase();

        return pg.contains(st);

    }

    private static int getLength(String searchTerm) {

        return searchTerm.length();

    }

    private static int getIndex(String paragraph, String searchTerm) {

        if (searchParagraph(paragraph, searchTerm)) {

            String pg = paragraph.toUpperCase();
            String st = searchTerm.toUpperCase();

            return pg.indexOf(st);

        } else {

            return -1;

        }

    }

    private static String searchAndRemoveWord(String paragraph, String searchWord) {

        String pg = paragraph.toLowerCase();
        String sw = searchWord.toLowerCase();

        return pg.replace(sw, "");

    }

    public static void main(String[] args) {

        String aliceInWonderLand = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversations?'";
        String searchString;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search String:");

        searchString = input.next();

        int index = getIndex(aliceInWonderLand, searchString);

        if (index >= 0) {

            System.out.println("\n\nThe first index of " + searchString + " is " + index);

            int length = getLength(searchString);
            System.out.println("The length of " + searchString + " is " + length);

            System.out.println("Removing '" + searchString + "' from the below paragraph:\n");
            System.out.println(aliceInWonderLand + "\n");
            System.out.println("Length of paragraph before removal: " + aliceInWonderLand.length() + "\n");
            System.out.println("\nUpdated Paragraph:\n");
            String updatedAliceInWonderland = searchAndRemoveWord(aliceInWonderLand, searchString);
            System.out.println(updatedAliceInWonderland + "\n");
            System.out.println("Length of paragraph after removal: " + updatedAliceInWonderland.length());

        } else {

            System.out.println("The search word was Not Found");

        }

    }

}
