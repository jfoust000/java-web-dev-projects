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

        // Loop through each character in the provided string
        for (char ch : str.toCharArray()) {

            // If char is leftBracket, increment brackets by 1
            if (ch == '[') {

                brackets++;

              // If char is rightBracket, decrement brackets only if we had a left bracket previously.
                // If not, return false
            } else if (ch == ']') {

                if (brackets > 0) {

                    brackets--;

                } else {

                    return false;

                }
            }
        }

        // return whether brackets is equal to 0 or not (true or false) If 0, we have balanced brackets.
        // if not, we do not have balanced brackets
        return brackets == 0;

    }

}


