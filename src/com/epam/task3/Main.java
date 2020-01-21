package com.epam.task3;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): ( sin (x) + cos (y) ) / ( cos(x) - sin(y) ) * tg (x * y)
public class Main {
    public static void main(String[] args) {
        double r = expressionValue(1,1);

        System.out.println("result: " + r);
    }

    public static double expressionValue(int x, int y) {
        return ( ( Math.sin(x) + Math.cos(y) ) / ( Math.cos(x) - Math.sin(y) ) * Math.tan(x * y) );
    }
}
