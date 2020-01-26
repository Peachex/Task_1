package com.epam.task17;

import java.util.Scanner;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (char i = '0'; i >= '0' && i <= 'z'; i++) {
            int charNumber = (int) i;
            System.out.println(i + " - " + charNumber);
        }
    }
}
