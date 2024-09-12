package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the expt method.
 *
 * @author Samuel A. Rebelsky
 * @author Sal and David
 */
public class TestExpt {
    void testInBase(double base) {
        double expected = 1.0;
        for (int i = 0; i < 10; i++, expected *= base) {
            assertEquals(expected, SampleMethods.expt(base, i), base + "^" + i + " should be " + expected);
        }
    }

    @Test
    void test1K() {
        assertEquals(1024, SampleMethods.expt(2, 10), "1K");
    }
    
    @Test
    void testBase2() {
        testInBase(2.0);
    }

    @Test
    void testBase3() {
        testInBase(3.0);
    }

    @Test
    void testBaseNeg1() {
        testInBase(-1.0);
    }

    @Test
    void testBaseNeg2() {
        testInBase(-2.0);
    }

    @Test
    void testBase1() {
        testInBase(1.0);
    }
}