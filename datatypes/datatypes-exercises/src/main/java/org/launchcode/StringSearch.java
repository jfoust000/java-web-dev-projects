package org.launchcode;
import java.util.Scanner;

public class StringSearch {

    private static Boolean searchParagraph(String paragraph, String searchTerm) {

        return paragraph.contains(searchTerm.toLowerCase());

    }

    public static void main(String[] args) {

        String aliceInWonderLand = "Alice was beginning to get very tired of sitting by her sister" +
                "on the bank, and of having nothing to do: once or twice she had peeped into the book" +
                "her sister was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversations?'";
        String searchString;
        boolean result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search String:");

        searchString = input.next();

        System.out.println("The Search String Was: " + (searchParagraph(aliceInWonderLand, searchString) ? "Found" : "Not Found"));

    }

}
