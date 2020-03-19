package com.epam.task17;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Main {
    public static void main(String[] args) {
        for (char i = '0'; i >= '0' && i <= 'z'; i++) {
            System.out.println(i + " - " + (int) i);
        }
    }
}
