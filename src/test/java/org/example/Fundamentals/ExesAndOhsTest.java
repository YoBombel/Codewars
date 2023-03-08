package org.example.Fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExesAndOhsTest {

    @Test
    public void testSomething1() {
        assertTrue(ExesAndOhs.getXO("xxxooo"));
        assertFalse(ExesAndOhs.getXO("Xxxxertr34"));
        assertTrue(ExesAndOhs.getXO("xxxXooOo"));
        assertFalse(ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
        assertFalse(ExesAndOhs.getXO("XxxxooO"));
        assertTrue(ExesAndOhs.getXO("zssddd"));
    }

}