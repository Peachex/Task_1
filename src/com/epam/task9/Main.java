package com.epam.task9;

// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Main {
    public static void main(String[] args) {
        double x1 = 2, y1 = 2, x2 = 3, y2 = 3, x3 = 0, y3 = 0;

        if (checkLocation(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Точки будут расположены на одной прямой.");
        } else {
            System.out.println("Точки не будут расположены на одной прямой.");
        }
    }

    public static boolean checkLocation(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3 || x1 == y1 && x2 == y2 && x3 == y3);
    }
}