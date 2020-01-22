package com.epam.task14;

// 3. Найти сумму квадратов первых ста чисел.
public class Main {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }

        System.out.println("Cумма квадратов первых ста чисел = " + result);
    }
}
