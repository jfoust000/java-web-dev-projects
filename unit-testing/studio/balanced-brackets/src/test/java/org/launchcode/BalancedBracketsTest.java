package org.launchcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString() {

        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void testStringWithoutBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));

    }

    @Test
    public void testStringInsideSquareBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void testPartialStringInsideSquareBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void testSquareBracketsBeforeString() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));

    }

    @Test
    public void testBracketsWithoutString() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }

    @Test
    public void testOpeningBracketWithoutClosingBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void testStringWithClosingBracketBeforeOpeningBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void testOnlyOpeningBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }

    @Test
    public void testClosingBracketAndOpeningBracketWithoutString() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

    @Test
    public void testStringWithValidBracketsAndInValidBrackets() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code]Is]Awesome["));

    }

    @Test
    public void testStringWithNestedBrackets() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][[]][[][]]"));

    }

    @Test
    public void testOnlyClosingBracket() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }

}