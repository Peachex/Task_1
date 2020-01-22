package com.epam.task15;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Main {
    public static void main(String[] args) {
        double result = 1;

        for (int i = 1; i <= 200; i++) {
            result *= i * i;
        }

        System.out.println("Произведение квадратов первых двухсот чисел = " + result);
    }
}
