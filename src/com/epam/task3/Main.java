package com.epam.task3;

//( sin (x) + cos (y) ) / ( cos(x) - sin(y) ) * tg (x * y)
public class Main {
    public static void main(String[] args) {
        double r = exampleValue(1,1);
        System.out.println("result: " + r);
    }

    public static double exampleValue(int x, int y) {
        return ( ( Math.sin(x) + Math.cos(y) ) / ( Math.cos(x) - Math.sin(y) ) * Math.tan(x * y) );
    }
}
