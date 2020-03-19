package com.epam.task13;

import java.util.Scanner;

/* 2. Вычислить значения функции на отрезке [а,b] c шагом h: y = x, при x > 2;
   y = -x, при x <= 2. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a, b, h: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        double result;

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                result = i;
            } else {
                result = -i;
            }

            System.out.println(result);
        }
    }
}
