package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sum method.
 *
 * @author Samuel A. Rebelsky
 * @author Sal and David
 */
public class TestSum {

    @Test
    void sumArrayTest(){
        assertEquals(15, SampleMethods.sum(new int[] {1, 2, 3, 4, 5}), "the sum of the array {1, 2, 3, 4, 5} should be 15");
    }

    @Test
    void sumArrayZeroTest(){
        assertEquals(0, SampleMethods.sum(new int[] {0, 0, 0, 0}), "the sum of the array {0, 0, 0, 0} should be 0");
    }

    void sumArrayNegativeTest(){
        assertEquals(-5, SampleMethods.sum(new int[] {-1, -2, -3, -4, 5}), "the sum of the array {-1, -2, -3, -4, 5} should be -5");
    }


}
