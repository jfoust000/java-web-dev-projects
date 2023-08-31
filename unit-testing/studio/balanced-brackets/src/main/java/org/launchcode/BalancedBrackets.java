package org.launchcode;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

        // If a complete set of open and closing square brackets, brackets should be 0 (true)
        int brackets = 0;

        // Counter for left bracket
        int leftBracket = 0;

        // Counter for right bracket
        int rightBracket = 0;

        // Loop through each character in the provided string
        for (char ch : str.toCharArray()) {

            // If char is leftBracket, increment leftBracket and brackets
            if (ch == '[') {

                leftBracket++;
                brackets++;

              // If char is rightBracket, increment rightBracket
            } else if (ch == ']') {

                rightBracket++;

                // For every rightBracket found we decrease leftBracket to indicate a set has been found
                // if there are equal square brackets to leftBrackets, brackets will end up being 0 or true
                if (brackets > 0) {

                    brackets--;

                }
            }
        }

        // if leftBracket is not equal to rightBracket, return false because we have incomplete sets of open and closing
        // brackets
        if (leftBracket != rightBracket) {

            return false;

        }
        // Else, return true
        return brackets == 0;

    }

}


