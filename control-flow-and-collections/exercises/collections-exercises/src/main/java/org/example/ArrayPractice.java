package org.example;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {

    private static boolean isInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static int arraySum(ArrayList<Integer> list) {

        int sum = 0;

        for (Integer integer : list) {

            if (integer % 2 == 0) {

                sum += integer;

            }

        }
        return sum;

    }

    private static ArrayList<String> getWordsFromArrayList(ArrayList<String> list, int wordLength) {

        ArrayList<String> results = new ArrayList<>();

        for (String word : list) {

            if (word.length() == wordLength) {

                results.add(word);

            }

        }

        return results;

    }

    public static void main(String[] args) {

        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {

//           System.out.println("Integer: " + i);

            if ( i % 2 != 0 ) {

                System.out.println("Integer: " + i + " is odd");

            }

        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        String[] convertedToArray = sentence.split(" ");

        System.out.println(Arrays.toString(convertedToArray));

        convertedToArray = sentence.split("\\.");

        System.out.println(Arrays.toString(convertedToArray));

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            intList.add(i+1);

        }

        int intSum = arraySum(intList);

        System.out.println("\nArrayList contains the following numbers: " + intList);
        System.out.println("\nSum of even numbers in ArrayList is: " + intSum);

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("PAW");
        stringArrayList.add("EXTRA");
        stringArrayList.add("YELLOW");
        stringArrayList.add("EAGLE");
        stringArrayList.add("FORK");
        stringArrayList.add("TEETH");

        ArrayList<String> filteredArrayList;

        filteredArrayList = getWordsFromArrayList(stringArrayList, 5);

        System.out.println("Words with 5 letters within stringArrayList: " + filteredArrayList);

        Scanner input = new Scanner(System.in);

        String wordLen;

        System.out.println("Enter a word length as an integer to see if the array list has any words of that length:");

        wordLen = input.nextLine();

        while (!isInteger(wordLen) || Integer.parseInt(wordLen) <= 0) {

            System.out.println("Enter a valid word length:");
            wordLen = input.nextLine();

        }

        filteredArrayList = getWordsFromArrayList(stringArrayList, Integer.parseInt(wordLen));

        if (filteredArrayList.isEmpty()) {

            System.out.println("No words of that length found.");
            input.close();

        } else {

            System.out.println("Words with " + wordLen + " letters within stringArrayList: " + filteredArrayList);
            input.close();
        }



    }

}
