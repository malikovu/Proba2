package com.company;

public class Main {
    public static void main(String[] args) {
        double[] num = {1.1, 2.2, -3.3, 4.4, -5.5, 6.6, -7.7, 8.8, -9.9, 10.10, -11.11, 12.12, -13.13, 14.14, -15.15};
        double result = 0;
        int a = 0;
        boolean b = false;
        for (double names : num) {
            if (names > 0) {
                b = true;

            } else if (b) {
                result = +names;
                a++;
            }
        }
        System.out.println(result);
        System.out.println(a);
        System.out.println("arithematic mean" + result / a);

    }
}
