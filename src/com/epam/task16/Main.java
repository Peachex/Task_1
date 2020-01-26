package com.epam.task16;

import java.util.Scanner;

/* 5.  Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
заданному е. Общий член ряда имеет вид: a(n) = 1 / (2 ^ n) + 1 / (3 ^ n). */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("e = ");
        double e = in.nextDouble(), sum = 0;

        for (int i = 0; rowValue(i) >= e; i++) {
            sum += rowValue(i);
        }

        System.out.println("Сумма = " + sum);
    }

    public static double rowValue(int n) {
        return (1 / Math.pow(2, n) + 1 / Math.pow(3, n));
    }
}
