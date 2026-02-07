package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

public class ArithmeticUtilityTest {

    @Test
    public void testAdd() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(5.0, 3.0);
        assert result == 8.0 : "Addition test failed";
    }

    @Test
    public void testAddNegative() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(-2.0, -3.0);
        assert result == -5.0 : "Addition with negative numbers test failed";
    }

    @Test
    public void testAddZero() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(0.0, 5.0);
        assert result == 5.0 : "Addition with zero test failed";
    }

    @Test
    public void testAddDecimal() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(2.5, 3.5);
        assert result == 6.0 : "Addition with decimal numbers test failed";
    }

    @Test
    public void testAddLargeNumbers() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(1e10, 1e10);
        assert result == 2e10 : "Addition with large numbers test failed";
    }

    @Test
    public void testAddNaN() {
        ArithmeticUtility utility = new ArithmeticUtility();
        double result = utility.add(Double.NaN, 0.0);
        assert Double.isNaN(result) : "Addition with NaN test failed";
    }
}
