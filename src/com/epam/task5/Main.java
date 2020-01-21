package com.epam.task5;

/* 5. Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc. */
public class Main {
    public static void main(String[] args) {
        int seconds = 9999;

        int h = seconds / 3600;
        int min = seconds % 3600 / 60;
        int sec = seconds % 3600 % 60;

        System.out.println(h + " ч " + min + " мин " + sec + " с ");
    }
}
