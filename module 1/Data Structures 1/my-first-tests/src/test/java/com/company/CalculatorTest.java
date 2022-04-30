package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public  void shouldAddTwoPositiveIntegers() {
        Calculator calc = new Calculator();
        int actualResult = calc.add(4,8);
        int expectedResult = 12;
        assertEquals(expectedResult, actualResult);
        assertEquals(100, calc.add(50, 50));
        assertEquals(3, calc.add(2,1));
    }

    @Test
    public void shouldAddTwoNegativeIntegers() {
        Calculator calc = new Calculator();
        int actualResult = calc.add(-10, -3);
        int expectedResult = -13;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldAddPositiveAndNegative() {
        Calculator calc = new Calculator();
        int actualResult = calc.add(-5, 2);
        int expectedResult = -3;
        assertEquals(expectedResult, actualResult);


        assertEquals(-19, calc.add(25, -44));
    }
}