package com.epam.task8;

// 2. Найти max{min(a, b), min(c, d)}.
public class Main {
    public static void main(String[] args) {
        double a = 2, b = 3, c = 11, d = 10;

        System.out.println(findMax(findMin(a, b), findMin(c, d)));
    }

    public static double findMax(double a, double b) {
        return a > b ? a : b;
    }

    public static double findMin(double a, double b) {
        return (a < b ? a : b);
    }
}
