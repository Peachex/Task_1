package com.epam.task10;

// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = 10;
        double x = 40;
        double y = 1;
        double z = 9;

        if (checkSize(a, b, x, y, z)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }

    }

    public static boolean checkSize(double a, double b, double x, double y, double z) {
        return (a >= x && b >= z || a >= y && b >= z || a >= z && b >= y);
    }
}
