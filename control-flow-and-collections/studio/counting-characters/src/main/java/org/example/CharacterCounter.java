package org.example;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {

        String paragraph = "If the product of two terms is zero then common sense says at" +
                " least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";


        char[] pg = paragraph.toCharArray();

        int letterCounter = 0;
        char letter;

       HashMap<Character, Integer> charTotals = new HashMap<>();

        for (int i = 0; i < pg.length; i++) {

            letter = pg[i];
            letterCounter = 1;

            if(!charTotals.isEmpty()) {

                if (charTotals.containsKey(letter)){
                    continue;
                }

            }

            for (int j = i + 1; j < pg.length; j++) {

                if (letter == pg[j]) {

                    letterCounter = letterCounter + 1;

                }

            }

            charTotals.put(letter, letterCounter);

        }

        System.out.println("Letter Count Totals for the below paragraph:\n");
        System.out.println(paragraph + "\n");

        for (Map.Entry<Character, Integer> characterTotals : charTotals.entrySet()) {

            System.out.println(characterTotals.getKey() + " (" + characterTotals.getValue() + ")");

        }

    }

}
