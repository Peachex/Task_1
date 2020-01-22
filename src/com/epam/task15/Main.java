package com.epam.task15;

import java.math.BigInteger;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Main {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }

        System.out.println("Произведение квадратов первых двухсот чисел = " + result);
    }
}
