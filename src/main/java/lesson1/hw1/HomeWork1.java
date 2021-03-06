package lesson1.hw1;

import java.util.GregorianCalendar;

public class HomeWork1 {

    static double calculate(double a, double b, double c, double d) {
        // 1.0 / 0 = Infinity
        // 0.0 / 0 = NaN
        return  a * (b + (c / d));
    }

    static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    static void isLeap(int year) {
        boolean isLeap = new GregorianCalendar().isLeapYear(year);
        System.out.println(isLeap ? "Високосный" : "Обычный");
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 0, 0));
        sayHello("Mike");
        isLeap(2020);
        System.out.println("Lol");
    }

}
