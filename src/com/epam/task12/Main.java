package com.epam.task12;

import java.util.Scanner;

/* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа. */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long result = 0;

        for (int i = 1; i < a; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
