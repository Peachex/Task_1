package com.epam.task9;

// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Main {
    public static void main(String[] args) {
        double x1 = 0, y1 = 2, x2 = 1, y2 = 4, x3 = 2, y3 = 6;

        if (checkLocation(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Точки будут расположены на одной прямой.");
        } else {
            System.out.println("Точки не будут расположены на одной прямой.");
        }
    }

    public static boolean checkLocation(double x1, double y1, double x2, double y2, double x3, double y3) {
        double k12, b12, k23, b23;

        k12 = (y2 - y1) / (x2 - x1);
        b12 = y1 - k12 * x1;

        k23 = (y3 - y2) / (x3 - x2);
        b23 = y2 - k23 * x2;

        return (k12 == k23 && b12 == b23);
    }
}