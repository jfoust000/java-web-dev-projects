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

      final char leftBracket = '[';
      final char rightBracket = ']';

      int bracketCounter = 0;
      boolean isBalanced = false;

      String brackets = "";

      if (str.isEmpty()) {

          isBalanced = true;
          return isBalanced;

      } else {

          // Count any brackets present
          for (int i = 0; i < str.length(); i++) {

              if (str.charAt(i) == leftBracket || str.charAt(i) == rightBracket) {

                  bracketCounter++;
                  brackets += str.charAt(i);

              }

          }

          // Return false if odd brackets, and true if no brackets or empty string

          // Odd number of brackets
          if (!(bracketCounter % 2 == 0)) {

              // isBalanced is false here
              return isBalanced;

              // String without brackets should pass
          } else if (bracketCounter == 0) {

              isBalanced = true;
              return isBalanced;

          } else {

              // Loop through brackets string and check order of brackets
              for (int i = 0; i < brackets.length(); i = i + 2) {

                  if (brackets.charAt(i) == leftBracket && brackets.charAt(i + 1) == rightBracket) {

                      isBalanced = true;

                  } else {

                      isBalanced = false;
                      break;

                  }

              }

          }

      }

    return isBalanced;

    }

}