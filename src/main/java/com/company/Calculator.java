package com.company;

import java.math.BigInteger;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public BigInteger multiply(int a, int b) {
        return new BigInteger(String.valueOf(a * b));
    }

    public double division(int a, int b) {
        if (b != 0) {
            return (float)(a / b);
        } else return 0;
    }
}
