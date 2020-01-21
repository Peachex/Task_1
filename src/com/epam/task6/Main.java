package com.epam.task6;

/* 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае. Закрашенная область: x(-4;4), y(-3;0); x(-2;2), y(0;4). */
public class Main {
    public static void main(String[] args) {
        boolean flag = cheсkPoint(-4, -4);

        System.out.println(flag);
    }

    public static boolean cheсkPoint(double x, double y) {
        boolean flag;

        if ((((x <= 4) && (x >= -4)) && ((y <= 0) && (y >= -3))) || (((x <= 2) && (x >= -2)) && ((y <= 4) && (y >= 0)))) {
            flag = true;
        } else flag = false;

        return flag;
    }
}
