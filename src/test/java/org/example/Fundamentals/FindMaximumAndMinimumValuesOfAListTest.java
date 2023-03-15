package org.example.Fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumAndMinimumValuesOfAListTest {


    @Test
    public void testExamples() {
        assertEquals(-110, FindMaximumAndMinimumValuesOfAList.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, FindMaximumAndMinimumValuesOfAList.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, FindMaximumAndMinimumValuesOfAList.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, FindMaximumAndMinimumValuesOfAList.max(new int[]{5}));
    }
}