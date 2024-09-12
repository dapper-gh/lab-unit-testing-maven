package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs

    /**
   * Check that removeBs works as expected.
   */
  @Test
  public void testRemoveBs() {
    assertEquals("", 
                 SampleMethods.removeBs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeBs("hello"),
                 "no bs");
    assertEquals("", 
                 SampleMethods.removeBs("b"),
                 "eliminate one b");
    assertEquals("", 
                 SampleMethods.removeBs("bbbb"),
                 "eliminate many bs");
    assertEquals("pin", 
                 SampleMethods.removeBs("pbin"),
                 "eliminate one b, short string");
    assertEquals("lphaet", 
                 SampleMethods.removeBs("blphbaet"),
                 "eliminate many bs, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeBs("bBbbCDbbbEFGbbbbHIJKbbbbLMNbbbOPbbQb"),
                 "eliminate many bs, silly string");
    assertEquals("aaa",
                 SampleMethods.removeBs("bbbaaabbb"),
                 "eliminate prefix and suffix bs");
  } // testRemoveAs

} // class TestSampleMethods
