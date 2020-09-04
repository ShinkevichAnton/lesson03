package com.company;

import com.digit.Digit;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        System.out.println(calculator.add(21,16));
        System.out.println(calculator.minus(21,16));
        System.out.println(calculator.multiply(21,16));
        System.out.println(calculator.division(21,16));
        Digit digit = new Digit();
        digit.game();

    }
}