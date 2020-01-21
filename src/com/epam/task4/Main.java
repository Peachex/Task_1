package com.epam.task4;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/
public class Main {
    public static void main(String[] args) {
        double number = changeParts(333.111);

        System.out.println(number);
    }

    public static double changeParts(double number) {
        int intPart = (int) number;

        int newIntPart = (int) (number * 1000 - intPart * 1000);

        double newDoublePart = (double) intPart / 1000;

        return (newIntPart + newDoublePart);
    }
}
