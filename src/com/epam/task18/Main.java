package com.epam.task18;

import java.util.Scanner;

/* 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите m, n: ");
        int m = in.nextInt(), n = in.nextInt();

        for (int i = m; i < n; i++) {
            if (i > 1) {
                System.out.print("\nДелители " + i + ": ");
                findDivider(i);
            }
        }
        System.out.println();
    }

    public static void findDivider(int number) {
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                flag = false;
            }
        }
        if (flag) {
            System.out.print("Нет делителей!");
        }
    }
}
