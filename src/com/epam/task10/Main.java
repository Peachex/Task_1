package com.epam.task10;

// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Main {
    public static void main(String[] args) {
        double a = 1, b = 5, x = 1, y = 7, z = 5;

        if (checkSize(a, b, x, z)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }

    }

    public static boolean checkSize(double a, double b, double x, double z) {
        return (a == x && b == z);
    }
}
