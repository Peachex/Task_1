package com.epam.task1;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Main {
    public static void main(String[] args) {
        int z = functionValue(4, 2, 3);
        System.out.println("z = " + z);
    }

    public static int functionValue(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }
}
