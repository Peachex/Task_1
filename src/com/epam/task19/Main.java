package com.epam.task19;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Main {
    public static void main(String[] args) {
        double number1 = 2010.9, number2 = 2020.789;

        String stringNumber1 = Double.toString(number1), stringNumber2 = Double.toString(number2);

        char[] charNumber1 = stringNumber1.toCharArray(), charNumber2 = stringNumber2.toCharArray();

        System.out.println("Цифры, вхожящие как в " + number1 + " так и в " + number2 + " :");

        for (int numeral = 48; numeral < 58; numeral++) {
            if (findCommon(charNumber1, numeral) && findCommon(charNumber2, numeral)) {
                System.out.println(numeral - 48);
            }
        }
    }

    public static boolean findCommon(char[] array, int numeral) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (numeral == array[i]) {
                flag = true;
            }
        }
        return flag;
    }
}
