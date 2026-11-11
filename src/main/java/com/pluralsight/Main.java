package com.pluralsight;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float f = 0F;
        double d = 0.0;
        BigDecimal b = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            f += 0.10f;
            d += 0.10;
            b = b.add(new BigDecimal("0.10"));

            System.out.println(
                    "float: " + f +
                            " double: " + d +
                            " bigDecimal: " + b);
        }

        f = 0f;
        d = 0.0;
        b = BigDecimal.ZERO;

        for (int i =0; i < 1000; i++) {
            f += 19.99f;
            d += 19.99;
            b = b.add(new BigDecimal("19.99"));
        }

        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("BigDecimal: " +b);
    }
}