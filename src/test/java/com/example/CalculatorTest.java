package com.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Szemek
 * Date: 06.06.14
 * Time: 22:25
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() throws Exception {
        calculator.add(1, 2);
        assertEquals("Incorrect addition", 3, calculator.getResult());
    }

    @Test
    public void testAddZero() throws Exception {
        calculator.add(0, 0);
        assertEquals("Incorrect addition", 0, calculator.getResult());
    }

    @Test
    public void testAddOver9000() throws Exception {
        calculator.add(9000, 1);
        assertEquals("Incorrect addition", 9001, calculator.getResult());
    }
}
