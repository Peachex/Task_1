package com.epam.task7;

/* 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным. */
public class Main {
    public static void main(String[] args) {
        double a = 45, b = 90;

        if (checkExistence(a, b)) {
            System.out.println("Треугольник существует.");

            if (checkType(a, b)) {
                System.out.println("Треугольник является прямоугольным.");
            } else {
                System.out.println("Треугольник не является прямоугольным.");
            }

        } else {
            System.out.println("Треугольник не существует.");
        }
    }

    public static boolean checkExistence(double a, double b) {
        return (a + b < 180);
    }

    public static boolean checkType(double a, double b) {
        return (a == 90 || b == 90);
    }
}
