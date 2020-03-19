package com.epam.task19;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Main {
    public static void main(String[] args) {
        double number1 = 2010.9;
        double number2 = 2020.789;

        String stringNumber1 = Double.toString(number1), stringNumber2 = Double.toString(number2);

        System.out.println("Цифры, вхожящие как в " + number1 + " так и в " + number2 + " :");

        for (int i = 0; i < 10; i++) {
            if (stringNumber1.contains(Integer.toString(i)) && stringNumber2.contains(Integer.toString(i))) {
                System.out.println(i + " ");
            }
        }
    }
}
