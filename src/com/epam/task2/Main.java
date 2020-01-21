package com.epam.task2;

/*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):  ( b + ( (b ^ 2) + 4 * a * c ) ^ (1 / 2) ) / (2 * a) - (a ^ 3) * c + b ^ ( - 2 )*/
public class Main {
    public static void main(String[] args) {
        double r = expressionValue(1,1,0);

        System.out.println("result: " + r);
    }

    public static double  expressionValue(int a, int b, int c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}

