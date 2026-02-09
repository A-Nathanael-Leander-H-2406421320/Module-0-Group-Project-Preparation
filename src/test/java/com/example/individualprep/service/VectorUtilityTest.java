package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

public class VectorUtilityTest {

    @Test
    void testNorm() {
        VectorUtility utility = new VectorUtility();
        double[] vector = {3.0, 4.0};
        double result = utility.norm(vector);
        assert result == 5.0 : "Norm calculation test failed";
    }

    @Test
    void testNormZeroVector() {
        VectorUtility utility = new VectorUtility();
        double[] vector = {0.0, 0.0};
        double result = utility.norm(vector);
        assert result == 0.0 : "Norm of zero vector test failed";
    }

    @Test
    void testNormNegativeComponents() {
        VectorUtility utility = new VectorUtility();
        double[] vector = {-3.0, -4.0};
        double result = utility.norm(vector);
        assert result == 5.0 : "Norm with negative components test failed";
    }

    @Test
    void testNormDecimalComponents() {
        VectorUtility utility = new VectorUtility();
        double[] vector = {1.5, 2.5};
        double result = utility.norm(vector);
        assert Math.abs(result - 2.9154759474226504) < 1e-9 : "Norm with decimal components test failed";
    }

    @Test
    void testNormNaNComponent() {
        VectorUtility utility = new VectorUtility();
        double[] vector = {Double.NaN, 4.0};
        double result = utility.norm(vector);
        assert Double.isNaN(result) : "Norm with NaN component test failed";
    }
}
