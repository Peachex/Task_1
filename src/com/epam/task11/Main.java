package com.epam.task11;

import java.util.Scanner;

/* 5. Вычислить значение функции: f(x) = x ^ 2 - 3 * x + 9, если x <= 3;
   f(x) = 1 / (x ^ 3 + 6), если x > 3. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x;
        x = in.nextDouble();

        if (x <= 3) {
            System.out.println(functionValue1(x));
        } else {
            System.out.println(functionValue2(x));
        }
    }

    public static double functionValue1(double x) {
        return (x * x - 3 * x + 9);
    }

    public static double functionValue2(double x) {
        return (1 / (Math.pow(x, 3) + 6));
    }
}
